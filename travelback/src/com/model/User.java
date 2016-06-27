package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.model.base.BaseModel;
/**
 * 用户表
 * @author 段宝丹
 *
 */
@Entity
@Table(name = "user")
public class User extends BaseModel{

	private Long id;		//id
	private String name;	//姓名
	private String ucode;	//账号
	private String password;//密码
	private String phone;	//电话号
	private String email;	//邮箱
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name = "name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name = "ucode")
	public String getUcode() {
		return ucode;
	}
	public void setUcode(String ucode) {
		this.ucode = ucode;
	}
	@Column(name = "password")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name = "phone")
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Column(name = "email")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
