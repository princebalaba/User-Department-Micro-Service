package com.princeCODEZ.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.princeCODEZ.department.entity.Department;
import com.princeCODEZ.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/department")
@Slf4j
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/save")
	public Department saveDepartment(@RequestBody Department department) {
		log.info("saving department from controller");
		return departmentService.saveDepartment(department);
		
	}
	
	@GetMapping("/find/{id}")
	public Department findDepartmentById(@PathVariable ("id") Long departmentId) {
		log.info("find department by Id from controller");
		return departmentService.findDepartmentById(departmentId);
	}

}
