package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.inter.NodeDao;
import com.model.Node;
import com.service.inter.NodeService;
@Service(value="nodeService")
public class NodeServiceImpl implements NodeService{
	@Autowired
	private NodeDao nodeDao;
	@Override
	public List<Node> getAll() {
		return nodeDao.findAll();
	}

	@Override
	public void save(Node node) {
		nodeDao.save(node);
	}

	@Override
	public void update(Node node) {
		nodeDao.update(node);
	}

	@Override
	public void delete(Node node) {
		nodeDao.delete(node);
	}

}
