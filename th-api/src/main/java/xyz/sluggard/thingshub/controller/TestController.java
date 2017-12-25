package xyz.sluggard.thingshub.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("test")
public class TestController {
	
	@RequestMapping("/")
	public String test() {
		log.info("success");
		return "success";
	}
	
	@RequestMapping(value="test", headers="api_version=2.0")
	public String test2(HttpServletRequest req) {
		return "api2.0";
	}
	
	@RequestMapping(value="test")
	public String test1(HttpServletRequest req) {
		return "api1.0";
	}
	
	@RequestMapping(value="test", headers= {"api_version=2.0","client_version=ios"})
	public String test3(HttpServletRequest req) {
		return "api3.0";
	}
	
	
	@RequestMapping(value="testClient", headers= {"client_version=ios"})
	public String testchannel1() {
		return "clientios";
	}
	
	@RequestMapping(value="testClient", headers= {})
	public String testchannel2() {
		return "clientandroid";
	}

}
