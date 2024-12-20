package com.domorecode.repository;

//import java.util.List;

//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;

//import com.domorecode.dto.StudentDTO;
import com.domorecode.entity.Student;
//@Repository//optional
public interface StudentRepository extends CrudRepository<Student, Integer> {
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
//	using SQl query
//	@Query(value="select * from STUDENT_TABLE ",nativeQuery = true)
//	public List<Student>getAllStudents();
//	
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

}
