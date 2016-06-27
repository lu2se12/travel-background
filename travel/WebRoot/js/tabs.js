/*资源中心二级下接*/	
 $('#zylist').mouseover(function(){
		   $('.zylistbox').show();
		}).mouseout(function(){
				$('.zylistbox').hide();
		});

 $('.menu_fl').mouseover(function(){
		   $('.allflbox').show();
		}).mouseout(function(){
				$('.allflbox').hide();
		});


 $('#zz_show').mouseover(function(){
		   $('#zz_list').show();
		}).mouseout(function(){
				$('#zz_list').hide();
		});

 $('#gz_show').mouseover(function(){
		   $('#gz_list').show();
		}).mouseout(function(){
				$('#gz_list').hide();
		});


/*培训教材切换*/	
$('.zyfutitle li').hover(function(e){

$(".zyfutitle li").removeClass("cur");
$(this).addClass("cur");
var n=$(this).attr("attr");
 $('.zytjlist').css('display','none');
  $('#zytj'+n).css('display','block');
 });
 
 
/*校企直通切换*/	
$('.xqzthover li').hover(function(e){
 $('.qylogohover').css('display','none');
$(this).children(".qylogohover").css('display','block');
 });
 
$('.xqfutitle li').hover(function(e){

$(".xqfutitle li").removeClass("cur");
$(this).addClass("cur");
var n=$(this).attr("attr");
 $('.xqzthover').css('display','none');
  $('#xqzt'+n).css('display','block');
 });

/*社区学习切换*/
//$('.sqxxqtitle li').hover(function(e){
//	$(".sqxxqtitle li").removeClass("cur");
//	$(this).addClass("cur");
//	var n=$(this).attr("attr");
// 	$('.sqxxqhover').css('display','none');
//  	$('#sqxxq'+n).css('display','block');
//});	
/*职教新闻切换*/
//$('.newstitle li').hover(function(e){
//	$(".newstitle li").removeClass("cur");
//	$(this).addClass("cur");
//	var n=$(this).attr("attr");
// 	$('.newshover').css('display','none');
//  	$('#newstitle'+n).css('display','block');
//});
/*图书介绍*/	
$('.introduction-top li').hover(function(e){
 $('.introduction-bg').css('display','none');
$(this).children(".introduction-bg").css('display','block');
 });
 
$('.introduction-top li').hover(function(e){

$(".introduction-top li").removeClass("cur");
$(this).addClass("cur");
var n=$(this).attr("attr");
 $('.introduction-bg').css('display','none');
  $('#in-name'+n).css('display','block');
 });

/*右侧导航切换*/	

$('.F1').hover(function(e){
$(this).removeClass("flow");
$(this).addClass("flowover").html("热门<br>景点");
 }).mouseout(function(e){
$(this).removeClass("flowover");
$(this).addClass("flow").html("1F"); });

$('.F2').hover(function(e){
$(this).removeClass("flow");
$(this).addClass("flowover").html("不可<br>错过");
 }).mouseout(function(e){
$(this).removeClass("flowover");
$(this).addClass("flow").html("2F"); });

$('.F3').hover(function(e){
$(this).removeClass("flow");
$(this).addClass("flowover").html("地道<br>美食");
 }).mouseout(function(e){
$(this).removeClass("flowover");
$(this).addClass("flow").html("3F"); });

/*$('.F4').hover(function(e){
$(this).removeClass("flow");
$(this).addClass("flowover").html("社区<br>学习");
 }).mouseout(function(e){
$(this).removeClass("flowover");
$(this).addClass("flow").html("4F"); });

$('.F5').hover(function(e){
$(this).removeClass("flow");
$(this).addClass("flowover").html("教材<br>速递");
 }).mouseout(function(e){
$(this).removeClass("flowover");
$(this).addClass("flow").html("5F"); });

$('.F6').hover(function(e){
$(this).removeClass("flow");
$(this).addClass("flowover").html("职教<br>动态");
 }).mouseout(function(e){
$(this).removeClass("flowover");
$(this).addClass("flow").html("6F"); });*/

$('.backshow').hover(function(e){
$(this).removeClass("backto");
$(this).addClass("backtoover").html("返回<br>顶部");
 }).mouseout(function(e){
$(this).removeClass("backtoover");
$(this).addClass("backto").html(""); });

//楼层浮动导航 相应展示
function bottombar(){
	
	$(".quick_flower").each(function(){
		var scrolltop = $(document).scrollTop();
		if((scrolltop >= 510)&&(scrolltop < 960)){
			$(".F1").removeClass("flow");
			$(".F1").addClass("flowover").html("热门<br>景点");
		}else{
			$(".F1").removeClass("flowover");
			$(".F1").addClass("flow").html("1F");
		};
		if((scrolltop >= 960)&&(scrolltop < 1410)){
			$(".F2").removeClass("flow");
			$(".F2").addClass("flowover").html("不可<br>错过");
		}else{
			$(".F2").removeClass("flowover");
			$(".F2").addClass("flow").html("2F");
		};
		if((scrolltop >= 1410)&&(scrolltop < 1860)){
			$(".F3").removeClass("flow");
			$(".F3").addClass("flowover").html("地道<br>美食");
		}else{
			$(".F3").removeClass("flowover");
			$(".F3").addClass("flow").html("3F");
		};
		/*if((scrolltop >= 1860)&&(scrolltop < 2210)){
			$(".F4").removeClass("flow");
			$(".F4").addClass("flowover").html("社区<br>学习");
		}else{
			$(".F4").removeClass("flowover");
			$(".F4").addClass("flow").html("4F");
		};
		if((scrolltop >= 2210)&&(scrolltop < 2483)){
			$(".F5").removeClass("flow");
			$(".F5").addClass("flowover").html("教材<br>速递");
		}else{
			$(".F5").removeClass("flowover");
			$(".F5").addClass("flow").html("5F");
		};
		if(scrolltop >= 2483){
			$(".F6").removeClass("flow");
			$(".F6").addClass("flowover").html("职教<br>动态");
		}else{
			$(".F6").removeClass("flowover");
			$(".F6").addClass("flow").html("6F");
		};*/
	});
}
$(window).scroll(function(){
	//浮动导航 相应展示
	bottombar();
});



