package com.jbhunt.infrastructure.edinotification.common.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jbhunt.infrastructure.notification.user.dto.UserDTO;

import lombok.Data;

@Data
public abstract class NotificationSubscriptionAuditDTO {
	protected static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
	
	protected UserDTO createdBy;

	protected UserDTO lastUpdatedBy;

	/*@JsonFormat(pattern = DATE_FORMAT)
	protected LocalDateTime createdTimestamp;*/

	@JsonFormat(pattern = DATE_FORMAT)
	protected LocalDateTime lastUpdatedTimestamp;
}