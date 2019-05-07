package com.jbhunt.infrastructure.usernotification.subscription.dto;

import lombok.Data;

@Data
public class UserNotificationTypeDTO {

	private Integer notificationTypeID;
	
	private String notificationTypeName;

	private String notificationDescription;

	private String notificationRecipientType;

	private String notificationCategory;

	private String notificationSubCategory;

}
