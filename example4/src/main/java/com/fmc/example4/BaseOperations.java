package com.fmc.example4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.fmc.example4.pojo.Address;
import com.fmc.example4.pojo.Course;
import com.fmc.example4.pojo.Department;
import com.fmc.example4.pojo.Students;
import com.fmc.example4.repo.StudentRepository;

@Component
public class BaseOperations implements CommandLineRunner {
    
	@Autowired
	private StudentRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
	/*	Department d1=new Department();
		d1.setDepartmentName("EEE");
		
		Department d2=new Department();
		d2.setDepartmentName("EC");
		
		Department d3=new Department();
		d3.setDepartmentName("ME");
		
		Department d4=new Department();
		d4.setDepartmentName("CS");
		
		Department d5=new Department();
		d5.setDepartmentName("IS");
		
		Students s1=new Students();
		s1.setName("virat");
		
        Students s2=new Students();
		s2.setName("rahul");
		
		Students s3=new Students();
		s3.setName("shreyas");
		
		Students s4=new Students();
		s4.setName("jadeja");
		
		Students s5=new Students();
		s5.setName("ashwin");
		
		Students s6=new Students();
		s6.setName("bumrah");
		
		Students s7=new Students();
		s7.setName("kuldeep");
		
		Students s8=new Students();
		s8.setName("chahal");
		
		Students s9=new Students();
		s9.setName("siraj");
		
		Students s10=new Students();
		s10.setName("Gill");
		
		Students s11=new Students();
		s11.setName("Rohith");
		
		Course c1=new Course();
		c1.setCourseName("Java");
		c1.setCourseFee(50000.00);
		
		Course c2=new Course();
		c2.setCourseName("Python");
		c2.setCourseFee(45000.00);
		
		Course c3=new Course();
		c3.setCourseName("Sql");
		c3.setCourseFee(36000.00);
		
		Course c4=new Course();
		c4.setCourseName("PHP");
		c4.setCourseFee(30000.00);
		
		Course c5=new Course();
		c5.setCourseName("C#");
		c5.setCourseFee(25000.00);
		
		Course c6=new Course();
		c6.setCourseName("AWS");
		c6.setCourseFee(46000.00);
		
		
		Address a1=new Address();
		a1.setCity("Bengaluru");
		a1.setState("Karnataka");
		
		Address a2=new Address();
		a2.setCity("Chennai");
		a2.setState("Tamilnadu");
		
		Address a3=new Address();
		a3.setCity("Mubai");
		a3.setState("Maharashtra");
		
		Address a4=new Address();
		a4.setCity("Hyderabadh");
		a4.setState("Andhrapradesh");
		
		Address a5=new Address();
		a5.setCity("Munnar");
		a5.setState("Kerala");
		
		Address a6=new Address();
		a6.setCity("Bengaluru");
		a6.setState("Karnataka");
		
		
		Address a7=new Address();
		a7.setCity("pune");
		a7.setState("maharastra");
		
		
		Address a8=new Address();
		a8.setCity("Bengaluru");
		a8.setState("Karnataka");
		
		
		Address a9=new Address();
		a9.setCity("pune");
		a9.setState("maharastra");
		
		
		Address a10=new Address();
		a10.setCity("Bengaluru");
		a10.setState("Karnataka");
		
		Address a11=new Address();
		a11.setCity("bhopal");
		a11.setState("Madhyapradesh");
		
		
		s1.setDepartments(d1);
		s1.setCourses(Arrays.asList(c1,c3,c2));
		s1.setAddress(a1);
		
		s2.setDepartments(d1);
		s2.setCourses(Arrays.asList(c2,c6));
		s2.setAddress(a2);
		
		s3.setDepartments(d2);
		s3.setCourses(Arrays.asList(c4,c6));
		s3.setAddress(a3);
		
		s4.setDepartments(d2);
		s4.setCourses(Arrays.asList(c5,c1));
		s4.setAddress(a4);
		
		s5.setDepartments(d3);
		s5.setCourses(Arrays.asList(c2,c4));
		s5.setAddress(a5);
		
		s6.setDepartments(d5);
		s6.setCourses(Arrays.asList(c3,c2));
		s6.setAddress(a6);
		
		s7.setDepartments(d5);
		s7.setCourses(Arrays.asList(c1,c4,c6));
		s7.setAddress(a7);
		
		s8.setDepartments(d2);
		s8.setCourses(Arrays.asList(c3,c2,c5));
		s8.setAddress(a8);
		
		s9.setDepartments(d3);
		s9.setCourses(Arrays.asList(c5,c6));
		s9.setAddress(a9);
		
		s10.setDepartments(d4);
		s10.setCourses(Arrays.asList(c3,c4));
		s10.setAddress(a10);
		
		s11.setDepartments(d5);
		s11.setCourses(Arrays.asList(c5,c1));
		s11.setAddress(a11);
		
		repo.saveAll(Arrays.asList(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11));
		
		*/
		
