// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The EffectiveNetworkSecurityGroupAssociation model. */
@Fluent
public final class EffectiveNetworkSecurityGroupAssociation {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EffectiveNetworkSecurityGroupAssociation.class);

    /*
     * The ID of the subnet if assigned.
     */
    @JsonProperty(value = "subnet")
    private SubResource subnet;

    /*
     * The ID of the network interface if assigned.
     */
    @JsonProperty(value = "networkInterface")
    private SubResource networkInterface;

    /**
     * Get the subnet property: The ID of the subnet if assigned.
     *
     * @return the subnet value.
     */
    public SubResource subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: The ID of the subnet if assigned.
     *
     * @param subnet the subnet value to set.
     * @return the EffectiveNetworkSecurityGroupAssociation object itself.
     */
    public EffectiveNetworkSecurityGroupAssociation withSubnet(SubResource subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the networkInterface property: The ID of the network interface if assigned.
     *
     * @return the networkInterface value.
     */
    public SubResource networkInterface() {
        return this.networkInterface;
    }

    /**
     * Set the networkInterface property: The ID of the network interface if assigned.
     *
     * @param networkInterface the networkInterface value to set.
     * @return the EffectiveNetworkSecurityGroupAssociation object itself.
     */
    public EffectiveNetworkSecurityGroupAssociation withNetworkInterface(SubResource networkInterface) {
        this.networkInterface = networkInterface;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
