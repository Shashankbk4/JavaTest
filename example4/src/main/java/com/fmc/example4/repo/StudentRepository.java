package com.fmc.example4.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fmc.example4.pojo.Students;


public interface StudentRepository extends JpaRepository<Students, Integer>{
 
	@Query("select s from Students s JOIN s.courses c where c.courseFee>:c")
	List<Students> getAllProducts(@Param("c")  Double courseFee) ;
	
	@Query("select s from Students s JOIN  s.address a where  a.city=:a")
	List<Students> getAllProducts( @Param("a") String city) ;

	@Query("SELECT s FROM Students s JOIN s.courses c JOIN s.address a WHERE c.courseFee > :fee AND a.city = :city")
	List<Students> getAllProducts(@Param("fee") Double fee, @Param("city") String city);

    @Query("SELECT s FROM Students s JOIN s.courses c JOIN s.address a JOIN s.departments d where c.courseFee>:fee OR a.city=:city OR d.departmentName=:department ")
    List<Students> getAllProducts(@Param("fee") Double fee, @Param("city") String city,@Param("department") String department);
   
   @Query("SELECT DISTINCT s.name from Students s")
   List<String> getAllProducts();
   
    List<Students>  findByDepartmentsDepartmentName(String name);

    List<Students> findByDepartmentsDepartmentNameAndAddressCity(String d,String c);

    List<Students> findByCoursesCourseNameAndCoursesCourseFeeOrAddressState(String c,Double d,String st);

    List<Students> findByCoursesCourseFeeBetweenOrCoursesCourseName(Double d1,Double d2,String c);
    
    List<Students> findByCoursesCourseFeeLessThanAndDepartmentsDepartmentName(Double d,String s);

   List<Students> findByNameOrderByCoursesCourseFeeAsc(String f);
   
   List<Students> findByCoursesCourseFeeOrderByNameAsc(Double s);
   
   List<Students> findByDepartmentsDepartmentNameNotIn(List<String> s);
   
   List<Students> findByCoursesCourseNameContaining(String s);
   
   @Query("select s from Students s JOIN s.courses c JOIN  s.address a where c.courseFee>:fee and c.courseName=:cm Or a.city=:c")
   List<Students> getAllProducts(@Param("fee") double f,@Param("cm") String n,@Param("c") String c);
}

