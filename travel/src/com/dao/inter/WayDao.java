package com.dao.inter;

import java.util.List;

import com.dao.base.inter.BaseDao;
import com.model.Way;

public interface WayDao extends BaseDao<Way>{

	public List<Way> getAll();
}
