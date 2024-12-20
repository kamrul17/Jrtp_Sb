package com.domorecode.studentcontroller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.domorecode.entity.StudentEntity;
import com.domorecode.service.StudentService;

@Controller
public class StudentController {
	private StudentService studentService;

	private StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
	
//method to load student form
	@GetMapping("/")
	public String LoadForm() {
		return studentService.loadForm();
		
	}
	
//method to save Student form data
	@PostMapping("/submitForm")
	public String saveStudentdata(StudentEntity stud,Model model) {
		studentService.saveStudentData(stud);
		model.addAttribute("msg", "User save successfully ");
		return "welcome";
	}
	
//method to display saved Students  data
	@GetMapping("/studentDetails")
	public String displayAllStudent(Model model) {
		List<StudentEntity>students=studentService.findAllStudent();
		model.addAttribute("userlist", students);
		return "user-list";
	}
	
	
//	
	
	@GetMapping("/student/{sid}")
	public String findStudentById( @PathVariable Integer sid, Model model) {
	StudentEntity stud=studentService.findStudentById(sid);
		model.addAttribute("user", stud);
		model.addAttribute("msg", "user fetch successfully");
		return "singleUser-list";
	}
	
	
	
	
	
}
