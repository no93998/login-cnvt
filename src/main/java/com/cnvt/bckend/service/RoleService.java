package com.cnvt.bckend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnvt.bckend.model.Role;
import com.cnvt.bckend.repository.RoleRepository;

@Service
public class RoleService {
	
	@Autowired
	private RoleRepository roleRepository;
	
	public Role createNewRole(Role role) {
		return roleRepository.save(role);
		
	}
	
}
