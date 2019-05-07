package com.jbhunt.infrastructure.edinotification.subscription.dto;

import lombok.Data;

@Data
public class EDINotificationStatusDTO {
	private Integer shipmentNotificationSubscriptionID;
	private String actionOn; //shipmentStatus/ loadTender
	private String action; //activate or in-activate
}
