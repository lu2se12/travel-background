/*
 * Translated default messages for the jQuery validation plugin.
 * Locale: ZH (Chinese, 中文 (Zhōngwén), 汉语, 漢語)
 */
$.extend($.validator.messages, {
	required: "必须填写",
	remote: "请修正此栏位",
	email: "请输入有效的电子邮件",
	url: "请输入有效的网址",
	date: "请输入有效的日期",
	dateISO: "请输入有效的日期 (YYYY-MM-DD)",
	number: "请输入正确的数字",
	digits: "只可输入整数",
	creditcard: "请输入有效的信用卡号码",
	equalTo: "你的输入不相同",
	extension: "请输入有效的后缀",
	maxlength: $.validator.format("最多 {0} 个字"),
	minlength: $.validator.format("最少 {0} 个字"),
	rangelength: $.validator.format("请输入长度为 {0} 至 {1} 之間的字串"),
	range: $.validator.format("请输入 {0} 至 {1} 之间的数值"),
	max: $.validator.format("请输入不大于 {0} 的数值"),
	min: $.validator.format("请输入不小于 {0} 的数值")
});

jQuery.validator.addMethod("ipAddress", function(value, element) {   
	var tel = /^((2[0-4]\d|25[0-5]|[01]?\d\d?)\.){3}(2[0-4]\d|25[0-5]|[01]?\d\d?)$/;
	return tel.test(value);
}, "请您填写正确的IP地址");
jQuery.validator.addMethod("gateway", function(value, element) {   
	var tel = /^((2[0-4]\d|25[0-5]|[01]?\d\d?)\.){3}(2[0-4]\d|25[0-5]|[01]?\d\d?)$/;
	return tel.test(value);
}, "请您填写正确的网关");
jQuery.validator.addMethod("subnet", function(value, element) {   
	var tel = /^((2[0-4]\d|25[0-5]|[01]?\d\d?)\.){3}(2[0-4]\d|25[0-5]|[01]?\d\d?)$/;
	return tel.test(value);
}, "请您填写正确的子网掩码");
jQuery.validator.addMethod("nochinese", function(value, element) {   
	var tel = /^[^\u4e00-\u9fa5]{0,}$/;
	return tel.test(value);
}, "不允许输入中文");
jQuery.validator.addMethod("divisible", function(value, element,test) {   
	if(value%test==0){
		return true;
	}
	return false;
}, "只能输入{0}的倍数");
jQuery.validator.addMethod("filepath", function(value, element) {   
	var tel = /^[c-zC-Z]:(\\[^/\\"?:*<>|]+[^/\"?:*<>|]*)$/;
	if(value.indexOf("\\\\")!=-1){
		return false;
	}
	return tel.test(value);
}, "输入正确的文件路径格式");
jQuery.validator.addMethod("confirmPassword", function(value, element,test) {
	return value==test;
}, "密码不一致");
jQuery.validator.addMethod("noLetter", function(value, element) {   
	var tel=/^[^A-z]{0,}$/;
	return tel.test(value);
}, "不允许输入字母");