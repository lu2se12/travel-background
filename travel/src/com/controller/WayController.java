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

import com.model.Way;
import com.service.inter.WayService;
import com.util.SystemUtil;
import com.util.WayBean;
/**
 * 路线控制器
 * @author 段宝丹
 *
 */
@Controller
@RequestMapping("/way")
public class WayController {
	@Autowired
	private WayService wayService;
	/**
	 * 获取所有路线
	 * @param way
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/ways.do")
	public String ways(@ModelAttribute Way way,HttpServletRequest request,
			HttpServletResponse response){
		int code = 0;
		String msg = "获取数据成功";
		List<Way> wayList = new ArrayList<Way>();
		try {
			wayList = this.wayService.getAll();
		} catch (Exception e) {
			code = 1;
			msg = "获取数据失败";
			e.printStackTrace();
		}
		
		try {
			response.getWriter().print(SystemUtil.request(code, wayList, msg));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;		
	}
	
	
	/**
	 * 新增路线
	 * @param way
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/save.do")
	public String save(@ModelAttribute Way way,HttpServletRequest request,
			HttpServletResponse response){
		int code = 0;
		String msg = "保存成功";
		try {
			this.wayService.save(way);
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
	 * 修改路线
	 * @param way
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/update.do")
	public String update(@ModelAttribute Way way,HttpServletRequest request,
			HttpServletResponse response){
		int code = 0;
		String msg = "修改成功";
		try {
			this.wayService.update(way);
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
	 * 删除路线
	 * @param way
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/delete.do")
	public String delete(@ModelAttribute Way way,HttpServletRequest request,
			HttpServletResponse response){
		int code = 0;
		String msg = "删除成功";
		try {
			this.wayService.delete(way);
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
	
	/**
	 * 获取路线所有数据
	 * @param way
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/wayData.do")
	public String wayData(@ModelAttribute Way way,HttpServletRequest request,
			HttpServletResponse response){
		int code = 0;
		String msg = "获取数据成功";
		WayBean wbean = new WayBean();
		try {
			wbean = this.wayService.getWay(way.getId());
		} catch (Exception e) {
			code = 1;
			msg = "获取数据失败";
			e.printStackTrace();
		}
		
		try {
			response.getWriter().print(SystemUtil.request(code, wbean, msg));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;		
	}
}
