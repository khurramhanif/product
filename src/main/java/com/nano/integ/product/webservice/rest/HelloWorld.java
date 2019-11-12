package com.nano.integ.product.webservice.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@GetMapping(path="/hello-world")
	public String getHello() {
		return "Hello World!";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorlBean getHelloBean() {
		return new HelloWorlBean("Hello World!");
	}
	

	@GetMapping(path="/hello-world-bean/path-variable/{name}")
	public HelloWorlBean getHelloBeanPathVariable(@PathVariable String name) {
		return new HelloWorlBean(String.format("Hello World, %s!",name));
	}

	
}
