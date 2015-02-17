package com.workpoint.mwallet.server.dao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Client")
public class ClientModel {
	
	@Id
	@Column(name="Recid")
	private Long id;
	
	
	@Column(name="clname")
	private String firstName;
	
	@Column(name="middlename")
	private String middleName;
	
	@Column(name="clsurname")
	private String sirName;
	
	@Column(name="phone")
	private String phoneNo;
	
	@Column(name="clcode")
	private String clCode;

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getSirName() {
		return sirName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public String getClCode() {
		return clCode;
	}
}
