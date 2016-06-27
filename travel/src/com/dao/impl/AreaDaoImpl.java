package com.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dao.base.impl.BaseDaoImpl;
import com.dao.inter.AreaDao;
import com.model.Area;
@Repository
public class AreaDaoImpl extends BaseDaoImpl<Area> implements AreaDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> findByWayId(Long wayId) {
		String hql = "select area,w2a from Area area,Way2Area w2a where area.id = w2a.areaId and w2a.wayId = "+wayId;
		return (List<Object[]>) super.findListObject(hql);
	}

}
