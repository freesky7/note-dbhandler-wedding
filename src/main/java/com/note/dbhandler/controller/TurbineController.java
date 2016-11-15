package com.note.dbhandler.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.note.dbhandler.entities.WindTurbine;
import com.note.dbhandler.services.WindTurbineService;

@RestController
@RequestMapping(value = "/Turbine")
public class TurbineController {

	@Autowired
	private WindTurbineService wtService;

	private ObjectMapper mapper = new ObjectMapper();

	@RequestMapping(value = "/get", method = { RequestMethod.GET })
	@ResponseBody
	public String getTurbine(@Param(value = "name") String name) throws JsonProcessingException {

		// WindTurbine turbine = wtService.findByName(name);
		// return mapper.writeValueAsString(turbine);
		String res = "{name: “Turbine1”, region: “99”, location: “22”,"
				+ " minpower: 3, maxpower: 8, lowmode:  “1”, highmode: “ 2” }";
		return res;
	}

	@RequestMapping(value = "/create", method = { RequestMethod.POST }, headers = { "application/json" })
	public boolean createTurbine(@Payload String json) {
		try {
			WindTurbine turbine = mapper.readValue(json, WindTurbine.class);
			wtService.create(turbine);

		} catch (IOException e) {
			return false;
		}
		return true;
	}

	@RequestMapping(value = "/delete", method = { RequestMethod.DELETE }, headers = { "application/json" })
	public boolean deleteTurbine(@Payload String json) {

		return true;
	}

	@RequestMapping(value = "/put", method = { RequestMethod.PUT }, headers = { "application/json" })
	public boolean updateTurbine(@Payload String json) {

		return true;
	}
}
