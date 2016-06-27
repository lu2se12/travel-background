package com.dao.inter;

import java.util.List;

import com.dao.base.inter.BaseDao;
import com.model.Node;

public interface NodeDao extends BaseDao<Node>{
	/**
	 * 根据路线ID查询所有景点
	 * 某个路线下的所有景点
	 * @param wayId
	 * @return
	 */
	public List<Object[]> findByWayId(Long wayId);
	/**
	 * 根据路线ID和区域ID查询对应的节点
	 * 某个路线下某个区域（某一天）的景点
	 * @param wayId
	 * @param areaId
	 * @return
	 */
	public List<Object[]> findByWayArea(Long wayId,Long areaId);
	/**
	 * 根据区域ID查询景点
	 * 跨路线查询： 如果一个区域被两条路线所用该查询会查询出这两条路线中该区域的所有景点
	 * @param areaId
	 * @return
	 */
	public List<Object[]> findByAreaId(Long areaId);
	
}  
