package com.jbhunt.infrastructure.usernotification.subscription.dto;

import java.util.List;

import com.jbhunt.infrastructure.notification.user.dto.UserDTO;

import lombok.Data;

@Data
public class UserNotificationSubscriptionDetailDTO {

    private UserDTO subscribedPerson;

    private List<String> notificationSubscriptionDeliveryMethodCodes;
//jiSAMP2
    private String subscribedEmailType;
}