		List<Students> student=repo.findAll();
	
		student.forEach(s -> System.out.println(s.getName()));
		
		for(Students s:student) {
			
			List<Course> courses=s.getCourses();
		
			courses.forEach(c -> System.out.println(c.getCourseName()+"---> "+c.getCourseFee()));
		
		    Department d=s.getDepartments();
		     
		   System.out.println(d.getDepartmentName());
		   
		   Address a=s.getAddress();
		   System.out.println(a.getCity()+"-->"+a.getState());
		    
		   }
		System.out.println("======================================");
		
		List<Students> s1=repo.getAllProducts(48000.00);
		s1.forEach(s -> System.out.println(s.getName()+"======"+s.getDepartments()));
		
		List<Students> s2=repo.getAllProducts("bengaluru");
		s2.forEach(s -> System.out.println(s.getName()+"========"+s.getAddress().getCity()));
	
		List<Students> s3=repo.getAllProducts(48000.00,"bengaluru");
		s3.forEach(s -> {
		    System.out.print(s.getName() + " ---> ");
		    
		    for (Course c : s.getCourses()) {
		        System.out.print(c.getCourseName() + " ");
		    }
		    
		    System.out.println("| " + s.getAddress().getCity());
		});
		
		List<Students> s4=repo.getAllProducts(48000.00,"mumbai","CS");
		s4.forEach(s -> {
			System.out.print(s.getName()+"---> ");
			
			for(Course c:s.getCourses()) {
				System.out.println(c.getCourseName()+"--->"+c.getCourseFee());
			}
			
			System.out.println("| "+ s.getAddress().getCity()+"--->"+s.getAddress().getState());
		
			System.out.println(s.getDepartments().getDepartmentName());
		
		});
	  
		List<String> s5=repo.getAllProducts();
		s5.forEach(s -> System.out.println(s));
		
		List<Students> s6=repo.findByDepartmentsDepartmentName("CS");
		s6.forEach(s -> System.out.println(s.getName()+"+++"+s.getDepartments().getDepartmentName()));
	
		List<Students> s7=repo.findByDepartmentsDepartmentNameAndAddressCity("EEE", "Bengaluru");
		  s7.forEach(s -> System.out.println(s.getName()+"--->"+s.getAddress().getCity()));
	
		  List<Students> s8=repo.findByCoursesCourseNameAndCoursesCourseFeeOrAddressState("python",45000.00,"karnataka");
	s8.forEach(s -> System.out.println(s.getName()+"-----"+s.getDepartments().getDepartmentName()+"===="+s.getAddress().getState()));
	
	List<Students> s9=repo.findByCoursesCourseFeeBetweenOrCoursesCourseName(30000.00, 35000.00, "python");
	   s9.forEach(s -> System.out.println(s.getName()+"=="+s.getDepartments().getDepartmentName()));
	
	   List<Students> s10=repo.findByCoursesCourseFeeLessThanAndDepartmentsDepartmentName(40000.00, "EC");
	   s10.forEach(s -> System.out.println(s.getName()+"=="+s.getDepartments().getDepartmentName()));
	
	   
	  List<Students> s11= repo.findByNameOrderByCoursesCourseFeeAsc("virat");
	 s11.forEach(s -> System.out.println(s.getName()+"=="+s.getDepartments().getDepartmentName()));
		
	   List<Students> s12=repo.findByCoursesCourseFeeOrderByNameAsc(40000.00);
	   s12.forEach(s -> System.out.println(s.getName()));
	   
	   List<Students> s13=repo.findByDepartmentsDepartmentNameNotIn(Arrays.asList("ec","me","is"));
	   s13.forEach(s -> System.out.println(s.getName()+"====>"+s.getDepartments()));
	   
	   List<Students> s14= repo.findByCoursesCourseNameContaining("va");
	   s14.forEach(s ->{ 
		   System.out.print(s.getName()+"-->");
			 
			   for(Course c:s.getCourses()) {
				   if(c.getCourseName().toLowerCase().contains("va")) {
					   
					   System.out.println(c.getCourseName());
				   }
			   }
			   
	   });
	   
	   List<Students> s15=repo.getAllProducts(46000.00, "java", "mumbai");
	   s15.forEach(s -> {
		   System.out.print(s.getName()+"--->");
		   
		   for(Course c :s.getCourses()) {
			   System.out.print(c.getCourseName()+"--->"+c.getCourseFee()+"--->");
		   }
		   
		   System.out.print(s.getAddress().getCity()+"--->"+s.getAddress().getState());
	   });
	   
	}
	
}
