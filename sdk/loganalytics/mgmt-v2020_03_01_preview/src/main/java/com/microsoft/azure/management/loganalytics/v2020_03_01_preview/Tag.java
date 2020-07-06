/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A tag of a saved search.
 */
public class Tag {
    /**
     * The tag name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The tag value.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Get the tag name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the tag name.
     *
     * @param name the name value to set
     * @return the Tag object itself.
     */
    public Tag withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tag value.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the tag value.
     *
     * @param value the value value to set
     * @return the Tag object itself.
     */
    public Tag withValue(String value) {
        this.value = value;
        return this;
    }

}
