package com.nano.integ.product.webservice.rest;

public class HelloWorlBean {

	private String msg;

	public HelloWorlBean() {}
	
	public HelloWorlBean(String msg) {
		this.setMsg(msg);
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
