package com.domorecode.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.domorecode.entity.StudentEntity;
import com.domorecode.studentrepo.StudentRepo;

@Service
public class StudentService {

	private StudentRepo studentRepo;

	private StudentService(StudentRepo studentRepo) {

		this.studentRepo = studentRepo;
	}
	//method to load student form
	
	public String loadForm() {

		return "index";

	}
	//method to save Student form data
public void saveStudentData(StudentEntity studentEntity) {
	
	studentRepo.save(studentEntity);
	
}

//method to display saved Students  data
public List<StudentEntity> findAllStudent() {
	
	return studentRepo.findAll();
}

//method to display single Students  data
public StudentEntity findStudentById(Integer sid) {
	
	Optional<StudentEntity>student=studentRepo.findById(sid);
	if (student.isPresent()) {
		StudentEntity stu=student.get();
	return stu;
	}
	return null;
}
}
