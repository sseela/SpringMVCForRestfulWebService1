package com.cg.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestfulController {

	
	@RequestMapping(value="/hello", method=RequestMethod.GET, produces="application/json")
	public @ResponseBody String sample() {
		
		return "hello world";
	}
	
}
