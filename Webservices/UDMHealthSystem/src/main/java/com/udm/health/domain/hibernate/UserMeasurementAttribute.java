package com.udm.health.domain.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_measurement_attribute")
public class UserMeasurementAttribute {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idUserMeasurementAttribute")
	private Long id;
	
	@Column(name="value")
	private String value;
	
	@ManyToOne
	@JoinColumn(name="idMeasurementAttribute")
	private MeasurementAttribute measurementAttribute;
	
	@ManyToOne
	@JoinColumn(name="idUserMeasurement")
	private UserMeasurement userMeasument;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public MeasurementAttribute getMeasurementAttribute() {
		return measurementAttribute;
	}

	public void setMeasurementAttribute(MeasurementAttribute measurementAttribute) {
		this.measurementAttribute = measurementAttribute;
	}

	public UserMeasurement getUserMeasument() {
		return userMeasument;
	}

	public void setUserMeasument(UserMeasurement userMeasument) {
		this.userMeasument = userMeasument;
	}
}
