package com.itheima.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.demo.service.UserService;

@Service
//�����ע������alibaba����ģ���ƽ���õĲ�һ������Ϊ��Ҫ���ⷢ����
public class UserServiceImpl implements UserService{

	public String getName() {
		// TODO Auto-generated method stub
		return "itcast";
	}
}
