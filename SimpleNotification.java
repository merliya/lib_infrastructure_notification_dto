package com.jbhunt.infrastructure.notification.unifiedschema.dto;

import lombok.Data;

@Data
public class SimpleNotification {
    private String type;
    private String content;
    private String userid;
    private String application;
}
