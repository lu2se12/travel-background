package com.service.inter;

import java.util.List;

import com.model.Node;

public interface NodeService {
	
	public List<Node> getAll();
	
	public void save(Node node);
	
	public void update(Node node);
	
	public void delete(Node node);
}
