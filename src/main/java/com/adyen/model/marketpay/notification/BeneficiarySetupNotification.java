/*
 *                       ######
 *                       ######
 * ############    ####( ######  #####. ######  ############   ############
 * #############  #####( ######  #####. ######  #############  #############
 *        ######  #####( ######  #####. ######  #####  ######  #####  ######
 * ###### ######  #####( ######  #####. ######  #####  #####   #####  ######
 * ###### ######  #####( ######  #####. ######  #####          #####  ######
 * #############  #############  #############  #############  #####  ######
 *  ############   ############  #############   ############  #####  ######
 *                                      ######
 *                               #############
 *                               ############
 *
 * Adyen Java API Library
 *
 * Copyright (c) 2017 Adyen B.V.
 * This file is open source and available under the MIT license.
 * See the LICENSE file for more info.
 */

package com.adyen.model.marketpay.notification;

import com.google.gson.annotations.SerializedName;

public class BeneficiarySetupNotification extends GenericNotification {
    @SerializedName("content")
    private BeneficiarySetupNotificationContent content;

    public BeneficiarySetupNotificationContent getContent() {
        return content;
    }

    public void setContent(BeneficiarySetupNotificationContent content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "BeneficiarySetupNotification{" + "content=" + content + '}';
    }
}
