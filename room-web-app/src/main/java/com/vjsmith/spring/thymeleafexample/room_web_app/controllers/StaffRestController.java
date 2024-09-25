package com.vjsmith.spring.thymeleafexample.room_web_app.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vjsmith.spring.thymeleafexample.room_web_app.models.StaffMember;
import com.vjsmith.spring.thymeleafexample.room_web_app.service.StaffService;

@RestController
@RequestMapping("/api/staff")
public class StaffRestController{
	
	private final StaffService staffService;
	
	public StaffRestController(StaffService staffService) {
		this.staffService = staffService;
	}
	
	@GetMapping
	public List<StaffMember> getAllStaff(){
		return staffService.getAllStaff();
	}
		
}
