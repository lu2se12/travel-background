package com.service.inter;

import java.util.List;

import com.model.Area;

public interface AreaService {
	
	public List<Area> getAll();
	
	public void save(Area area);
	
	public void update(Area area);
	
	public void delete(Area area);
}
