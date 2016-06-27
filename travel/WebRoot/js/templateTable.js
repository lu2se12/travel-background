function initTemplateTable(options){
	var option = {
		form:null,
		table:"",
		modal:"",
		title:"",
		submitButton:null,
		closeButton:null,
		validate:true,
		data:[],
		msg:{
			save:"新增",
			saveing:"正在保存...",
			saveerror:"保存失败",
			edit:"修改",
			editing:"正在修改...",
			editerror:"保存失败"
		},
		save:{
			name:"新增",
			url:"",
			action:null,
		},
		edit:{
			name:"修改",
			url:"",
			action:null
		},
		remove:{
			name:"删除",
			url:"",
			action:null
		},
		handles:[],
		columns:[],
		columnDefs:[]
	}
	option = $.extend(true,option, options);
	var formValid = option.form==null?null:option.form.validate();
	var save = true;
	if(option.submitButton){
		option.submitButton.on("click",function(){
			ajaxRequest({
				url:save?option.save.url:option.edit.url,
				form:option.form,
				submitButton:option.submitButton,
				closeButton:option.closeButton,
				modal:option.modal,
				msg:{
					error:save?option.msg.saveerror:option.msg.editerror,
					submiting:save?option.msg.saveing:option.msg.editing,
				}
			});
		})
	}
	if(option.edit || option.remove || option.handles.length>0){
		option.columnDefs.push({
	        "render": function(data, type, row,index) {
	        	var html = '<div class="btn-group">'+
								'<button type="button" class="btn btn-primary btn-sm dropdown-toggle" data-toggle="dropdown">更多操作 <span class="caret"></span></button>'+
									'<ul class="dropdown-menu" role="menu">';
	        	if(option.edit)html+= '<li><a href="javascript:void(0);" class="padding-10 padding-top-0 padding-bottom-0" name="edit">'+option.edit.name+'</a></li>';
	        	if(option.remove)html+= '<li><a href="javascript:void(0);" class="padding-10 padding-top-0 padding-bottom-0" name="del">'+option.remove.name+'</a></li>';
	        	if(option.handles && option.handles.length>0){
	        		for(var i=0;i<option.handles.length;i++){
	        			var handle = option.handles[i];
	        			var name = "";
	        			if(typeof handle.name === 'function'){
	        				name = handle.name(data);
	        			}else{
	        				name = handle.name;
	        			}
	        			if(name!=false){
	        				html+= '<li><a href="javascript:void(0);" class="padding-10 padding-top-0 padding-bottom-0" name="'+name+'">'+name+'</a></li>';
	        			}
	        		}
	        	}
				html+='</ul></div>';
				return html;
	        },
	        "targets": [option.columns.length-1]
	    });
	}
	var tableOption = {
			"sDom" : "<'dt-toolbar'<'col-xs-12 col-sm-6'f><'col-sm-6 col-xs-6 hidden-xs'T>r>"
				+ "t"
				+ "<'dt-toolbar-footer'<'col-sm-6 col-xs-12 hidden-xs'i><'col-sm-6 col-xs-12'p>>",
			"data":option.data,
			"oTableTools":{
				"aButtons":[],
				"sSwfPath": "plugins/datatables/swf/copy_csv_xls_pdf.swf"
			},
	        columns: option.columns,
	        columnDefs: option.columnDefs
		};
	tableOption["rowCallback"] = function(row, data, c, d, e) {
		if(option.edit){
			$(row).find("a[name='edit']").on("click",function(){
	            option.title.html(option.msg.edit);
	            setForm(option.form,data,formValid);
	            if(option.edit.before && option.edit.before(data)==false){
					return;
				}
	            option.modal.modal("show");
	            save = false;
			});
		}
		if(option.remove){
			$(row).find("a[name='del']").on("click",function(id){
				if(option.remove.before && option.remove.before(data)==false){
					return;
				}
				msgConfirm({
					msg:"确认删除？"
				},function(submitButton,closeButton){
					ajaxRequest({
						url:option.remove.url,
						submitButton:submitButton,
						closeButton:closeButton,
						msg:{error:"删除失败"},
						data:{id:data.id}
					});
				});
			});
		}
		if(option.handles && option.handles.length>0){
        	for(var i=0;i<option.handles.length;i++){
        		var handle = option.handles[i];
        		var name = "";
        		if(typeof handle.name === 'function'){
        			name = handle.name(data);
        		}else{
        			name = handle.name;
        		}
        		$(row).find("a[name='"+name+"']").on("click",data,handle.action);
        	}
        }
    }
	
	if(option.save){
		tableOption["oTableTools"]["aButtons"].push({
			"sExtends" : "text",
			"sButtonText": option.save.name,
			"fnClick":function(nButton, oConfig, oFlash){
				option.title.html(option.msg.save);
				setForm(option.form,null,formValid);
				if(option.save.before && option.save.before()==false){
					return;
				}
				if(option.save.action){
					option.action(nButton, oConfig, oFlash);
					return
				}
				option.modal.modal("show");
				save = true;
			}
		})
	}
	var t = option.table.dataTable(tableOption);
}