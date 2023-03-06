package com.pgdac.elearning.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController

public class TestController {

	
	@GetMapping("/")
    public String test() {
    	return "Welcome To BackEnd";
    }
	
}
