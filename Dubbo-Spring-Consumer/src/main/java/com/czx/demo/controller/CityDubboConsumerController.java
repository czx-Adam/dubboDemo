package com.czx.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.czx.demo.service.CityDubboService;

@Controller
public class CityDubboConsumerController {

	//dubbo中的注解
	@Reference
	private CityDubboService cityDubboService;
	
	@RequestMapping("/")
	@ResponseBody
	public String showName() {
		
		return cityDubboService.findByName("Lucy");
	}
}
