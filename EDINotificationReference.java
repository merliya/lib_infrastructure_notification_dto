package com.jbhunt.infrastructure.edinotification.subscription.dto;

import lombok.Data;

@Data
public class EDINotificationReference {
    private String stopNumber;
    private String referenceType;
    private String referenceValue;
    private String errorMessage;
}
 