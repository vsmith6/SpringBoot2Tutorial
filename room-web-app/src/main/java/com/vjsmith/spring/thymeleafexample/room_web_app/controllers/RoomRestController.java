package com.vjsmith.spring.thymeleafexample.room_web_app.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vjsmith.spring.thymeleafexample.room_web_app.models.Room;
import com.vjsmith.spring.thymeleafexample.room_web_app.service.RoomService;

@RestController
@RequestMapping("/api/rooms")
public class RoomRestController{
	
	private final RoomService roomService;
	
	public RoomRestController(RoomService roomService) {
		this.roomService = roomService;
	}
	
	@GetMapping
	public List<Room> getAllRooms(){
		return roomService.getAllRooms();
	}
		
}
