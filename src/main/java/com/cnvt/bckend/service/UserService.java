package com.cnvt.bckend.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cnvt.bckend.model.Role;
import com.cnvt.bckend.model.User;
import com.cnvt.bckend.repository.RoleRepository;
import com.cnvt.bckend.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public User registerNewUser(User user) {
		
		Role role = roleRepository.findById("User").get();
		Set<Role> roles = new HashSet<>();
		roles.add(role);
		user.setRoles(roles);
		
		user.setUserPassword(getEncodedPassword(user.getUserPassword()));
		return userRepository.save(user);
	}
	
	public void initRolesAndUser() {
		Role adminRole = new Role();
		adminRole.setRoleName("Admin");
		adminRole.setRoleDescription("admin for patnership");
		roleRepository.save(adminRole);
		
		Role userRole = new Role();
		userRole.setRoleName("user");
		userRole.setRoleDescription("user for follow-up");
		roleRepository.save(userRole);
		
		User adminUser = new User();
		adminUser.setUserFirstName("yuki");
		adminUser.setUserLastName("partenariat");
		adminUser.setUserName("admin123");
		adminUser.setUserPassword(getEncodedPassword("admin@123"));
		
		Set<Role> adminRoles = new HashSet<>();
		adminRoles.add(adminRole);
		adminUser.setRoles(adminRoles);
		userRepository.save(adminUser);
		
		
//		User user = new User();
//		user.setUserFirstName("janit");
//		user.setUserLastName("suivi");
//		user.setUserName("janit123");
//		user.setUserPassword(getEncodedPassword("janit@123"));
//		
//		Set<Role> userRoles = new HashSet<>();
//		userRoles.add(userRole);
//		user.setRoles(userRoles);
//		userRepository.save(user);
		
		
		
		
	}
	
	
	public String getEncodedPassword(String password) {
		
		return passwordEncoder.encode(password);
		
	}

}


























