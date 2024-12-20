package com.domorecode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

//import com.domorecode.dto.StudentDTO;
import com.domorecode.entity.Student;

import jakarta.transaction.Transactional;
//@Repository//optional
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	

	 
	
	

	

	
	
	
	
//	==========================================
//	FINDBYxx METHOD
//=========================================
//public List<Student>findByGender(String gender);
//public List<Student>findByRankGreaterThanEqual(Long rank);
//	public List<Student>findByRankLessThanEqual(Long rank);
//	public List<Student>findByRankGreaterThanEqualAndGender(Long rank,String gender);
	//	public List<Student>findByNameStartsWith(Character c);
//	==========================================
//	CUSTOM QUERIES
//	==========================================
//	___________________using custom SQl query______________________________
//	@Query(value="select * from STUDENT_TABLE ",nativeQuery = true)
//	public List<Student>getAllStudents();
//		@Query(value="select * from STUDENT_TABLE where id=:sid",nativeQuery = true)
//	public Student getStudentById(@Param("sid")Integer sid);
//	---
//	  @Transactional
//	    @Modifying
//	    @Query(value = "UPDATE STUDENT_TABLE SET student_name = 'updopJohn', student_gender = :sgender WHERE id = :sid", nativeQuery = true)
//	    public void updateStudentByIDAndGender(@Param("sid") Integer sid,@Param("sgender")String sgender);
//	-----
//	@Transactional
//	@Modifying
//	@Query(value = "delete from STUDENT_TABLE WHERE id = :sid", nativeQuery = true)
//	public void deleteStudentByID(@Param("sid")Integer sid);
	
	
//	@Transactional
//	@Modifying
//	@Query(value="insert into STUDENT_TABLE (id, student_gender, student_name, student_rank)  values(:sid,:sgender,:sname,:srank)" ,nativeQuery = true)
//	public void createUser(@Param("sid")Integer sid,@Param("sgender")String sgender,@Param("sname")String sname,@Param("srank")Integer srank);
//		___________________end SQl query______________________________
//	----------------using HQl query------------------
//	@Query("from Student")
//	public List<Student>getStudents();
//	@Query("from Student where gender='female'")
//	public List<Student>getStudents();
//	@Query("from Student where rank>=2")
//	public List<Student>getStudents();
//	@Query("from Student where gender='male' and rank>=2")
//	public List<Student>getStudents();
	

//    @Query("select new com.domorecode.dto.StudentDTO(s.rank, s.gender) from Student s")
//    List<StudentDTO> getStudents();

//	----Non- select query require this two annotation
//	--------
//	@Transactional
//	@Modifying
//	@Query("delete from Student where id=:sid")
//	public void deleteStudentByID(Integer sid);
//-----------
//		@Transactional
//	@Modifying
//	@Query("update Student set gender=:sgender where id=:sid")
//	public void updateStudentByIDAndGender(Integer sid,String sgender);
//	------
//	@Query("from Student where id=:sid")
//	public Student getStudentById(Integer sid);
//	---------
	@Transactional
	@Modifying
	@Query("insert into Student (id, gender, name, rank)  values(:sid,:sgender,:sname,:srank)" )
	public void createUser(Integer sid,String sgender,String sname,Long srank);
}
