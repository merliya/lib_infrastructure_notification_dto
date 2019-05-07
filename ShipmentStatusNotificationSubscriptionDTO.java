package com.jbhunt.infrastructure.edinotification.shipmentstatus.dto;

import java.util.List;

import com.jbhunt.infrastructure.edinotification.common.dto.NotificationSubscriptionCommonDTO;

import lombok.Data;

@Data
public class ShipmentStatusNotificationSubscriptionDTO extends NotificationSubscriptionCommonDTO{

    private String businessUnit;

    private List<String> servicesOffering; 

    private CustomerLocationConfigurationDTO customerLocationConfig;
    
    private Short batchFrequency;
    
    private HoldStatusDetailDTO holdStatusDetail;
    
    private String referenceTypeCode;
    
    private String referenceTypeDescription;
    
    private Character sendStatusOnlyForEDIOrders;
    
}
