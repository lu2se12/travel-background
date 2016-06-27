package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.model.base.BaseModel;
/**
 * 路线和区域的关联表
 * @author 段宝丹
 *
 */
@Entity
@Table(name = "way_area")
public class Way2Area extends BaseModel{

	private Long id;		//id
	private Long wayId;		//路线ID
	private Long areaId;	//区域ID
	private String traffic;	//交通方式
	private Long day;		//第几天
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name = "way_id")
	public Long getWayId() {
		return wayId;
	}
	public void setWayId(Long wayId) {
		this.wayId = wayId;
	}
	@Column(name = "area_id")
	public Long getAreaId() {
		return areaId;
	}
	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}
	@Column(name = "traffic")
	public String getTraffic() {
		return traffic;
	}
	public void setTraffic(String traffic) {
		this.traffic = traffic;
	}
	@Column(name = "day")
	public Long getDay() {
		return day;
	}
	public void setDay(Long day) {
		this.day = day;
	}
	
}
