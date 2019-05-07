package com.jbhunt.infrastructure.notification.sendgrid.dto;

import lombok.Data;

@Data
public class SGAttachmentsDTO {
    private String content;
    private String type;
    private String filename;
    private String disposition;
    private String content_id;
}
