package com.career.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class LoginController {

	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String GoLoginPage(){
		log.info("GoLoginPage");
		return "login";
	}
}
