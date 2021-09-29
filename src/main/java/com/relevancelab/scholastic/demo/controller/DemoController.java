package com.relevancelab.scholastic.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.relevancelab.scholastic.demo.model.entity.CustomMessage;
import com.relevancelab.scholastic.demo.service.CustomService;

@RestController
@RequestMapping("/demo")
public class DemoController {
	
	@Autowired
	CustomService customService;
	
	@GetMapping("/addMessage")
	public String addMessage(@RequestParam String msg) {
		
		Long msgId = customService.saveMessage(msg);
		return "Custom Message Added to DB. Message ID : " + msgId;
	}
	
	@GetMapping("/getMessage")
	public CustomMessage getMessage(@RequestParam Long msgId) {
		CustomMessage customMsg = customService.getMessage(msgId);
		if(customMsg!=null) {
			return customMsg;
		} else {
			return new CustomMessage();
		}
	}

}
