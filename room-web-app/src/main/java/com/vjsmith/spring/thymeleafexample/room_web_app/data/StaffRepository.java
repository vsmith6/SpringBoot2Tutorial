package com.vjsmith.spring.thymeleafexample.room_web_app.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vjsmith.spring.thymeleafexample.room_web_app.models.StaffMember;

public interface StaffRepository extends JpaRepository<StaffMember, String> {

}
