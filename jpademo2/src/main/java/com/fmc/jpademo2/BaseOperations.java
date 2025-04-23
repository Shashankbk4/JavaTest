package com.fmc.jpademo2;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.fmc.jpademo2.pojo.Department;
import com.fmc.jpademo2.pojo.Employee;
import com.fmc.jpademo2.repo.DepartmentRepository;
import com.fmc.jpademo2.repo.EmployeeRepository;


@Component
public class BaseOperations implements CommandLineRunner {

	@Autowired
	private DepartmentRepository repo;
	
	@Autowired
	private EmployeeRepository empRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*Department bat=new Department();
		bat.setName("Batting");
		
		Department bowl=new Department();
		bowl.setName("Bowling");
		
		Employee e1=new Employee();
		e1.setName("virat");
		e1.setSalary(100000.00);
		e1.setDepartment(bat);
		
		Employee e2=new Employee();
		e2.setName("siraj");
		e2.setSalary(60000.00);
		e2.setDepartment(bowl);
		
		Employee e3=new Employee();
		e3.setName("chahal");
		e3.setSalary(45000.00);
		e3.setDepartment(bowl);
		
		Employee e4=new Employee();
		e4.setName("Rahul");
		e4.setSalary(75000.00);
		e4.setDepartment(bat);
		
		Employee e5=new Employee();
		e5.setName("Surya");
		e5.setSalary(35000.00);
		e5.setDepartment(bat);
		
		bat.setEmeployees(Arrays.asList(e1,e4,e5));
		bowl.setEmeployees(Arrays.asList(e2,e3));
		
		repo.saveAll(Arrays.asList(bat,bowl));
		empRepo.saveAll(Arrays.asList(e1,e2,e3,e4,e5));*/
		
		System.out.println("=========================");
		
		List<Employee> emp=empRepo.findBySalaryGreaterThan(70000);
		emp.forEach(salary -> System.out.println(salary.getName()+"==="+salary.getId()+"==="+salary.getSalary()));
	   System.out.println("=============");
		System.out.println("salary less then 70000");
		List<Employee> emp1=empRepo.findBySalaryLessThan(70000);
		emp1.forEach(salary -> System.out.println(salary.getName()+"==="+salary.getId()+"==="+salary.getSalary()));
	System.out.println("==============================");
	System.out.println("names start with s");
	List<Employee> emp2=empRepo.findByNameLike("S%");
	emp2.forEach(name -> System.out.println(name.getName()));
	List<Employee> emp3=empRepo.findByNameEndingWith('L');
	emp3.forEach(name -> System.out.println(name.getName()));
	List<Employee> emp4=empRepo.findByNameContaining('j');
	emp4.forEach(name -> System.out.println(name.getName()));
	
	List<Employee> emp5=empRepo.findBySalaryLessThanEqual(65000.00);
	emp5.forEach(name -> System.out.println(name.getName()));
	
	List<Employee> emp6=empRepo.findByNameIsNull();
	emp6.forEach(name -> System.out.println("--------"+name.getName()));
	List<Employee> emp7=empRepo.findByNameIsNotNull();
	emp7.forEach(name -> System.out.println("--------"+name.getName()));
	
	List<Employee> emp8=empRepo.findByNameOrderBySalaryDesc("chahal");
	emp8.forEach(name -> System.out.println("--------"+name.getName()));
	
	List<Employee> emp9=empRepo.findBySalaryGreaterThanOrderByNameAsc(60000.00);
	emp9.forEach(name -> System.out.println("--------"+name.getName()));
	
	List<Employee> emp10=empRepo.findBySalaryIn(Arrays.asList(100000.00,50000.00,65000.00));
	emp10.forEach(name -> System.out.println("salary --------"+name.getName()));
	
	List<Employee> emp11=empRepo.findByNameNotIn(Arrays.asList("virat","rahul","jadeja"));
	emp11.forEach(name -> System.out.println("employee names --------"+name.getName()));
	
	List<Employee> emp12=empRepo.getAllProducts("virat", 60000.00);
	emp12.forEach(em -> System.out.println(em.getName()+"<----------->"+em.getSalary()));

	List<String> emp13=empRepo.getAllProducts(30000.00);
	emp13.forEach(em -> System.out.println("names of all employees --->"+  em));
	

	//List<Objects[]> emp14=empRepo.getAllProducts();
	//emp14.forEach(em -> System.out.println(em[0]+ "============="+em[1]));
	
	//empRepo.updateEmployeeNameById("shreyas", 5);
	int data=empRepo.updateEmployeeNameById("shreyas", 5);
	System.out.println("updated dat is ---> "+data);
	}
}
