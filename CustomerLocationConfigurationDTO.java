package com.jbhunt.infrastructure.edinotification.shipmentstatus.dto;

import java.util.List;

import lombok.Data;

@Data
public class CustomerLocationConfigurationDTO {

	private List<PartyAssociationDetailDTO> billTo;
	private List<PartyAssociationDetailDTO> lineOfBusiness;
	private List<LocationDetailDTO> pickUpLocations;
	private List<LocationDetailDTO> deliveryLocations;

}
