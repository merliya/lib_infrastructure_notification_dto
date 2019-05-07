package com.jbhunt.infrastructure.omnisearch.dto;

import java.util.List;

import lombok.Data;

@Data
public class OmniSearchItemDto {
    private String id;
    private String name;
    private String idPath;
    private List<OmniSearchKeyDto> searchKeys;   
    private String url;
    private List<String> dynaVariables;  
}
