package com.jbhunt.infrastructure.notification.unifiedschema.dto;

public enum NotificationDeliveryChannel {

	EMAIL("email"), EMAILINT("emailInt"), TEXT("text"), INAPP("in-app"), EDI("edi");

	private String notificationDeliveryChannel;

	NotificationDeliveryChannel(String notificationDeliveryChannel) {
		this.notificationDeliveryChannel = notificationDeliveryChannel;
	}

	public String notificationDeliveryChannel() {
		return notificationDeliveryChannel;
	}

}
