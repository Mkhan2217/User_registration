package com.khan.springweb.Service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.khan.springweb.Repository.RegistorRepository;
import com.khan.springweb.dto.RegistorDto;
import com.khan.springweb.entity.Register;

@Component
public class RegisterService {
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private RegistorRepository registerRepository;
	
	
	public void processRegisterDetails(RegistorDto registerDto) {
		Register register = mapper.map(registerDto, Register.class);
		registerRepository.save(register);
		
		 
	}
	
	public List<Register> findAll(){
		return registerRepository.findAll();
	}
}



