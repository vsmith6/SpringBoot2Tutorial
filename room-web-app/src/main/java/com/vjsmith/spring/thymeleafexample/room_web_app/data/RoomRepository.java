package com.vjsmith.spring.thymeleafexample.room_web_app.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vjsmith.spring.thymeleafexample.room_web_app.models.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {
	
}
