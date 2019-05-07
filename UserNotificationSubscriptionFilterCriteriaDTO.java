package com.jbhunt.infrastructure.usernotification.subscription.dto;

import java.util.List;

import com.jbhunt.infrastructure.notification.user.dto.UserDTO;

import lombok.Data;

@Data
public class UserNotificationSubscriptionFilterCriteriaDTO {
	
     private List<String> subscriptionCategories;
     
     private List<String> subscriptionSubCategories;
     
     private List<String> subscriptionTypes;
     
     private List<String> subscriptionCriterias;
     
     private List<UserDTO> subscribedUsers;
     
     private List<UserDTO> createdBy;
     
     private List<UserDTO> lastUpdatedBy;
     
     private List<String> status;
     
	
}
