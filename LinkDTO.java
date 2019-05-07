package com.jbhunt.infrastructure.notification.favorite.dto;

import lombok.Data;

@Data
public class LinkDTO {

	private String link;
	private String name;
	private String text;
	private String title;
	private Boolean favorite;
	
}
