package com.vjsmith.spring.thymeleafexample.room_web_app.models;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class StaffMember {
	
	    @Id
	    @Column(name="EMPLOYEE_ID")
	    private String employeeId;
	    @Column(name="FIRST_NAME")
	    private String firstName;
	    @Column(name="LAST_NAME")
	    private String lastName;
	    @Enumerated(EnumType.STRING)
	    private Position position;

	    public StaffMember() {
	    	this.employeeId= UUID.randomUUID().toString();
	    }

	    public StaffMember(String employeeId, String firstName, String lastName, Position position) {
	        this.employeeId = employeeId;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.position = position;
	    }

	    public String getEmployeeId() {
	        return employeeId;
	    }

	    public void setEmployeeId(String employeeId) {
	        this.employeeId = employeeId;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public Position getPosition() {
	        return position;
	    }

	    public void setPosition(Position position) {
	        this.position = position;
	    }
	 
	 
}
