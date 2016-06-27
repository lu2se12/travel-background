package com.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.User;
import com.service.inter.UserService;
import com.util.SystemUtil;
/**
 * 登录登出和首页的控制器
 * @author 段宝丹
 *
 */
@Controller
@RequestMapping("/index")
public class IndexController {
	//利用spring获取用户的service
	@Autowired
	private UserService userService;
	
	/* 点击登录按钮进行的登录操作
	 * @param user	spring将账号密码等登录信息存入user对象中 （前台登录密码字段必须和user中的一致）
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/doLogin.do")
	public String doLogin(@ModelAttribute User user,HttpServletRequest request,
			HttpServletResponse response){
		//操作状态  默认为0  表示成功
		int code = 0;
		//操作提示信息
		String msg = "登陆成功";
		try {
			//根据前台传进来的账号密码查询数据库中有没有记录
			User u = userService.findByLogin(user);
			if(u==null){
				//如果有  将操作状态设置为1  表示登录失败
				code = 1;
			}else{
				//否则将用户存入session中
				request.getSession().setAttribute("user", u);
				//将当前时间转换为年月日时分秒的格式存入session中
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				request.getSession().setAttribute("login-time", sdf.format(new Date()));
			}
		} catch (Exception e) {
			//如果报错  将操作状态设置为1
			code = 1;
			//提示信息
			msg = "登陆失败";
			//打印错误
			e.printStackTrace();
		}
		//将操作状态和提示信息通过SystemUtil工具包装一下发送到前台页面
		try {
			response.getWriter().print(SystemUtil.request(code, null, msg));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;		
	}
	/**
	 * 登出页面
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/logout.do")
	public String logout(HttpServletRequest request,
			HttpServletResponse response){
		//操作状态
		int code = 0;
		response.setContentType("text/javascript charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		try {
			//直接将session中的用户和登录时间设置为空
			request.getSession().setAttribute("user",null);
			request.getSession().setAttribute("login-time",null);
		} catch (Exception e) {
			code = 1;
			e.printStackTrace();
		}
		//将操作状态返回到前台页面
		try {
			response.getWriter().print(SystemUtil.request(code, null, null));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;		
	}
	/**
	 * 登录页
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/login.do")
	public String login(HttpServletRequest request,
			HttpServletResponse response){
		//直接返回到登录页
		return "login";
	}
}
