package com.vjsmith.spring.thymeleafexample.room_web_app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vjsmith.spring.thymeleafexample.room_web_app.data.RoomRepository;
import com.vjsmith.spring.thymeleafexample.room_web_app.models.Room;

@Service
public class RoomService {
    private static final List<Room> rooms = new ArrayList<>();
    
    private final RoomRepository roomRepository;
    
    public RoomService(RoomRepository roomRepository) {
    	this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms(){
        return roomRepository.findAll();
    }
    
    public Room getById(long id) {
    	return roomRepository.findById(id).get();
    	
    }

}
