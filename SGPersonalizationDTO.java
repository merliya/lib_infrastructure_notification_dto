package com.jbhunt.infrastructure.notification.sendgrid.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class SGPersonalizationDTO {
    private List<SGToDTO> to = null;
    private List<SGCcDTO> cc = null;
    private List<SGBccDTO> bcc = null;
    @JsonProperty("dynamic_template_data")
    private Map<String, Object> dynamicTemplateData;
}
