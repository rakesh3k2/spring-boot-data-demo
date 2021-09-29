package com.relevancelab.scholastic.demo.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.relevancelab.scholastic.demo.model.entity.CustomMessage;
public interface CustomMessageRepo extends CrudRepository<CustomMessage,Long>{

	CustomMessage findByMsgId(Long msgId);
}
