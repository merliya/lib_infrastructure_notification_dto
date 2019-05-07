package com.jbhunt.infrastructure.edinotification.subscription.dto;

public enum EDINotificationType {
    SHIPMENT_STATUS("214"), LOAD_TENDER("990");
    private String code;
    private EDINotificationType(String code) {
        this.code = code;
    }
    public String getCode(){
        return this.code;
    }
}
