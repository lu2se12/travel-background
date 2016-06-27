<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>旅游网</title>
<link href="css/base.css" rel="stylesheet" type="text/css" />
<link href="css/top-menu.css" rel="stylesheet" type="text/css" />
<link href="css/home.css" rel="stylesheet" type="text/css" />
<link href="css/inner.css" rel="stylesheet" type="text/css" />
<link href="css/footer.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-1.8.min.js"></script>
<script type="text/javascript" src="js/jquery.flash.js"></script>

</head>

<body>
<jsp:include  page="menu.jsp"/>
<div class="wrapper">
	<div id="banner_tabs" class="flexslider" style="height:540px">
        <ul class="slides">
            <li style="position: relative;">
                <a title="" target="_blank" href="javascript:void(0);">
                    <img alt="" style="background: url(images/banner1.jpg) no-repeat center;height:540px;" src="images/alpha.png">
                </a>
            </li>
          <li>
                <a title="" href="javascript:void(0);">
                    <img alt="" style="background: url(images/banner3.jpg) no-repeat center;height:540px" src="images/alpha.png">
                </a>
            </li>
            <li>
                <a title="" href="javascript:void(0);">
                    <img alt="" style="background: url(images/banner0.jpg) no-repeat center;height:540px" src="images/alpha.png">
                </a>
            </li>
        </ul>
        <ul class="flex-direction-nav">
            <li><a class="flex-prev" href="javascript:;">Previous</a></li>
            <li><a class="flex-next" href="javascript:;">Next</a></li>
        </ul>
        <div class="banner_dot">
                <ol id="bannerCtrl" class="flex-control-nav flex-control-paging">
                    <li class="active"><a>1</a></li>
                    <li><a>2</a></li>
                    <li><a>3</a></li>
                </ol>
        </div>
    </div>
</div>
<a name="flow1"></a>
<div class="wrapper">
	<div class="wrap-inboxkc publicbox">
   	  <div class="public-title"><b>1F</b>热门景点</div>
        <div class="content">
        <div class="drama-poster" id="kcbg">
            <ul>
           	  <li class="kccol_hei show-poster-3 current">
                <div class="kc_pic"><a href="class-video.html" target="_blank"><img src="images/book/kc-1.jpg" width="311" height="190" /></a></div>
                <div class="kc_title"><a href="class-video.html" target="_blank">公共艺术（美术篇）</a></div>
                <p>课程评分：8.0<img src="images/star_on.png" width="15" height="14" /><img src="images/star_on.png" width="15" height="14" /><img src="images/star_on.png" width="15" height="14" /><img src="images/star_on.png" width="15" height="14" /><img src="images/star_off.png" width="15" height="14" /><br />
                主讲人：张少帅
                <a href="class-video.html" class="fontxq fr" target="_blank">查看详情></a>
                </p>
              </li>
           	  <li class="kccol_hei show-poster-3">
                <div class="kc_pic"><a href="class-video-1.html" target="_blank"><img src="images/book/kc-2.jpg" width="311" height="190" /></a></div>
                <div class="kc_title"><a href="class-video-1.html" target="_blank">数学基础模块（上册）</a></div>
                <p>课程评分：8.0<img src="images/star_on.png" width="15" height="14" /><img src="images/star_on.png" width="15" height="14" /><img src="images/star_on.png" width="15" height="14" /><img src="images/star_on.png" width="15" height="14" /><img src="images/star_off.png" width="15" height="14" /><br />
                主讲人：蔡龙生
                <a href="class-video-1.html" class="fontxq fr" target="_blank">查看详情></a>
                </p>
              </li>
           	  <li class="kccol_hei show-poster-3">
                <div class="kc_pic"><a href="class-video-2.html" target="_blank"><img src="images/book/kc-3.jpg" width="312" height="190" /></a></div>
                <div class="kc_title"><a href="class-video-2.html" target="_blank">语文基础模块（上册）</a></div>
                <p>课程评分：8.0<img src="images/star_on.png" width="15" height="14" /><img src="images/star_on.png" width="15" height="14" /><img src="images/star_on.png" width="15" height="14" /><img src="images/star_on.png" width="15" height="14" /><img src="images/star_off.png" width="15" height="14" /><br />
                主讲人：张骞
                <a href="class-video-2.html" class="fontxq fr" target="_blank">查看详情></a>
                </p>
              </li>
           	  <li class="kccol_hei show-poster-3">
                <div class="kc_pic"><a href="class-video-3.html" target="_blank"><img src="images/book/kc-4.jpg" width="311" height="190" /></a></div>
                <div class="kc_title"><a href="class-video-3.html" target="_blank">英语基础模块（上册）</a></div>
                <p>课程评分：8.0<img src="images/star_on.png" width="15" height="14" /><img src="images/star_on.png" width="15" height="14" /><img src="images/star_on.png" width="15" height="14" /><img src="images/star_on.png" width="15" height="14" /><img src="images/star_off.png" width="15" height="14" /><br />
                主讲人：孙涛
                <a href="class-video-3.html" class="fontxq fr" target="_blank">查看详情></a>
                </p>
              </li>
           	  <li class="kccol_hei show-poster-3">
                <div class="kc_pic"><a href="javascript:void(0)"><img src="images/book/kc-5.jpg" width="311" height="190" /></a></div>
                <div class="kc_title"><a href="javascript:void(0)">电工基础</a></div>
                <p>课程评分：8.0<img src="images/star_on.png" width="15" height="14" /><img src="images/star_on.png" width="15" height="14" /><img src="images/star_on.png" width="15" height="14" /><img src="images/star_on.png" width="15" height="14" /><img src="images/star_off.png" width="15" height="14" /><br />
                主讲人：高恒
                <a href="javascript:void(0)" class="fontxq fr">查看详情></a>
                </p>
              </li>
            </ul>
        </div>
        
        <ul class="drama-slide">
            <li class="prev"><a href="javascript:void(null)" title="上翻">上翻</a></li>
            <li class="next"><a href="javascript:void(null)" title="下翻">下翻</a></li>
        </ul>
    
    </div>
        <a class="publicmore" href="class.html" target="_blank">More</a>
    </div>
