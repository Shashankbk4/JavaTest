package com.fmc.jpademo2.repo;

import java.util.List;
import java.util.Objects;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fmc.jpademo2.pojo.Employee;

import jakarta.transaction.Transactional;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    
	List<Employee> findBySalaryGreaterThan(double salary);
	List<Employee> findBySalaryLessThan(double salary);
	
	List<Employee> findByNameLike(String pattern);
	List<Employee> findByNameEndingWith(char pattern) ;
	List<Employee> findBySalaryBetween(double s1,double s2);
	
	
	List<Employee> findByNameContaining(char pattern);
	
	List<Employee> findBySalaryLessThanEqual(double salary);
	
	List<Employee> findByNameIsNull();
	List<Employee> findByNameIsNotNull();
	
	
	List<Employee> findByNameOrderBySalaryDesc(String name);
	
	List<Employee> findBySalaryGreaterThanOrderByNameAsc(double salary);
	
	List<Employee> findBySalaryIn(List<Double> salary);
	
	List<Employee> findByNameNotIn(List<String> name);
	
	@Query("select  e from Employee e where e.name=:a or e.salary<:b")
	List<Employee> getAllProducts(@Param("a") String eName, @Param("b") Double eSalary) ;
	
	@Query("select e.name from Employee e where e.salary>:a")
	List<String> getAllProducts(@Param("a") Double eSalary);
	
	@Query("select e.name , e.salary from Employee e")
	List<Object[]> getAllProducts();
    @Modifying
	@Transactional
	@Query("update Employee e  set e.name=:a where e.id=:b")
    //void updateEmployeeNameById(@Param("a") String ename,@Param("b") long id);
    int updateEmployeeNameById(@Param("a") String ename,@Param("b") long id);
    
    List<Employee> findBySalaryGreaterThan(Double sal);
    
    List<Employee> findByNameOrSalaryAndName(String name,Double sal,String n);
    
    List<Employee> findBySalaryGreaterThanAndNameNotIn(Double sal,List<String> name);
    
    List<Employee> findBySalaryGreaterThanOrderByNameAsc(Double sal);


}
