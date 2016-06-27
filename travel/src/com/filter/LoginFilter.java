package com.filter;
import java.io.IOException;

import javax.servlet.Filter; 
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.User;

public class LoginFilter implements Filter{
	private static String contextPath;
	private static final String ROOT_CONTEXT = "/";
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest servletRequest = (HttpServletRequest)request;
		HttpServletResponse servletResponse = (HttpServletResponse)response;
		HttpSession session = servletRequest.getSession();
		String uri = servletRequest.getContextPath()+"/"+getUri(servletRequest);
		
		/*if(uri.indexOf(servletRequest.getContextPath()+"/index/login.do")<0 && uri.indexOf(servletRequest.getContextPath()+"/index/doLogin.do")<0){
			User user = (User) session.getAttribute("user");
			if(user==null){
				servletResponse.sendRedirect(servletRequest.getContextPath());
				return ;
			}
		}*/
		
		chain.doFilter(servletRequest, servletResponse);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	
	private String getUri(HttpServletRequest request)
	{

		if (contextPath == null) contextPath = "" + request.getContextPath();
		String uri = request.getRequestURI();
		if (!(contextPath.equals(ROOT_CONTEXT))) uri = uri.replaceFirst(contextPath + "/", "");
		return uri;
	}
}
