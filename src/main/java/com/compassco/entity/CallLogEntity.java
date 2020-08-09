package com.compassco.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
@Entity
@Table(name="callLog")
@Data
public class CallLogEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	@JsonProperty("_ai")
	private String callLogId;
	@JsonProperty("_cl")
	private String callerNumber;
	@JsonProperty("an") 
	private boolean isAnonymous;
	
	

}
