package com.jbhunt.infrastructure.notification.unifiedschema.dto;

public enum RecipientType {

	INTERNAL("internal"), EXTERNAL("external");

	private String recipientType;

	RecipientType(String recipientType) {
		this.recipientType = recipientType;
	}

	public String recipientType() {
		return recipientType;
	}

}
