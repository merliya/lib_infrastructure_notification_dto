package com.jbhunt.infrastructure.edinotification.subscription.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class EDINotificationResponseDTO {

    private String orderNumber;
    
    private String shipmentID;
    
    private String eventSubType;
    
    private String tradingPartner;
    
    private String transactionType;
    
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime processedDateTime;
    
    private EDINotificationReference ediReference;
    
    private Integer notificationLogId;
    
    private String status;
}
