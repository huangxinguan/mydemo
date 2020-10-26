package com.mydemo.sessiontest.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mydemo.common.Result;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.bytebuddy.asm.Advice.This;

@RestController
@Api(value = "test")
public class MyController {
	
	private HttpSession httpSession;  
	private HttpServletRequest request;
	@ApiOperation(value = "test1")
	@RequestMapping(value = "/test1", method = RequestMethod.POST )
	public Result test1(HttpServletRequest request, HttpServletResponse response) {
		System.out.println(httpSession == request.getSession());
		httpSession = request.getSession();
		
		System.out.println("request" + (this.request == request));
		this.request = request;
		return Result.respSuccess();
	}
	
	@ApiOperation(value = "test2")
	@RequestMapping(value = "/test2", method = RequestMethod.POST )
	public Result test2(HttpServletRequest request, HttpServletResponse response) {
		System.out.println(httpSession == request.getSession());
		httpSession = request.getSession();
		
		System.out.println("request" + (this.request == request));
		this.request = request;
		return Result.respSuccess();
	}
	
	
	

}
