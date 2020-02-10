/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azurestack.v2017_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.azurestack.v2017_06_01.implementation.AzureStackManager;
import com.microsoft.azure.management.azurestack.v2017_06_01.implementation.ExtendedProductInner;
import java.util.List;

/**
 * Type representing ExtendedProduct.
 */
public interface ExtendedProduct extends HasInner<ExtendedProductInner>, HasManager<AzureStackManager> {
    /**
     * @return the computeRole value.
     */
    ComputeRole computeRole();

    /**
     * @return the dataDiskImages value.
     */
    List<DataDiskImage> dataDiskImages();

    /**
     * @return the galleryPackageBlobSasUri value.
     */
    String galleryPackageBlobSasUri();

    /**
     * @return the isSystemExtension value.
     */
    Boolean isSystemExtension();

    /**
     * @return the osDiskImage value.
     */
    OsDiskImage osDiskImage();

    /**
     * @return the productKind value.
     */
    String productKind();

    /**
     * @return the supportMultipleExtensions value.
     */
    Boolean supportMultipleExtensions();

    /**
     * @return the uri value.
     */
    String uri();

    /**
     * @return the version value.
     */
    String version();

    /**
     * @return the vmOsType value.
     */
    OperatingSystem vmOsType();

    /**
     * @return the vmScaleSetEnabled value.
     */
    Boolean vmScaleSetEnabled();

}