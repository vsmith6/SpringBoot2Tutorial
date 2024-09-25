package com.vjsmith.spring.thymeleafexample.room_web_app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.vjsmith.spring.thymeleafexample.room_web_app.data.StaffRepository;
import com.vjsmith.spring.thymeleafexample.room_web_app.models.Position;
import com.vjsmith.spring.thymeleafexample.room_web_app.models.StaffMember;

@Service
public class StaffService {
 //   private static final List<StaffMember> staff = new ArrayList<>();
    
    public final StaffRepository staffRepository;
    
    public StaffService(StaffRepository staffRepository) {
    	this.staffRepository = staffRepository;
    	
    }

    public List<StaffMember> getAllStaff(){
        return staffRepository.findAll();
    }

}