</div>
<a name="flow2"></a>
<div class="wrapper zytjbg">
	<div class="wrap-inboxkc publicbox">
   	  <div class="public-title"><b>2F</b>不可错过</div>                                                       
      	<div class="zyfutitle">
        	<!-- <ul class="cf">
                <li class="cur" attr="1">微课堂</li>
                <li attr="2">课程标准</li>
                <li attr="3">教学设计</li>
                <li attr="4">教学课件</li>
                <li attr="5">课堂实录</li>
                <li attr="6">虚拟实训</li>
                <li attr="7">学习测评</li>
            </ul> -->
        </div>
        <div class="cf zytjlist" id="zytj1">
        <div class="content1">
        <div class="drama-poster1">
            <ul id="zybg">
           	  <li class="zytjcol_hei show-poster-3 current1">
                <div class="res-bg">
                    <p><a href="video-3.html" target="_blank"><img src="images/book/wk-3.jpg" width="291" height="178"></a></p>
                    <p><a href="video-3.html" target="_blank"><span class="push-right">评分：<b>4.8</b>分</span>集合的概念</a></p>
                </div> 
              </li>
           	  <li class="zytjcol_hei show-poster-3">
                <div class="res-bg">
                    <p><a href="video-4.html" target="_blank"><img src="images/book/wk-2.jpg" width="291" height="178"></a></p>
                    <p><a href="video-4.html" target="_blank"><span class="push-right">评分：<b>4.8</b>分</span>电子技术基础与技能-拆焊过程</a></p>
                </div> 
              </li>
           	  <li class="zytjcol_hei show-poster-3">
                <div class="res-bg">
                    <p><a href="javascript:void(0)"><img src="images/book/wk-4.jpg" width="291" height="178"></a></p>
                    <p><a href="javascript:void(0)"><span class="push-right">评分：<b>4.9</b>分</span>定冠词与不定冠词的使用</a></p>
                </div> 
              </li>
           	  <li class="zytjcol_hei show-poster-3">
              	<div class="res-bg">
                    <p><a href="video-5.html" target="_blank"><img src="images/book/wk-5.png" width="291" height="178"></a></p>
                    <p><a href="video-5.html" target="_blank"><span class="push-right">评分：<b>4.8</b>分</span>趣味数学</a></p>
                </div> 
              </li>
            </ul>
        </div>
        
        <ul class="drama-slide1">
            <li class="prev"><a href="javascript:void(null)" title="上翻">上翻</a></li>
            <li class="next"><a href="javascript:void(null)" title="下翻">下翻</a></li>
        </ul>
    
    </div>        	
        </div>
        <a class="publicmore" href="resources.html" target="_blank">More</a>
    </div>
