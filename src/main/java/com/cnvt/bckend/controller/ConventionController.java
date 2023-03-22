package com.cnvt.bckend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnvt.bckend.model.Convention;
import com.cnvt.bckend.repository.ConventionRepository;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class ConventionController {
	
	
	@Autowired
	private ConventionRepository conventionRepository;

	
	@GetMapping("/conventions")
	public List<Convention> getAllConventions(){
		return conventionRepository.findAll();
		
	}
	
	@PostMapping("/cnvns")
	public Convention createCnvt(@RequestBody Convention cnvt) {
		return conventionRepository.save(cnvt);
	}


}
