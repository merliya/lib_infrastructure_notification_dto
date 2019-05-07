package com.jbhunt.infrastructure.notification.sendgrid.dto;

import lombok.Data;

@Data
public class SGBccDTO {
    private String email;
    private String name;
}
