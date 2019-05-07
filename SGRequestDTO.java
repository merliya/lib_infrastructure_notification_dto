package com.jbhunt.infrastructure.notification.sendgrid.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class SGRequestDTO {
    private SGFromDTO from;
    @JsonProperty("attachments")
    private List<SGAttachmentsDTO> sgAttachmentsDTOS = null;
    @JsonProperty("personalizations")
    private List<SGPersonalizationDTO> sgPersonalizationDTOS = null;
    @JsonProperty("template_id")
    private String templateId;
}
