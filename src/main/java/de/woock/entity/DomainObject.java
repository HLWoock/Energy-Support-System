/*
 * Copyright oose innovative Informatik GmbH All Rights Reserved.
 *
 * This software is the proprietary information of oose.de GmbH
 * Use is subject to license terms.
 * 
 * http://www.oose.de
 */
package de.woock.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@MappedSuperclass
public abstract class DomainObject implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5868433974616798422L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Version
	private int version;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(updatable=false)
	private Date created;

	public DomainObject() {
		super();
		created=new Date();
	}
	
	public Integer getId() {
		return id;
	}

	public int getVersion() {
	
		return version;
	
	}
		
	public Date getCreated() {
	
		return created;
	
	}	
}
