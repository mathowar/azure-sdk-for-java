/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.vmwarecloudsimple.v2019_04_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for OperationOrigin.
 */
public enum OperationOrigin {
    /** Enum value user. */
    USER("user"),

    /** Enum value system. */
    SYSTEM("system"),

    /** Enum value user,system. */
    USERSYSTEM("user,system");

    /** The actual serialized value for a OperationOrigin instance. */
    private String value;

    OperationOrigin(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a OperationOrigin instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed OperationOrigin object, or null if unable to parse.
     */
    @JsonCreator
    public static OperationOrigin fromString(String value) {
        OperationOrigin[] items = OperationOrigin.values();
        for (OperationOrigin item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}