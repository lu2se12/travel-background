package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Node;
import com.model.User;
import com.service.inter.NodeService;
import com.util.SystemUtil;
/**
 * 景点控制器
 * @author 段宝丹
 *
 */
@Controller
@RequestMapping("/node")
public class NodeController {
	@Autowired
	private NodeService nodeService;
	/**
	 * 获取所有景点
	 * @param node
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/nodes.do")
	public String nodes(@ModelAttribute Node node,HttpServletRequest request,
			HttpServletResponse response){
		int code = 0;
		String msg = "获取数据成功";
		List<Node> nodeList = new ArrayList<Node>();
		try {
			nodeList = this.nodeService.getAll();
		} catch (Exception e) {
			code = 1;
			msg = "获取数据失败";
			e.printStackTrace();
		}
		
		try {
			response.getWriter().print(SystemUtil.request(code, nodeList, msg));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;		
	}
	
	
	/**
	 * 新增景点
	 * @param node
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/save.do")
	public String save(@ModelAttribute Node node,HttpServletRequest request,
			HttpServletResponse response){
		int code = 0;
		String msg = "保存成功";
		try {
			this.nodeService.save(node);
		} catch (Exception e) {
			code = 1;
			msg = "保存失败";
			e.printStackTrace();
		}
		
		try {
			response.getWriter().print(SystemUtil.request(code, null, msg));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;		
	}
	
	/**
	 * 修改景点
	 * @param node
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/update.do")
	public String update(@ModelAttribute Node node,HttpServletRequest request,
			HttpServletResponse response){
		int code = 0;
		String msg = "修改成功";
		try {
			this.nodeService.update(node);
		} catch (Exception e) {
			code = 1;
			msg = "修改失败";
			e.printStackTrace();
		}
		
		try {
			response.getWriter().print(SystemUtil.request(code, null, msg));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;		
	}
	
	/**
	 * 删除景点
	 * @param node
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/delete.do")
	public String delete(@ModelAttribute Node node,HttpServletRequest request,
			HttpServletResponse response){
		int code = 0;
		String msg = "删除成功";
		try {
			this.nodeService.delete(node);
		} catch (Exception e) {
			code = 1;
			msg = "删除失败";
			e.printStackTrace();
		}
		
		try {
			response.getWriter().print(SystemUtil.request(code, null, msg));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;		
	}
}
