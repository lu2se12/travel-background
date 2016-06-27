package com.service.inter;

import java.util.List;

import com.model.Way;
import com.util.WayBean;

public interface WayService {

	public List<Way> getAll();

	public void save(Way way);

	public void update(Way way);
	
	public void delete(Way way);
	
	public Way getById(Long wayId);
	/**
	 * 根据ID获取一条线路的所有信息
	 * WayBean为线路信息类
	 * 页面输出时是这样的：
	 * 1.   输出way（当前线路：线路名称描述等）
	 * 2.   循环areaList（在页面上循环输出此字段，表示该线路下有几个区域（即第一天去哪第二天去哪））    输出区域信息
	 * 3.   在循环时获取a2wMap中的信息 （a2wMap为区域和关系表的map。在循环区域的时候根据每一个区域ID在改变量中获取对应的交通工具，当前第几天）   输出交通工具，当前第几天
	 * 4.   在循环时获取nodeMap中的景点集合 （nodeMap为区域和景点的map 在循环区域的时候根据每一个区域ID获取对应区域的景点集合）  
	 * 5.   循环上一步取出来的景点集合（即对应该区域的景点）  输出景点信息
	 * 6.   在循环景点时根据当前景点ID从n2aMap中取出区域景点关系表（交通工具，游玩时间）  输出游玩时间
	 * 
	 * @param wayId
	 * @return
	 */
	public WayBean getWay(Long wayId); 
}
