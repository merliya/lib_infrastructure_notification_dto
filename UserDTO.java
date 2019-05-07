package com.jbhunt.infrastructure.notification.user.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserDTO implements Serializable{
	
    private static final long serialVersionUID = -1550664919110660602L;

    private String id;
	
	private String firstName;
	
	private String preferredName;
	
	private String lastName;
	
	private String emailAddress;
	
	private String phoneNumber;
	
	private String jobTitle;
	
	private String contactType;
	
	private String companyName;
	
	private String type;
	
}
