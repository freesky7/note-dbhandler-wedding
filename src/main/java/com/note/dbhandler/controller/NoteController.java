package com.note.dbhandler.controller;

import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/Incident")
public class NoteController {

	@RequestMapping(value = "/save", method = { RequestMethod.POST }, headers = { "application/json" })
	public boolean saveIncident(@Payload String incident) {

		
		return false;
	}
}
