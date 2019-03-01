package com.itheima.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.demo.service.UserService;

@Service
//这里的注解是用alibaba包里的，和平常用的不一样，因为它要对外发布。
public class UserServiceImpl implements UserService{

	public String getName() {
		// TODO Auto-generated method stub
		return "itcast";
	}
}
