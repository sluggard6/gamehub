package xyz.sluggard.thingshub.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("test")
public class TestController {
	
	@RequestMapping("/")
	public String test() {
		log.info("success");
		return "success";
	}

}
