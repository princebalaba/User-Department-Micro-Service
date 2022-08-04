package com.princeCODEZ.department.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.princeCODEZ.department.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

	Department findByDepartmentId(Long departmentId);

}
