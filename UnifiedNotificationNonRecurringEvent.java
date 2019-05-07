package com.jbhunt.infrastructure.notification.unifiedschema.dto;

import java.io.Serializable;
import java.util.List;

import com.jbhunt.infrastructure.notification.user.dto.UserDTO;

import lombok.Data;

@Data
public class UnifiedNotificationNonRecurringEvent implements Serializable{

    private static final long serialVersionUID = -6154729345138447395L;

    private String applicationDomainCode;

	private NotificationDeliveryChannel notificationDeliveryChannel;

	private Integer notificationRawDataID;

	private Integer userNotificationSubscriptionDetailID;

	private UserDTO subscriberUser;

	private NotificationSubscriptionInAppDTO notificationSubscriptionInAppContent;

	private NotificationSubscriptionMessageDTO notificationSubscriptionMessageContent;

	private NotificationSubscriptionEmailContent notificationSubscriptionEmailContent;
	
	private String  notificationSubscriptionEDIContent;
	
	private Integer ediNotificationSubscriptionDetailID;
	
	private List<Integer> batchOfNotificationRawDataIDs;

	private String notificationSubscriptionType;

}
