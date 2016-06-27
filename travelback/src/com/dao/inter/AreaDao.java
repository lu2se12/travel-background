package com.dao.inter;

import java.util.List;

import com.dao.base.inter.BaseDao;
import com.model.Area;

public interface AreaDao extends BaseDao<Area>{
	/**
	 * 根据路线ID查询区域
	 * 通过way2area关联表查询
	 * @param wayId
	 * @return	 返回为一个数组集合   数组中第一个是区域  第二个是路线区域关联表
	 */
	public List<Object[]> findByWayId(Long wayId);
}
