package com.hci.menu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name = "UserTypeDetail")
public class UserTypeDetEntity {
	@Id
	@SequenceGenerator(name = "USER_TYPE_DET_ID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_TYPE_DET_ID")
	@Column(name ="USER_TYPE_DET_ID")
	private Long userTypeDetId;
	@Column(name="USER_TYPE_ID", nullable=true, updatable=false, insertable=false)
	private Long userTypeId;
	@Column(name ="MODULE_ORDER")
	private Long moduleOrder;
	@Column(name="MODULE_ID", nullable=true, updatable=false, insertable=false)
	private Long moduleId;
	
	public Long getModuleId() {
		return moduleId;
	}
	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
	}
	public Long getUserTypeDetId() {
		return userTypeDetId;
	}
	public void setUserTypeDetId(Long userTypeDetId) {
		this.userTypeDetId = userTypeDetId;
	}
	
	public Long getUserTypeId() {
		return userTypeId;
	}
	public void setUserTypeId(Long userTypeId) {
		this.userTypeId = userTypeId;
	}
	public Long getModuleOrder() {
		return moduleOrder;
	}
	public void setModuleOrder(Long moduleOrder) {
		this.moduleOrder = moduleOrder;
	}
	
}

