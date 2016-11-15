package com.note.dbhandler.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TurbineIncident implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -9063162836012141440L;
	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String turbine;

	@Column(nullable = false)
	private Date time;
	
	@Column(nullable = false)
	private int currentPower;

	/**
	 * @param turbine
	 * @param time
	 * @param currentPower
	 */
	public TurbineIncident(String turbine, Date time, int currentPower) {
		super();
		
		this.turbine = turbine;
		this.time = time;
		this.currentPower = currentPower;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the turbine
	 */
	public String getTurbine() {
		return turbine;
	}

	/**
	 * @return the time
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * @return the currentPower
	 */
	public int getCurrentPower() {
		return currentPower;
	}

}