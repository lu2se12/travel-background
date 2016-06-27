package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.inter.AreaDao;
import com.model.Area;
import com.service.inter.AreaService;
@Service(value="areaService")
public class AreaServiceImpl implements AreaService{
	@Autowired
	private AreaDao areaDao;
	
	@Override
	public List<Area> getAll() {
		return areaDao.findAll();
	}

	@Override
	public void save(Area area) {
		areaDao.save(area);
	}

	@Override
	public void update(Area area) {
		areaDao.update(area);
	}

	@Override
	public void delete(Area area) {
		areaDao.delete(area);
	}

}
