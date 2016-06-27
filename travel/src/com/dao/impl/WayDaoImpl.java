package com.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dao.base.impl.BaseDaoImpl;
import com.dao.inter.WayDao;
import com.model.Way;
@Repository
public class WayDaoImpl extends BaseDaoImpl<Way> implements WayDao{

	@Override
	public List<Way> getAll() {
		return this.findAll();
	}
}
