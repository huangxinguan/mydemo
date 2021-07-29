package com.mydemo.sessiontest.service.impl;

import org.springframework.stereotype.Service;

import com.mydemo.sessiontest.service.MyService;

@Service
public class MyServiceImpl implements MyService{

	@Override
	public void queryInfo() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public MyServiceImpl() {
		System.out.println("init MyService =========");
	}

}