/*新闻动态效果*/	
$('#news1').mouseover(function(e){
$("#news1>a").addClass("cur1");
}).mouseout(function(){
$("#news1>a").removeClass("cur1");
		});
$('#news2').mouseover(function(e){
$("#news2>a").addClass("cur2");
}).mouseout(function(){
$("#news2>a").removeClass("cur2");
		});
$('#news3').mouseover(function(e){
$("#news3>a").addClass("cur3");
}).mouseout(function(){
$("#news3>a").removeClass("cur3");
		});

/*推荐课程效果*/	
$('#kcbg li').mouseover(function(e){
$(this).removeClass("kccol_hei");
$(this).addClass("kccol_hover");
}).mouseout(function(){
$(this).removeClass("kccol_hover");
$(this).addClass("kccol_hei");
		});


/*资源推荐效果*/	
$('#zybg>li').mouseover(function(e){
$(this).removeClass("zytjcol_hei");
$(this).addClass("zytjcol_hover");
}).mouseout(function(){
$(this).removeClass("zytjcol_hover");
$(this).addClass("zytjcol_hei");
		});

/*课堂实录效果*/	
$('#ktsl>li').mouseover(function(e){
$(this).removeClass("zytjcol_hei");
$(this).addClass("zytjcol_hover");
}).mouseout(function(){
$(this).removeClass("zytjcol_hover");
$(this).addClass("zytjcol_hei");
		});

/*社区学习效果*/	
$('#sqbg>li').mouseover(function(e){
$(this).removeClass("sqxxqcol_hei");
$(this).addClass("sqxxqcol_hover");
}).mouseout(function(){
$(this).removeClass("sqxxqcol_hover");
$(this).addClass("sqxxqcol_hei");
		});

/*教材速递效果*/	
$('#jcbg>li').mouseover(function(e){
$(this).removeClass("jcsdcol_hei");
$(this).addClass("jcsdcol_hover");
}).mouseout(function(){
$(this).removeClass("jcsdcol_hover");
$(this).addClass("jcsdcol_hei");
		});

/*链接效果*/	
$('#link>li').mouseover(function(e){
$(this).removeClass("link_hei");
$(this).addClass("link_hover");
}).mouseout(function(){
$(this).removeClass("link_hover");
$(this).addClass("link_hei");
		});



$(document).ready(function () {
	$(".drama-poster li").live("hover", function () {
		$(".current").removeClass("current");
		$(this).addClass("current") 
	});
 
});

$(function () {
	var a = $(".drama-poster ul>li");
	a.mouseover(function () {
		a.removeClass("current");
		$(this).addClass("current") 
	});
	$(".drama-slide li.next a").click(function () {
		var b = $(".drama-poster ul>li:first"), c = $(".drama-poster ul .current").index();
		$(".drama-poster ul>li:last").after(b);
		$(".drama-poster ul li").removeClass("current");
		$(".drama-poster ul").find("li").eq(c).addClass("current") 
	});
	$(".drama-slide li.prev a").click(function () {
		var c = $(".drama-poster ul>li:last"), b = $(".drama-poster ul .current").index();
		$(".drama-poster ul>li:first").before(c);
		$(".drama-poster ul li").removeClass("current");
		$(".drama-poster ul").find("li").eq(b).addClass("current") 
	}) 
});



$(document).ready(function () {
	$(".drama-poster1 li").live("hover", function () {
		$(".current1").removeClass("current1");
		$(this).addClass("current1") 
	});
 
});

$(function () {
	var a = $(".drama-poster1 ul>li");
	a.mouseover(function () {
		a.removeClass("current1");
		$(this).addClass("current1") 
	});
	$(".drama-slide1 li.next a").click(function () {
		var b = $(".drama-poster1 ul>li:first"), c = $(".drama-poster1 ul .current1").index();
		$(".drama-poster1 ul>li:last").after(b);
		$(".drama-poster1 ul li").removeClass("current1");
		$(".drama-poster1 ul").find("li").eq(c).addClass("current1") 
	});
	$(".drama-slide1 li.prev a").click(function () {
		var c = $(".drama-poster1 ul>li:last"), b = $(".drama-poster1 ul .current1").index();
		$(".drama-poster1 ul>li:first").before(c);
		$(".drama-poster1 ul li").removeClass("current1");
		$(".drama-poster1 ul").find("li").eq(b).addClass("current1") 
	}) 
});

/*课堂实录展开收起功能*/
$(".res-show").click(function(){
	$(".res-open").toggle();
	$(".res-close").toggle();
	$(".inner-li-right").toggleClass("h-24");
});


