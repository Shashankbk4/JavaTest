package com.fmc.jpademo2.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fmc.jpademo2.pojo.Department;
import com.fmc.jpademo2.pojo.Employee;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
  

}
