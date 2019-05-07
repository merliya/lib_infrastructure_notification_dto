package com.jbhunt.infrastructure.edinotification.subscription.dto;

public enum PartyRoleType {
    BILL_TO("BILL TO"), LINE_OF_BUSINESS("BusinessLine");
    private String code;
    private PartyRoleType(String code) {
        this.code = code;
    }
    public String getCode(){
        return this.code;
    }
}
