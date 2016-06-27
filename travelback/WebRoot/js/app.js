var ajaxRequest = function(options){
	var option = {
		url:"",
		submitButton:null,
		closeButton:null,
		success:null,
		form:null,
		modal:null,
		msg:{
			error:"操作失败",
			success:"操作成功",
			submit:"确定",
			submiting:"正在操作"
		},
		data:null
	}
	option = $.extend(true,option, options);
	if(option.form && !option.form.valid()){
		return ;
	}
	option.closeButton.hide();
	option.submitButton.html(option.msg.submiting);
	option.submitButton.attr({ "disabled": "disabled" });
	$.ajax({
		url:option.url,
		type:"post",
		dataType:"json",
		data:option.form?getFormJson(option.form):option.data,
		success:function(data){
			if(data && data.code==0){
				if(option.success){
					option.success(data);
					return;
				}
				if(option.modal)options.modal.modal("hide");
				window.location.reload();
			}
			Lobibox.notify('error', {
                position: 'top right',
                msg: (data && data.msg!=null)?data.msg:option.msg.error
            });
			option.closeButton.show();
			option.submitButton.html(option.msg.submit);
			option.submitButton.attr({ "disabled": null });
		},
		failure:function(){
			Lobibox.notify('error', {
                position: 'top right',
                msg: option.msg.error
            });
			option.closeButton.show();
			option.submitButton.html(option.msg.submit);
			option.submitButton.attr({ "disabled": null });
		},
		error:function(){
			Lobibox.notify('error', {
                position: 'top right',
                msg: option.msg.error
            });
			option.closeButton.show();
			option.submitButton.html(option.msg.submit);
			option.submitButton.attr({ "disabled": null });
		}
	});
}

//将form中的值转换为键值对。
function getFormJson(frm) {
	var o = {};
	var a = $(frm).serializeArray();
	$.each(a, function () {
    	if (o[this.name] !== undefined) {
       		if (!o[this.name].push) {
          		o[this.name] = [o[this.name]];
       		}
        	o[this.name].push(this.value || '');
    	} else {
        	o[this.name] = this.value || '';
    	}
	});
	return o;
}

function setForm(form,data,formValid){
	var a = $(form).serializeArray();
	if(formValid){
		formValid.resetForm();
		$(".state-error").removeClass("state-error");
	    $(".state-success").removeClass("state-success");
	};
	$.each(a, function (param) {
    	var name = a[param].name;
    	$(form).find("[name='"+name+"']").val(data==null?"":data[name]);
	});
}

function msgConfirm(options,submit){
	var option = {
		title:"提示",
		msg:"确认进行此操作？",
	}
	option = $.extend(true,option, options);
	Lobibox.alert("info", {
		title:option.title,
        msg: option.msg,
        buttons: {
            ok: {
                "class": "btn btn-primary",
                "text":"确定"
            },
            cancel: {
                "class": "btn btn-default",
                "text":"取消"
            }
        },
        callback: function (lobibox, type) {
        	var window = $(lobibox.$el);
            if (type === "ok") {
            	if(submit){
            		submit(window.find("button.btn-primary"),window.find("button.btn-default"));
            	}
            }
        }
    });
}

$.datepicker.regional["zh-CN"] = { closeText: "关闭", prevText: "&#x3c;上月", nextText: "下月&#x3e;", currentText: "今天", monthNames: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"], monthNamesShort: ["一", "二", "三", "四", "五", "六", "七", "八", "九", "十", "十一", "十二"], dayNames: ["星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"], dayNamesShort: ["周日", "周一", "周二", "周三", "周四", "周五", "周六"], dayNamesMin: ["日", "一", "二", "三", "四", "五", "六"], weekHeader: "周", dateFormat: "yy-mm-dd", firstDay: 1, isRTL: !1, showMonthAfterYear: !0, yearSuffix: "年" }
$.datepicker.setDefaults($.datepicker.regional["zh-CN"]);

function formatBookState(state){
	var data = parseInt(state);
	if(data==0){
		return "正在审批";
	}
	if(data==1){
		return "审批不通过";
	}
	if(data==2){
		return "审批通过";
	}
	if(data==3){
		return "已借阅";
	}
	if(data==4){
		return "续借";
	}
	if(data==5){
		return "申请归还";
	}
	if(data==6){
		return "已归还";
	}
	if(data==6){
		return "未归还";
	}else{
		return "未知";
	}
}