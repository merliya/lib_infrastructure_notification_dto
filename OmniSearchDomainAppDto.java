package com.jbhunt.infrastructure.omnisearch.dto;

import java.util.List;

import lombok.Data;

@Data
public class OmniSearchDomainAppDto {
    private String name;
    private String id;
    private String queueName;
    private List<OmniSearchItemDto> items;
}
