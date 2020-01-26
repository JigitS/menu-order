package com.hci.menu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "UserType")
public class UserTypeEntity {
	@Id
	@SequenceGenerator(name = "USER_TYPE_ID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_TYPE_ID")
	@Column(name ="USER_TYPE_ID")
	private Long userTypeId;
	@Column(name ="USER_TYPE_CODE")
	private String userTypeCode;
	public Long getUserTypeId() {
		return userTypeId;
	}
	public void setUserTypeId(Long userTypeId) {
		this.userTypeId = userTypeId;
	}
	public String getUserTypeCode() {
		return userTypeCode;
	}
	public void setUserTypeCode(String userTypeCode) {
		this.userTypeCode = userTypeCode;
	}
	
	
	
	
	
	
	
}
