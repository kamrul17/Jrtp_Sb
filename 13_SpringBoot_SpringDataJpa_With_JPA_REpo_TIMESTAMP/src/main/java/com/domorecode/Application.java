package com.domorecode;

//import java.util.List;
//import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.data.jpa.repository.Modifying;

import com.domorecode.entity.Student;
//import com.domorecode.entity.Student;
//import com.domorecode.dto.StudentDTO;
//import com.domorecode.entity.Student;
import com.domorecode.repository.StudentRepository;

//import jakarta.transaction.Transactional;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		StudentRepository studentRepository=context.getBean(StudentRepository.class);
		System.out.println(studentRepository.getClass().getName());
		
//		HARD AND SOFT DELETE
		
//		Student s=new Student(1, "loopy", 100l, "female", "Y");
//		studentRepository.save(s);
//		soft delete example
		Student s=studentRepository.findById(1).get();
		s.setActiveSw("N");
		studentRepository.save(s);
		
		
		
		
//		//	TIMESTAMP IN SPRING DATAJPA
//		Student s=new  Student(1,"kop",1892l,"male");
//		studentRepository.save(s);
		
		
		
		
//		##############################
//		studentRepository.updateStudentByIDAndGender(2,"female");
//		studentRepository.createUser(11,"female","yip",2990l);
//		System.out.println(studentRepository.getStudentById(1));
//		studentRepository.deleteStudentByID(10);
//		System.out.println("deleted");

		
		
		
//	##############################################################	
//		List<Student>st=studentRepository.findAll();
//		st.forEach(System.out::println);
		
//		PAGINATION and sorting
		
		
//		  int pageNumber = 0; // First page (0-indexed)
//	        int pageSize = 3;   // Number of records per page

//	       Scanner sc=new Scanner(System.in);
//	       int pageNumber =  sc.nextInt();
//	       int pageSize =  sc.nextInt();
	             
//	        Pageable pageable = PageRequest.of(pageNumber-1, pageSize);
//	       Pageable pageable=   PageRequest.of(pageNumber, pageSize,  Sort.by("rank"));
//	        Page<Student> studentPage = studentRepository.findAll(pageable);
//	        studentPage.forEach(System.out::println);
//		only SORT
		
//		List<Student>std=studentRepository.findAll(Sort.by("rank"));
//		std.forEach(System.out::println);
//			List<Student>std=studentRepository.findAll(Sort.by("name"));
//			std.forEach(System.out::println);
//		List<Student>std=studentRepository.findAll(Sort.by("name").descending());
//		std.forEach(System.out::println);
//		COMBINE SORTING AND PAGINATION
		
//		QUERYBYEXAMPLE use for filter/use AND operator 
//		Student s=new Student();
//		s.setGender("female");
//		s.setRank(2l);
//		
//		Example<Student>example=Example.of(s);
//		System.out.println("example------------: "+example);
//		List<Student>st=studentRepository.findAll(example);
//		st.forEach(System.out::println);
//		// Get the count of matching students
//		long count = studentRepository.count(example);
//		System.out.println("Count of matching students: " + count);
		
		
		
		
//		##################################
//		##################################
//		##################################
//		##################################
//		##################################
		
//	#############	CRud REpositor###############
//		Student s=new Student();
//		s.setId(5);
//		s.setName("john");
//		s.setRank(1l);
//		s.setGender("female");
//		studentRepository.save(s);
//		-----------------
//		List<Student>st= studentRepository.findAll();
//		st.forEach(System.out::println);
//		
//	Optional<Student>optional=	studentRepository.findById(1);
//	if (optional.isPresent()) {
//		System.out.println(optional.get());
//	}
//		-----------------
//		Optional<Student>optional=studentRepository.findById(1);
//		if (optional.isPresent()) {
//		    System.out.println(optional.get());
//		} else {
//		    System.out.println("Student not found");
//		}
//		-----------------
//		Iterable<Student>students=studentRepository.findAll();
//		
//		for (Student student : students) {
//		    System.out.println(student);
//		}
//--------------------------------------------------
//		Optional<Student>optional=studentRepository.findById(1);
//		if (optional.isPresent()) {
//		 Student s2= optional.get();
//		 s2.setName("updname");
//		 s2.setRank(10009l);
//		 s2.setGender("female");
//		 studentRepository.save(s2);
//		} else {
//		    System.out.println("Student not updated");
//		}
//		-------------------
//		Optional<Student>optional=studentRepository.findById(1);
//		if (optional.isPresent()) {
//			int id=optional.get().getId();
//		studentRepository.deleteById(id);
//		} else {
//		    System.out.println("Student not updated");
//		}
//	
//		Optional<Student>optional=studentRepository.findById(2);
//		if (optional.isPresent()) {
//		Student	student=optional.get();
//		studentRepository.delete(student);
//		} else {
//		    System.out.println("Student not updated");
//		}
//		Optional<Student>optional=studentRepository.findById(3);
//		if (optional.isPresent()) {
//		
//		studentRepository.deleteById(3);;
//		} else {
//		    System.out.println("Student not updated");
//		}
//		existsByID 
//		if(studentRepository.existsById(11)) {
//			studentRepository.deleteById(11);
//		}
////		__________________________________________________
//	     Student student1 = new Student();
//	        student1.setId(9);
//	        student1.setName("sxaJohn");
//	        student1.setRank(1L);
//	        student1.setGender("Male");
//
//	        Student student2 = new Student();
//	        student2.setId(10);
//	        student2.setName("Jane");
//	        student2.setRank(2L);
//	        student2.setGender("Female");
//
//	        Student student3 = new Student();
//	        student3.setId(11);
//	        student3.setName("Mike");
//	        student3.setRank(3L);
//	        student3.setGender("Male");
//	        
//	        List<Student>students=new ArrayList<>();
//	        students.add(student1);
//	        students.add(student2);
//	        students.add(student3);
//		studentRepository.saveAll(students);
//		=================FINDBYMETHOD=============
//		List<Student>results=studentRepository.findByGender("female");
//	results.forEach(System.out::println);
//	---------
//	List<Student>results1=studentRepository.findByRankGreaterThanEqual(2l);
//	results1.forEach(System.out::println);
//		List<Student>results1=studentRepository.findByRankLessThanEqual(2l);
//		results1.forEach(System.out::println);
//		List<Student>results1=studentRepository.findByRankGreaterThanEqualAndGender(2l,"female");
//		results1.forEach(System.out::println);
		
//		-----------------
//		List<Student>results2=studentRepository.findByNameStartsWith('m');
//		results2.forEach(System.out::println);
//	==========================================
//		CUSTOM QUERIES
//		==========================================
//		List<Student>studs=studentRepository.getAllStudents();
//        System.out.println(studs);
//		List<Student>studs1=studentRepository.getStudents();
//        System.out.println(studs1);
//		----------
//		List<StudentDTO> students = studentRepository.getStudents();
//		for (StudentDTO student : students) {
//		    System.out.println("Rank: " + student.getRank() + ", Gender: " + student.getGender());
//		}

	}

}
