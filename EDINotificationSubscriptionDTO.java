package com.jbhunt.infrastructure.edinotification.subscription.dto;


import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jbhunt.infrastructure.edinotification.loadtenderresponse.dto.LoadTenderNotificationSubscriptionDTO;
import com.jbhunt.infrastructure.edinotification.shipmentstatus.dto.ShipmentStatusNotificationSubscriptionDTO;

import lombok.Data;

@Data
public class EDINotificationSubscriptionDTO {

	private Integer shipmentNotificationSubscriptionID;

	private String tradingPartnerID;
	
	private String tradingPartnerDescription;
	
	private String nationalAccount;

	private LoadTenderNotificationSubscriptionDTO loadTenderNotificationSubscription;

	private ShipmentStatusNotificationSubscriptionDTO shipmentNotificationSubscription;
	
	private Integer inTransitTimeFrequency;
	
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime lastUpdatedTimeStamp;
    
    private String lastUpdatedBy;
    
    private String createdBy;

}
