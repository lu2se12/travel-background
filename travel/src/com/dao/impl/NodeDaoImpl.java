package com.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dao.base.impl.BaseDaoImpl;
import com.dao.inter.NodeDao;
import com.model.Node;
@Repository
public class NodeDaoImpl extends BaseDaoImpl<Node> implements NodeDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> findByWayId(Long wayId) {
		String hql = "select n,a2n from Node n,Area2Node a2n where n.id = a2n.nodeId and a2n.wayId = "+wayId;
		return (List<Object[]>) super.findListObject(hql);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> findByWayArea(Long wayId, Long areaId) {
		String hql = "select n,a2n from Node n,Area2Node a2n where n.id = a2n.nodeId and a2n.wayId = "+wayId +" and a2n.areaId = "+areaId;
		return (List<Object[]>) super.findListObject(hql);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> findByAreaId(Long areaId) {
		String hql = "select n,a2n from Node n,Area2Node a2n where n.id = a2n.nodeId and a2n.areaId = "+areaId;
		return (List<Object[]>) super.findListObject(hql);
	}

}
