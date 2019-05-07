package com.jbhunt.infrastructure.edinotification.shipmentstatus.dto;

import java.util.List;

import lombok.Data;

@Data
public class PartyAssociationDetailDTO extends LocationDetailDTO {
	private String partyId;
	private String partyRoleCode;
	private String businessUnit;
	private List<String> serviceOffering;
}
