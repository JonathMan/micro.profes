package com.micro.u.service;

import java.util.List;

import com.micro.u.entity.Profes;

public interface ProfesService {

	public List<Profes> getAllList();
	public Profes getById(Long id);
	
}
