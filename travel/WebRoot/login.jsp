<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录</title>
    <link href="<%=path %>/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" type="text/css" href="css/login.css">
  </head>
  
  <body>
    <div class="header">
	<div class="header_common">
		<div class="header_inner">
			<div class="site_logo">
				<a>
					<img height="41" width="150" src="https://ssl1.tuniucdn.com/img/20141206/header/logo.png">
				</a>
			</div>
		</div>
	</div>
</div>
<div class="wrap" style="background-image:url(images/login.jpg);">
	<div id="content" class="content">
		<!-- <div id="cent_link" class="cent_link">
			<a id="link_3" href="http://www.tuniu.com/local" style="display:block;" target="_blank"></a>
		</div> -->
		<div id="login-content" class="login-content" style="background-color: #fff;">
			<div id="login-box" class="login-box-inner">
				<ul id="login-tab" class="login-tab">
					<li id="login-tab-user" class="cur">登录<b></b></li>
				</ul>
				<form id="loginForm">
					<input name="login_type" id="login_type" type="hidden" />
					<div class="login-tab-content" id="login-tab-content0">
						<table class="login-table">
							<tr id="line_1" class="line_1">
								<td>
									<div class="input_div" style="margin-top: 10px;">
										<input type="text" name="ucode" id="ucode" autocomplete="off" tabindex="1" class="txt txt-m" style="font-size:14px;margin-top:3px;" placeholder="用户名" />
									</div>
								</td>
							</tr>
							<tr id="line_2" class="line_2">
								<td>
									<div class="input_div" style="margin-top: 10px;">
										<input type="password" name="password" autocomplete="off" tabindex="2" class="txt txt-m" style="font-size:14px;margin-top:3px;" placeholder="密码" />
									</div>
								</td>
							</tr>
							<tr>
								<td class="line2">
									<button id="submit" tabindex="5" class="sub" style="margin-top: 20px;">登录</button>
								</td>
							</tr>

							<tr>
								<td class="cgrey2 line3 now_register">
									您还没有云南旅游网账号？
									<a href="#/register">立刻注册</a>
								</td>
							</tr>
						</table>
					</div>
				</form>
			</div>
		</div>
	</div>
</div>
		<script src="<%=path %>/js/jquery.min.js"></script>
		<script src="<%=path %>/js/bootstrap.min.js" type="text/javascript"></script>
        <script src="<%=path %>/js/plugins/jquery-validate/jquery.validate.min.js" type="text/javascript"></script>  
        <script src="<%=path %>/js/plugins/jquery-validate/messages_zh.js" type="text/javascript"></script>  
		<script>
			$("#loginForm").validate();
			$("#submit").on("click",function(){
				if($("#loginForm").valid()){
					$.ajax({
						url:"<%=path %>/index/doLogin.do",
						type:"post",
						dataType:"json",
						data:{ucode:$("#ucode").val(),password:$("#password").val()},
						success:function(data){
							if(data && data.code==0){
								window.location.href = "<%=path %>/index.jsp";
							}else{
								alert("登陆失败")
							}
						}
					})
				}
			})
		</script>
		</body>
</html>