</div>
<a name="flow3"></a>
<div class="wrapper">
	<div class="wrap-inbox publicbox">
   	  <div class="public-title"><b>3F</b>地道美食</div>
        <div class="column5 cf xqzthover" id="xqzt1">
        	<ul>
           	  <a href="introduction.html" target="_blank"><li><div class="qylogohover" style="display:none;">中电普华</div><div class="xqztimg"><span></span><img src="images/pics/qy-0.jpg" width="140" /></div></li></a>
                  <a href="javascript:void(0);"><li><div class="qylogohover" style="display:none;">百度</div><div class="xqztimg"><span></span><img src="images/pics/qy-1.jpg" width="141" height="73" /></div></li></a>
                  <a href="javascript:void(0);"><li><div class="qylogohover" style="display:none;">超市发</div><div class="xqztimg"><span></span><img src="images/pics/qy-2.jpg" width="141" height="60" /></div></li></a>
                  <a href="http://www.zhangyiyuan.net/main.php?optionid=28"><li><div class="qylogohover" style="display:none;">交通银行</div><div class="xqztimg"><span></span><img src="images/pics/qy-3.jpg" width="153" height="81" /></div></li></a>
                  <a href="javascript:void(0);"><li style="margin-right:0px;"><div class="qylogohover" style="display:none;">京东</div><div class="xqztimg"><span></span><img src="images/pics/qy-4.jpg" width="150" height="41" /></div></li></a>
                  <a href="introduction.html"><li><div class="qylogohover" style="display:none;">去哪网</div><div class="xqztimg"><span></span><img src="images/pics/qy-5.jpg" width="100" /></div></li></a>
                  <a href="javascript:void(0);"><li><div class="qylogohover" style="display:none;">人人车</div><div class="xqztimg"><span></span><img src="images/pics/qy-6.jpg" width="141" height="73" /></div></li></a>
                  <a href="javascript:void(0);"><li><div class="qylogohover" style="display:none;">世行国际</div><div class="xqztimg"><span></span><img src="images/pics/qy-7.jpg" width="141" height="60" /></div></li></a>
                  <a href="http://www.zhangyiyuan.net/main.php?optionid=28"><li><div class="qylogohover" style="display:none;">无忧英语</div><div class="xqztimg"><span></span><img src="images/pics/qy-8.jpg" width="153" height="81" /></div></li></a>
                  <a href="javascript:void(0);"><li style="margin-right:0px;"><div class="qylogohover" style="display:none;">学而思</div><div class="xqztimg"><span></span><img src="images/pics/qy-9.jpg" width="150" height="41" /></div></li></a>
            </ul>
        </div>
       
        <a class="publicmore" href="school.html" target="_blank">More</a>
    </div>
