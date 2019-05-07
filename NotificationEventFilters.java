package com.jbhunt.infrastructure.notification.unifiedschema.dto;

import java.util.List;

import lombok.Data;

@Data
public class NotificationEventFilters {

	private List<String> orderNumber;

	private List<String> billTo;

	private List<String> lineOfBusiness;

	private List<String> pickupLocation;

	private List<String> deliveryLocation;

	private List<String> solicitorCode;

	private List<String> nationalAccount;

	private List<String> orderOwner;

	private List<String> tradingPartner;

	private List<String> carrierCode;

	private List<String> billingParty;

	private List<String> businessUnit;

	private List<String> serviceOffering;

	private List<String> originMarketingArea;

	private List<String> associatedUser;

	private List<Integer> tradingPartnerID;

	private List<String> shipper;

	private List<String> receiver;

	private List<String> intermediateStop;

	private List<String> createUser;

	private List<String> subscribedUser;

	private List<String> solicitor;

	private List<String> desk;

	private List<Integer> destinationMarketingArea;

	private List<Integer> originCapacityArea;

	private List<Integer> destinationCapacityArea;

	private Integer daysTillExpiration;

	private Integer weeksFromLatestActiveEffectiveDate;

	private List<String> stopClass;

	private List<String> stopType;

	private List<String> holdEventType;
	
	private List<String> ediSource;

}
