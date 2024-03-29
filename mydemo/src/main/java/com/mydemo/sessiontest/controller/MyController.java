package com.mydemo.sessiontest.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mydemo.common.MyApplicationContext;
import com.mydemo.common.Result;
import com.mydemo.sessiontest.service.MyService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "test")
public class MyController {
	
	private HttpSession httpSession;  
	private HttpServletRequest request;
	
//	@Autowired
//	private MyService myService;
	@ApiOperation(value = "test1")
	@RequestMapping(value = "/test1", method = RequestMethod.GET )
	public Result test1(HttpServletRequest request, HttpServletResponse response) {
//		System.out.println(httpSession == request.getSession());
		httpSession = request.getSession();
		System.out.println(request.getSession());
		System.out.println(request.getRequestedSessionId());
		System.out.println(request);
		System.out.println(response);
//		System.out.println("request" + (this.request == request));
		this.request = request;
		return Result.respSuccess();
	}
	
	@ApiOperation(value = "test2")
	@RequestMapping(value = "/test2", method = RequestMethod.GET )
	public Result test2(HttpServletRequest request, HttpServletResponse response) {
		System.out.println(httpSession == request.getSession());
		httpSession = request.getSession();
		System.out.println(request);
		System.out.println(httpSession);
		System.out.println(response);
		System.out.println(request.getRequestedSessionId());

//		System.out.println("request" + (this.request == request));
		this.request = request;
		return Result.respSuccess();
	}
	
	@ApiOperation(value = "test3")
	@RequestMapping(value = "/test3", method = RequestMethod.GET )
	public Result test3(HttpServletRequest request, HttpServletResponse response) {
		MyService myService = MyApplicationContext.getApplicationContext().getBean(MyService.class);
		myService.queryInfo();
		return Result.respSuccess();
	}
	
	
	

}