</div>
<!-- <a name="flow4"></a>
<div class="wrapper sqxxqbg">
	<div class="wrap-inbox publicbox">
   	  <div class="public-title"><b>4F</b>社区学习</div>
      	<div class="sqxxqtitle">
        	<ul class="cf">
                <li class="cur" attr="1">最新班级</li>
                <li attr="2">学员排名</li>
                <li attr="3">专题讨论圈</li>
            </ul>
        </div>
        <div class="column_gy sqxxqhover cf" id="sqxxq1">
        	<ul id="sqbg">
           	  <li class="sqxxqcol_hei">
              	<div class="sqxxq_tjimg cf">
                	<div class="sqxxq_imgbox fl"><a href="javascript:void(0);"><img src="images/pics/sqxxq_1.png" width="82" height="82"></a></div>
                    <div class="zytj_tjtxt fl">
                    	<h2><a href="javascript:void(0);">重庆市渝北区职教中心</a></h2>
                        <p>重庆市渝北职业教育中心创办于1990年，是首批国家中等职业教育改革发展示范学校。</p>
                    </div>
                </div>
                <div class="sqxxq_more">
                	<a href="javascript:void(0);">查看详情</a>
                    <p><img src="images/pics/sqxxq_4.png" width="17" height="15" />2460人加入</p>
                </div>
              </li>
           	  <li class="sqxxqcol_hei">
              	<div class="sqxxq_tjimg cf">
                	<div class="sqxxq_imgbox fl"><a href="javascript:void(0);"><img src="images/pics/sqxxq_2.png" width="82" height="82"></a></div>
                    <div class="zytj_tjtxt fl">
                    	<h2><a href="javascript:void(0);">北京商贸学校</a></h2>
                        <p>北京商贸学校是一所隶属北京市教委、北京市二商集团总公司双重领导，集全日制教育、成人继续...</p>
                    </div>
                </div>
                <div class="sqxxq_more">
                	<a href="javascript:void(0);">查看详情</a>
                    <p><img src="images/pics/sqxxq_4.png" width="17" height="15" />2460人加入</p>
                </div>
              </li>
           	  <li class="sqxxqcol_hei" style="margin-right:0px;width: 312px;">
              	<div class="sqxxq_tjimg cf">
                	<div class="sqxxq_imgbox fl"><a href="javascript:void(0);"><img src="images/pics/sqxxq_3.png" width="82" height="82"></a></div>
                    <div class="zytj_tjtxt fl">
                    	<h2><a href="javascript:void(0);">重庆市渝北区职教中心</a></h2>
                        <p>学校在“愉快，希望”办学理念指导下形成了 “创业教育、自主管理、社会实践”特色。</p>
                    </div>
                </div>
                <div class="sqxxq_more">
                	<a href="javascript:void(0);">查看详情</a>
                    <p><img src="images/pics/sqxxq_4.png" width="17" height="15" />2460人加入</p>
                </div>
              </li>
            </ul>
        </div>
        <a class="sqxxoumore" href="javascript:void(0);">More</a>
    </div>
