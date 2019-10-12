package com.micro.u.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.micro.u.entity.Profes;
import com.micro.u.service.ProfesService;

@RestController
public class ProfesController {
	
	@Autowired
	private ProfesService profesService;
	
	@GetMapping("/list")
	public List<Profes> getList(){
		return profesService.getAllList();	
		
	}
	
	@GetMapping("/{id}")
	public Profes getById(@PathVariable Long id) {
		return profesService.getById(id);
	}

}
