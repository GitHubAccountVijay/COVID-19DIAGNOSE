package com.covid.scan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="covid_details")
public class Pojo {
	@Id
	@Column
	private int id;
	@Column
	private String details;

	public String getDetails() {
		return details;
	}

	public void setDetaild(String details) {
		this.details = details;
	}
	
}
