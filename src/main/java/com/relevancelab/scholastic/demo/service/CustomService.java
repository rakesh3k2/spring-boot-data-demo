package com.relevancelab.scholastic.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relevancelab.scholastic.demo.model.entity.CustomMessage;
import com.relevancelab.scholastic.demo.model.repository.CustomMessageRepo;

@Service
public class CustomService {
	
	@Autowired
	CustomMessageRepo customRepo;
	
	public Long saveMessage(String msg) {
		
		CustomMessage customMsg = new CustomMessage();
		customMsg.setMessage(msg);
		
		CustomMessage savedMsg = customRepo.save(customMsg);
		return savedMsg.getMsgId();
		
	}
	
	public CustomMessage getMessage(Long msgId) {
		CustomMessage customMsg = customRepo.findByMsgId(msgId);
		return customMsg;
	}

}
