package com.springboot.demo.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class inventoryDto implements Serializable {
	
	@JsonProperty(value = "message")
	private String msg;

	public inventoryDto() {
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	

}
