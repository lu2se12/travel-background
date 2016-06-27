package com.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.inter.AreaDao;
import com.dao.inter.NodeDao;
import com.dao.inter.WayDao;
import com.model.Area;
import com.model.Area2Node;
import com.model.Node;
import com.model.Way;
import com.model.Way2Area;
import com.service.inter.WayService;
import com.util.WayBean;
@Service(value="wayService")
public class WayServiceImpl implements WayService{
	
	@Autowired
	private WayDao wayDao;
	
	@Autowired
	private AreaDao areaDao;
	
	@Autowired
	private NodeDao nodeDao;
	
	@Override
	public List<Way> getAll() {
		return this.wayDao.getAll();
	}

	@Override
	public void save(Way way) {
		wayDao.save(way);
	}

	@Override
	public void update(Way way) {
		wayDao.update(way);
		
	}

	@Override
	public void delete(Way way) {
		wayDao.delete(way);
	}

	@Override
	public Way getById(Long wayId) {
		return wayDao.findById(wayId);
	}

	@Override
	public WayBean getWay(Long wayId) {
		//获取当前路线
		Way way = this.getById(wayId);
		//如果根据前台传来的ID查询不到路线  新建一个空对象返回
		if(way==null){
			return new WayBean();
		}
		//根据当前路线获取区域和区域路线关系表的集合（List<Object[]>）数组中第一个是区域 第二个是路线区域关系表
		List<Object[]> areaDataList = this.areaDao.findByWayId(way.getId());
		//根据当前路线获取景点和区域景点关系表的集合（List<Object[]>）数组中第一个是景点 第二个是区域景点关系表
		List<Object[]> nodeDataList = this.nodeDao.findByWayId(way.getId());
		
		//以下为制作区域集合和路线区域关系表的map
		
		//区域和路线区域关系表的map  key为区域ID value为关系表  这里需要用到关系表中的交通和第几天字段
		Map<Long,Way2Area> a2wMap = new HashMap<Long, Way2Area>();
		//区域的集合
		List<Area> areaList = new ArrayList<Area>();
		//根据数组集合开始循环
		for (Object[] obj : areaDataList) {
			//强制转换类型
			Area area = (Area) obj[0];
			//强制转换类型
			Way2Area w2a = (Way2Area) obj[1];
			//当前循环区域添加进区域集合
			areaList.add(area);
			//当前关机表添加进区域和路线区域关系表的map
			a2wMap.put(area.getId(), w2a);
		}
		
		//一下为制作区域和景点的map   景点和区域景点关系表的map  
		
		//景点和区域景点关系表的map   key为景点ID  value为区域景点关系表  主要用表中的交通和游玩时间字段
		Map<Long,Area2Node> n2aMap = new HashMap<Long, Area2Node>();
		//区域和景点的map  一对多的关系
		Map<Long,List<Node>> nodeMap = new HashMap<Long, List<Node>>();
		for (Object[] obj : nodeDataList) {
			//强制转换类型
			Node node = (Node) obj[0];
			//强制转换类型
			Area2Node a2n = (Area2Node) obj[1];
			
			//将当前区域景点关系表作为value  当前景点ID作为key存入景点和区域景点关系表的map中
			n2aMap.put(node.getId(), a2n);
			
			//首先根据当前区域ID获取区域和景点的map中的景点
			List<Node> temp = nodeMap.get(a2n.getAreaId());
			//如果为空  则新创建一个
			if(temp == null){
				temp = new ArrayList<Node>();
			}
			//将当期景点加入集合中
			temp.add(node);
			//将当前景点集合作为value  区域ID作为key 存入区域和景点的map中
			nodeMap.put(a2n.getAreaId(), temp);
		}
		
		WayBean wbean = new WayBean();
		wbean.setWay(way);
		wbean.setN2aMap(n2aMap);
		wbean.setAreaList(areaList);
		wbean.setA2wMap(a2wMap);
		wbean.setNodeMap(nodeMap);
		return wbean;
	}

	
}
