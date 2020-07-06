/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2019_08_09_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import com.microsoft.azure.management.avs.v2019_08_09_preview.implementation.PrivateCloudsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing PrivateClouds.
 */
public interface PrivateClouds extends SupportsCreating<PrivateCloud.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<PrivateCloud>, SupportsListingByResourceGroup<PrivateCloud>, SupportsListing<PrivateCloud>, HasInner<PrivateCloudsInner> {
    /**
     * List the admin credentials for the private cloud.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription
     * @param privateCloudName Name of the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AdminCredentials> listAdminCredentialsAsync(String resourceGroupName, String privateCloudName);

}
