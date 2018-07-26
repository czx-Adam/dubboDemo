package com.czx.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.czx.demo.service.CityDubboService;

//注册为 Dubbo 服务
@Service
public class CityDubboServiceImpl implements CityDubboService {

	@Override
	public String findByName(String name) {
		// TODO Auto-generated method stub
		return "i am "+ name;
	}

}
