package com.capeelectric.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capeelectric.service.DataExportService;

@RestController
@RequestMapping("/api/mssql/v1")
public class DataController {

	private static final Logger logger = LoggerFactory.getLogger(DataController.class);

	@Autowired
	private DataExportService dataExportService;

	@PostConstruct
	@GetMapping("/fetchdata")
	public void fetchdata() {
		logger.debug("called fetch  ");
		dataExportService.fetchdata();
	}

}
