package com.micro.u.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.u.entity.Profes;
import com.micro.u.repository.ProfesRepository;
import com.micro.u.service.ProfesService;



@Service
public class ProfesServicei implements ProfesService{

	@Autowired
	private ProfesRepository profesRepository;
	
	@Override
	public List<Profes> getAllList(){
		return profesRepository.findAll();
	}
	
	@Override
	public Profes getById(Long id) {
		return profesRepository.findById(id).get();
	}
}
