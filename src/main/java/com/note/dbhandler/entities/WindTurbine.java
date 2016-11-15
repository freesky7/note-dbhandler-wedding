package com.note.dbhandler.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class WindTurbine implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6574874412030578889L;
	@Id
	@GeneratedValue
	@JsonIgnore
	private long id;

	@Column(nullable = false, unique = true)
	private String name;
	@Column
	private int region;
	@Column
	private int location;
	@Column
	private int minpower;
	@Column
	private int maxpower;
	@Column
	private String lowmode;
	@Column
	private String highmode;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the region
	 */
	public int getRegion() {
		return region;
	}

	/**
	 * @return the location
	 */
	public int getLocation() {
		return location;
	}

	/**
	 * @return the minpower
	 */
	public int getMinpower() {
		return minpower;
	}

	/**
	 * @return the maxpower
	 */
	public int getMaxpower() {
		return maxpower;
	}

	/**
	 * @return the lowmode
	 */
	public String getLowmode() {
		return lowmode;
	}

	/**
	 * @return the highmode
	 */
	public String getHighmode() {
		return highmode;
	}

}
