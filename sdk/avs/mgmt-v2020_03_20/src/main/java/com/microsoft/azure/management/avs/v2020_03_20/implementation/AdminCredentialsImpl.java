/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2020_03_20.implementation;

import com.microsoft.azure.management.avs.v2020_03_20.AdminCredentials;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class AdminCredentialsImpl extends WrapperImpl<AdminCredentialsInner> implements AdminCredentials {
    private final AVSManager manager;
    AdminCredentialsImpl(AdminCredentialsInner inner, AVSManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AVSManager manager() {
        return this.manager;
    }

    @Override
    public String nsxtPassword() {
        return this.inner().nsxtPassword();
    }

    @Override
    public String nsxtUsername() {
        return this.inner().nsxtUsername();
    }

    @Override
    public String vcenterPassword() {
        return this.inner().vcenterPassword();
    }

    @Override
    public String vcenterUsername() {
        return this.inner().vcenterUsername();
    }

}
