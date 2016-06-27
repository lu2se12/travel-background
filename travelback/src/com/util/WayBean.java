package com.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.model.Area;
import com.model.Area2Node;
import com.model.Node;
import com.model.Way;
import com.model.Way2Area;

/**
 * 封装了一条线路所有信息的类
 * @author 段宝丹
 *
 *
 *页面输出时是这样的：
 * 1.   输出way（当前线路：线路名称描述等）
 * 2.   循环areaList（在页面上循环输出此字段，表示该线路下有几个区域（即第一天去哪第二天去哪））    输出区域信息
 * 3.   在循环时获取a2wMap中的信息 （a2wMap为区域和关系表的map。在循环区域的时候根据每一个区域ID在改变量中获取对应的交通工具，当前第几天）   输出交通工具，当前第几天
 * 4.   在循环时获取nodeMap中的景点集合 （nodeMap为区域和景点的map 在循环区域的时候根据每一个区域ID获取对应区域的景点集合）  
 * 5.   循环上一步取出来的景点集合（即对应该区域的景点）  输出景点信息
 * 6.   在循环景点时根据当前景点ID从n2aMap中取出区域景点关系表（交通工具，游玩时间）  输出游玩时间
 */
public class WayBean {
	//路线
	private Way way;
	//该路线对应的区域集合
	private List<Area> areaList = new ArrayList<Area>();
	//景点map   key为区域ID  value为景点集合
	private Map<Long,List<Node>> nodeMap = new HashMap<Long, List<Node>>();
	//路线区域关联表map  key为区域ID  value为关联表   主要取关联表中的交通和天数字段
	private Map<Long,Way2Area> a2wMap = new HashMap<Long, Way2Area>();
	//区域景点关联表map  key为景点ID  value为关联表  主要取交通和游玩时间字段
	private Map<Long,Area2Node> n2aMap = new HashMap<Long, Area2Node>();

	public Way getWay() {
		return way;
	}

	public void setWay(Way way) {
		this.way = way;
	}

	public List<Area> getAreaList() {
		return areaList;
	}

	public void setAreaList(List<Area> areaList) {
		this.areaList = areaList;
	}

	public Map<Long, List<Node>> getNodeMap() {
		return nodeMap;
	}

	public void setNodeMap(Map<Long, List<Node>> nodeMap) {
		this.nodeMap = nodeMap;
	}

	public Map<Long, Way2Area> getA2wMap() {
		return a2wMap;
	}

	public void setA2wMap(Map<Long, Way2Area> a2wMap) {
		this.a2wMap = a2wMap;
	}

	public Map<Long, Area2Node> getN2aMap() {
		return n2aMap;
	}

	public void setN2aMap(Map<Long, Area2Node> n2aMap) {
		this.n2aMap = n2aMap;
	}
	
}
