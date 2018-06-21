/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2014_04_01.implementation.SqlManager;
import com.microsoft.azure.management.sql.v2014_04_01.implementation.CheckNameAvailabilityResponseInner;

/**
 * Type representing CheckNameAvailabilityResponse.
 */
public interface CheckNameAvailabilityResponse extends HasInner<CheckNameAvailabilityResponseInner>, HasManager<SqlManager> {
    /**
     * @return the available value.
     */
    Boolean available();

    /**
     * @return the message value.
     */
    String message();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the reason value.
     */
    CheckNameAvailabilityReason reason();

}
