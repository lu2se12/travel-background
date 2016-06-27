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

import com.model.Area;
import com.service.inter.AreaService;
import com.util.SystemUtil;
/**
 * 区域控制器
 * @author 段宝丹
 *
 */
@Controller
@RequestMapping("/area")
public class AreaController {
	@Autowired
	private AreaService areaService;
	/**
	 * 获取所有区域
	 * @param area
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/areas.do")
	public String areas(@ModelAttribute Area area,HttpServletRequest request,
			HttpServletResponse response){
		int code = 0;
		String msg = "获取数据成功";
		List<Area> areaList = new ArrayList<Area>();
		try {
			areaList = this.areaService.getAll();
		} catch (Exception e) {
			code = 1;
			msg = "获取数据失败";
			e.printStackTrace();
		}
		
		try {
			response.getWriter().print(SystemUtil.request(code, areaList, msg));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;		
	}
	
	
	/**
	 * 新增区域
	 * @param area
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/save.do")
	public String save(@ModelAttribute Area area,HttpServletRequest request,
			HttpServletResponse response){
		int code = 0;
		String msg = "保存成功";
		try {
			this.areaService.save(area);
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
	 * 修改区域
	 * @param area
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/update.do")
	public String update(@ModelAttribute Area area,HttpServletRequest request,
			HttpServletResponse response){
		int code = 0;
		String msg = "修改成功";
		try {
			this.areaService.update(area);
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
	 * 删除区域
	 * @param area
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/delete.do")
	public String delete(@ModelAttribute Area area,HttpServletRequest request,
			HttpServletResponse response){
		int code = 0;
		String msg = "删除成功";
		try {
			this.areaService.delete(area);
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
