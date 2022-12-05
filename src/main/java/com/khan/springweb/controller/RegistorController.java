package com.khan.springweb.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.khan.springweb.Service.RegisterService;
import com.khan.springweb.constant.AppConstant;
import com.khan.springweb.dto.RegistorDto;
//@Controller
@Component
@RequestMapping(value=AppConstant.FORWARD_SLASH)
public class RegistorController {
	@Autowired
	private  RegisterService registerService;
	public RegistorController(){
		System.out.println(this.getClass().getSimpleName()+" Object Created");
		}
	@RequestMapping(value=AppConstant.SAVE_REGISTER_DETAILS)
	public ModelAndView saveRegistorDetials(RegistorDto registorDto) {
		
		System.out.println(registorDto);
		registerService.processRegisterDetails(registorDto);
		return new ModelAndView("firstcode.jsp");
		
	}

}
