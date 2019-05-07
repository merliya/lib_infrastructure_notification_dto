package com.jbhunt.infrastructure.omnisearch.dto;

import java.util.Set;

import lombok.Data;
@Data
public class OmniSearchKeysIndexDto {
  
    private String domainAppId;
    private String itemId;
    private String domainAppName;
    private String subDomainAppName;
    private Set<OmniSearchKeyIndexDto> searchkeys;
    private String url; 
}
