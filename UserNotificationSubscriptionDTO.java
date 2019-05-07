package com.jbhunt.infrastructure.usernotification.subscription.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jbhunt.infrastructure.notification.user.dto.UserDTO;

import lombok.Data;

@Data
public class UserNotificationSubscriptionDTO {

	private Integer subscriptionID;
	
	private String subscriptionDomain;
	
	private String notificationSubscriptionCategory;
	
	private String notificationSubscriptionSubCategory;
	
	private List<String> notificationSubscriptionTypes;
	
	private List<UserNotificationSubscriptionCriteriaDTO> userNotificationSubscriptionCriterias;
	
	private List<UserNotificationSubscriptionDetailDTO> userNotificationSubscriptionDetails;
	
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime effectiveTimestamp;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime expirationTimestamp;
	
	private UserDTO createdBy;
	
	private UserDTO lastUpdatedBy;

	
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime createdTimestamp;
	
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime lastUpdatedTimestamp;
	
	private String status;

//JISAMP2
	private String applicationID;
	
}
