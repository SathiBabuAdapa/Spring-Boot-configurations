package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Configuration;
import com.example.demo.model.LimitConfiguration;

@RestController
public class LimitConfigurationController {
	
	@Autowired()
	private Configuration configProp;
	
	@GetMapping("/limits")
	public LimitConfiguration getLimitConfiguration() {
		
		return new LimitConfiguration(configProp.getMax(),configProp.getMin());
	}

}