</div>
<a name="flow5"></a>
<div class="wrapper">
	<div class="wrap-inbox publicbox">
   	  <div class="public-title"><b>5F</b>教材速递</div>
        <div class="coljcsd cf" id="xqzt1">
        	<ul id="jcbg">
           	  <li class="jcsdcol_hei">
              	<div class="jcsd_tjimg cf">
                	<div class="jcsd_imgbox fl"><a href="teach-name.html" target="_blank"><img src="images/book/book-chinese.png" width="80" height="100" alt="中职-语文基础模块上册"></a></div>
                    <div class="jcsd_tjtxt fl">
                    	<h2><a href="teach.html" target="_blank">中职-语文基础模块上册</a></h2>
                        <p>中等职业教育课程改革国家规划新教材《语文·基础模块》上、下册于2009年6月问世以来，受到...</p>
                        <a href="teach-name.html" class="fontxqzy" target="_blank">查看详情&gt;</a>
                    </div>
                </div>
              </li>
           	  <li class="jcsdcol_hei">
              	<div class="jcsd_tjimg cf">
                	<div class="jcsd_imgbox fl"><a href="javascript:void(0);"><img src="images/pics/jcsd_2.png" width="80" height="100" alt="高等数学"></a></div>
                    <div class="jcsd_tjtxt fl">
                    	<h2><a href="javascript:void(0);">高职英语1</a></h2>
                        <p>《高职英语1》力图囊括高职学生毕业后在实际工作中可能用上的英语，力求以更多的、较为实际……</p>
                        <a href="javascript:void(0);" class="fontxqzy">查看详情&gt;</a>
                    </div>
                </div>
              </li>
           	  <li class="jcsdcol_hei" style="margin-right:0px;width: 312px;">
              	<div class="jcsd_tjimg cf">
                	<div class="jcsd_imgbox fl"><a href="javascript:void(0);"><img src="images/pics/jcsd_3.png" width="80" height="100" alt="高等数学"></a></div>
                    <div class="jcsd_tjtxt fl">
                    	<h2><a href="javascript:void(0);">高职英语2</a></h2>
                        <p>《高职英语2》力图囊括高职学生毕业后在实际工作中可能用上的英语，力求以更多的、较为实际……  </p>
                        <a href="javascript:void(0);" class="fontxqzy">查看详情&gt;</a>
                    </div>
                </div>
              </li>
           	  <li class="jcsdcol_hei">
              	<div class="jcsd_tjimg cf">
                	<div class="jcsd_imgbox fl"><a href="javascript:void(0);"><img src="images/pics/jcsd_4.png" width="80" height="100" alt="高等数学"></a></div>
                    <div class="jcsd_tjtxt fl">
                    	<h2><a href="javascript:void(0);">高等数学</a></h2>
                        <p>电工操作基本常识（实训室的认识、接地装置的制作和安装、常用仪表的选择与使用）……</p>
                        <a href="javascript:void(0);" class="fontxqzy">查看详情&gt;</a>
                    </div>
                </div>
              </li>
           	  <li class="jcsdcol_hei">
              	<div class="jcsd_tjimg cf">
                	<div class="jcsd_imgbox fl"><a href="javascript:void(0);"><img src="images/pics/jcsd_5.png" width="80" height="100" alt="高等数学"></a></div>
                    <div class="jcsd_tjtxt fl">
                    	<h2><a href="javascript:void(0);">高职英语1</a></h2>
                        <p>《高职英语1》力图囊括高职学生毕业后在实际工作中可能用上的英语，力求以更多的、较为实际……</p>
                        <a href="javascript:void(0);" class="fontxqzy">查看详情&gt;</a>
                    </div>
                </div>
              </li>
           	  <li class="jcsdcol_hei" style="margin-right:0px;width: 312px;">
              	<div class="jcsd_tjimg cf">
                	<div class="jcsd_imgbox fl"><a href="javascript:void(0);"><img src="images/pics/jcsd_6.png" width="80" height="100" alt="高等数学"></a></div>
                    <div class="jcsd_tjtxt fl">
                    	<h2><a href="javascript:void(0);">高职英语2</a></h2>
                        <p>《高职英语2》力图囊括高职学生毕业后在实际工作中可能用上的英语，力求以更多的、较为实际……  </p>
                        <a href="javascript:void(0);" class="fontxqzy">查看详情&gt;</a>
                    </div>
                </div>
              </li>
            </ul>
        </div>
        <a class="publicmore" href="teach.html" target="_blank">More</a>
    </div>
