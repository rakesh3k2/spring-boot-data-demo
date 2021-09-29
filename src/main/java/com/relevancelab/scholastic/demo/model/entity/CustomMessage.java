package com.relevancelab.scholastic.demo.model.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

import lombok.Data;

@Entity
@Table(name="CustomMessage")
@Data
public class CustomMessage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long msgId;
	
	@NotNull
	private String message;
	
	@CreationTimestamp
	@JsonFormat(pattern = "dd/MM/yyyy hh:mm:ss")
	private Date createdTimestamp;
	
	@UpdateTimestamp
	@JsonFormat(pattern = "dd/MM/yyyy hh:mm:ss")
	private Date lastUpdatedTimestamp;
	
}
