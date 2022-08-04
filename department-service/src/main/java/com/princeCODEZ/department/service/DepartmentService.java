package com.princeCODEZ.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.princeCODEZ.department.entity.Department;
import com.princeCODEZ.department.repo.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		
		log.info("save department from service");
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		log.info("find department by Id from service");
		return departmentRepository.findByDepartmentId(departmentId);
	}

}
