package com.jbhunt.infrastructure.notification.exacttarget.dto;

import java.util.List;

import lombok.Data;

@Data
public class ETResponseDTO {

	private String requestId;
	
	private List<ResponseDTO> responses;
	
}