</div>
<a name="flow6"></a>
<div class="wrapper newsbg">
	<div class="wrap-inbox newsbox">
   	  <div class="public-title"><b>6F</b>职教动态</div>
        <div class="colnews cf">
        	<ul>
           	  <li class="newscol_hei" id="news1">
              	<a href="javascript:void(0);" class="news1"></a>
              	<div class="newstitle">
                    <ul class="cf">
                        <li class="cur" attr="1">职教新闻</li>
                        <li attr="2">企业新闻</li>
                    </ul>
                </div>
                <div class="newshover cf" id="newstitle1">
                    <div class="news_tjimg cf">
                        <div class="news_imgbox fl"><a href="news.html" target="_blank"><img src="images/book/news.jpg" width="120" height="80"></a></div>
                        <div class="news_tjtxt fl">
                            <h2><a href="news.html" target="_blank">李克强：既要保障教育公平又要提升教育质量</a></h2>
                            <p>“我在贵州一个村寨看到，虽然破旧贫穷，但老百姓... <a href="news.html" class="fontxqzy" target="_blank">[详细]</a></p>
                        </div>
                    </div>
                    <div class="newslist">
                        <ul>
                            <li class="pos"><a href="news-1.html" target="_blank">国家邮政局、教育部联合印发《关于加快发展邮政行业职业教育的指导意见》</a><span>2015-7-17</span></li>
                            <li class="pos"><a href="news-2.html" target="_blank">教育部召开普及高中阶段教育座谈会</a><span>2015-7-17</span></li>
                            <li class="pos"><a href="news-3.html" target="_blank">教育部：我国高职教育专业总数调减至747个</a><span>2015-7-17</span></li>
                        </ul>
                    </div>
                </div>
              </li>
           	  <li class="newscol_hei" id="news2">
              	<a href="javascript:void(0);" class="news2"></a>
              	<div class="news2title">
                	通知公告
                </div>
                <div class="noticelist">
                	<ul>
                    	<li>
                            <div class="data fl">
                                <p class="p1">06/20</p>
                                <p class="p2">2015</p>
                            </div>
                            <a href="news-announcement.html" target="_blank">关于“西部职教项目”课题结题验收工作安排的通知...</a>
                        </li>
                    	<li>
                            <div class="data fl">
                                <p class="p1">03/12</p>
                                <p class="p2">2015</p>
                            </div>
                            <a href="javascript:void(0);">关于开展中等职业学校时事教育情况调查的通知...</a>
                        </li>
                    	<li>
                            <div class="data fl">
                                <p class="p1">01/02</p>
                                <p class="p2">2015</p>
                            </div>
                            <a href="javascript:void(0);">关于组织现代职业教育体系建设试点项目现场教学视导的函...</a>
                        </li>
                    </ul>
                </div>
              </li>
           	  <li class="newscol_hei" style="margin-right:0px;" id="news3">
              	<a href="javascript:void(0);" class="news3"></a>
              	<div class="news2title">
                	最新留言
                </div>
                <div class="noticelist">
                	<ul>
                    	<li>
                            <div class="ask">出版社有哪些新教材？</div>
                            <div class="ans">请到教材速递板块查板块查看最新教材信息。</div>
                        </li>
                    	<li>
                            <div class="ask">出版社有哪些新教材？</div>
                            <div class="ans">请到教材速递板块查板块查看最新教材信息。</div>
                        </li>
                    	<li>
                            <div class="ask">出版社有哪些新教材？</div>
                            <div class="ans">请到教材速递板块查板块查看最新教材信息。</div>
                        </li>
                    </ul>
                </div>
              </li>
            </ul>
        </div>
        <a class="publicmore" href="newslist.html" target="_blank">More</a>
    </div>
</div> -->

<div class="wrapper footerbox">
  <div class="wrap-inbox">
  	<div class="links">
   	  <a href="index.html">首页</a>|
   	  <a href="class.html">热门景点</a>|
   	  <a href="resources.html">在线选购</a>
    </div>
    <div class="adds">
        地址：哈尔滨市香坊区木材街59号　邮编：150030<br />
        版权所有(C) 1999-2015 </div>
    </div>
</div>

<script src="js/slider.js" type="text/javascript"></script>
<script src="js/tabs.js" type="text/javascript"></script>
<script type="text/javascript">
$(function() {
	var bannerSlider = new Slider($('#banner_tabs'), {
		time: 6000,
		delay: 500,
		event: 'hover',
		auto: true,
		mode: 'fade',
		controller: $('#bannerCtrl'),
		activeControllerCls: 'active'
	});
	$('#banner_tabs .flex-prev').click(function() {
		bannerSlider.prev()
	});
	$('#banner_tabs .flex-next').click(function() {
		bannerSlider.next()
	});
});
$(".close-ad").click(function(){
	$(".ad-banner").hide();
})
</script>

</body>
</html>
