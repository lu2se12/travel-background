<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<div id="back_to_top" class="font_wryh">
	<div class="quick_flower">
        <a href="#flow1" class="flow F1">1F</a>
        <a href="#flow2" class="flow F2">2F</a>
        <a href="#flow3" class="flow F3">3F</a>
        <!-- <a href="#flow4" class="flow F4">4F</a>
        <a href="#flow5" class="flow F5">5F</a>
        <a href="#flow6" class="flow F6">6F</a> -->
        <a href="#" class="backto backshow"></a>
    </div>
</div>
<div class="wrapper topbox">
	<div class="wrap-inbox topinbox">
    	<div class="logo_line cf">
<!--         	<div class="fl logobox"><a href="index.html"><img src="images/zx_logo.png" alt="èè¡ç½" width="150" /></a></div>
 -->        	<div class="fl searchbox cf">
            	<input type="text" class="search-input fl" value="查询旅游景点" onfocus="if(this.value=='查询旅游景点'){this.value='';}" onblur="if(this.value==''){this.value='查询旅游景点';}" /> 
                <div class="search-btn fl">首页</div>
            </div>
       	  <div class="fr grinfobox cf">
            	<!-- <div class="grinfo-photo fl"><img src="images/photo.png" width="50" height="50" /><span></span></div> -->
                <div class="fl grinfo-txt"><a href="login.jsp">登录</a><span>|</span><a href="javascript:void(0);">注册</a></div>
          </div>
        </div>
    	<div class="menu_line">
        	<div class="fl menu_fl">全部景点
            	<div class="allflbox" style="display: none;">
                	<ul>
                        <li id="zz_show">
                            <a href="javascript:void(0)">短期出行<i>></i></a>
                            <div class="zz_listbox" id="zz_list" style="display: none;">
                                    <h5>
                                        <a href="javascript:void(0);">è¯­æ</a><span>|</span>
                                        <a href="javascript:void(0);">æ°å­¦</a><span>|</span> 
                                        <a href="javascript:void(0);">è±è¯­</a><span>|</span>
                                        <a href="javascript:void(0);">å¬å±èºæ¯</a><span>|</span>
                                        <a href="javascript:void(0);">äººæç´ å»</a>
                                    </h5>
                                    <div class="arrowleft"></div>
                             </div>
                          </li>
                        <li id="gz_show">
                            <a href="javascript:void(0);">长期出行<i>></i></a>
                            <div class="zz_listbox gz_hei" id="gz_list" style="display: none;">
                                    <h5>
                                        <a href="javascript:void(0);">å¤§å­¦è¯­æ</a><span>|</span>
                                        <a href="javascript:void(0);">é«ç­æ°å­¦</a><span>|</span> 
                                        <a href="javascript:void(0);">é«èè±è¯­</a><span>|</span>
                                        <a href="javascript:void(0);">åºç¨åä½</a><span>|</span>
                                        <a href="javascript:void(0);">å¤§å­¦çå¿çå¥åº·æç¨</a>
                                    </h5>
                                    <div class="gzarrow"></div>
                             </div>
                          </li>
                    </ul>
                </div>
            </div>
            <div class="menu_text fl">
                <ul>
                    <li><a href="index.html" class="nac-color">首页</a></li>
                    <li id="zylist">
                        <a href="###">热门景点</a>
                        <div class="zylistbox" style="display: none;">
                            <a href="javascript:void(0);">丽江</a>|
                            <a href="javascript:void(0);">大理</a>|
                            <a href="javascript:void(0);">西双版纳</a>|
                            <a href="javascript:void(0);">昆明</a>|
                            <a href="javascript:void(0);">香格里拉</a>|
                            <a href="javascript:void(0);">双廊</a>|
                            <a href="javascript:void(0);">腾冲</a>
                            <div class="arrowred"></div>
                        </div>
                    </li>
                    <li><a href="javascript:void(0);">在线选购</a></li>
                    <li><a href="school.html">路线管理</a></li>
                    <li><a href="javascript:void(0);">商品管理</a></li>
                    <li><a href="teach.html">用户列表</a></li>
                </ul>    
            </div>                        
        </div>
    </div>
</div>