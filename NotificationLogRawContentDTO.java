package com.jbhunt.infrastructure.usernotification.subscription.dto;

import com.fasterxml.jackson.annotation.JsonRawValue;

import lombok.Data;
@Data
public class NotificationLogRawContentDTO {
    
    private Integer notificationRawDataId;
    @JsonRawValue
    private String notificationRawDataContent;
}
