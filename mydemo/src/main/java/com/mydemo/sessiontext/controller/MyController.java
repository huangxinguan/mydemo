package com.mydemo.sessiontext.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mydemo.common.Result;

@RestController
public class MyController {
	
	
	@RequestMapping(value = "test1", method = RequestMethod.POST )
	public Result test1(HttpServletRequest request, HttpServletResponse response) {
		
		
		return Result.respSuccess();
	}
	

}
