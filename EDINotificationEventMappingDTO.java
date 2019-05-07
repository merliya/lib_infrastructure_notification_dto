package com.jbhunt.infrastructure.edinotification.subscription.dto;


import java.util.List;

import lombok.Data;

@Data
public class EDINotificationEventMappingDTO {

	private Integer eventId;
	
	private String eventName;

	private List<String> eventBUSOAssociationList;

}
