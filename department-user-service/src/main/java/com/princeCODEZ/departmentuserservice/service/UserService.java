package com.princeCODEZ.departmentuserservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.princeCODEZ.departmentuserservice.entity.User;
import com.princeCODEZ.departmentuserservice.repo.UserRepository;
import com.princeCODEZ.departmentuserservice.valueObjects.Department;
import com.princeCODEZ.departmentuserservice.valueObjects.ResponseTemplate;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		log.info("saving user from userService");
		return userRepository.save(user);
	}

	public ResponseTemplate getUserWithDept(Long userId) {
		log.info("Getting user with department from userService");
		ResponseTemplate responseTemplate = new ResponseTemplate();
		User user = userRepository.findByUserId(userId);
		
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/api/department/find/" + user.getDepartmentId(),
				Department.class);
		
		responseTemplate.setUser(user);
		responseTemplate.setDepartment(department);
				
		return responseTemplate;
	}

}
