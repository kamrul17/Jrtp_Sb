package com.domorecode.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.domorecode.formrepo.FormRepo;
import com.domorecode.forms.User;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class FormController {
	private FormRepo formRepo;
	public FormController(FormRepo formRepo) {
		this.formRepo=formRepo;
	}
	
	

	@GetMapping("/showAllUser")
	public String showAllUser(Model model) {
		List<User>userList=formRepo.findAll();
		model.addAttribute("userList",userList);
return "user-list";
	}
	
	
	@GetMapping("/")
	public String loadForm() {

		return "index";
	}

	@PostMapping("/submitForm")
	public String handlesubmitForm(User user, Model model) {
		System.out.println(user);
		formRepo.save(user);
		model.addAttribute("msg", "user save !!");
		return "index";
	}
	

	}
