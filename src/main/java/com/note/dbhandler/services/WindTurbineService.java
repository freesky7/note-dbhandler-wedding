package com.note.dbhandler.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.note.dbhandler.entities.WindTurbine;
@Component
public interface WindTurbineService {

	List<WindTurbine> findAll();

	List<WindTurbine> findByRegion(int region);

	WindTurbine findByName(String name);

	List<WindTurbine> findByLocation(int location);
	
	void create(WindTurbine entity);
	
	void delete(WindTurbine entity);
	
	void update(WindTurbine entity);
}
