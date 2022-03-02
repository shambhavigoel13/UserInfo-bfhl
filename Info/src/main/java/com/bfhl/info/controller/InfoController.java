package com.bfhl.info.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bfhl.info.controller.service.InfoService;
import com.bfhl.info.request.InfoRequest;
import com.bfhl.info.response.InfoResponse;

@RestController
public class InfoController {
	@Autowired
	InfoService service;

	@PostMapping("/bfhl")
	public InfoResponse getInformation(@RequestBody InfoRequest req) {
		return service.getInformation(req);
	}
}
