/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_10_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ElasticPoolState.
 */
public final class ElasticPoolState extends ExpandableStringEnum<ElasticPoolState> {
    /** Static value Creating for ElasticPoolState. */
    public static final ElasticPoolState CREATING = fromString("Creating");

    /** Static value Ready for ElasticPoolState. */
    public static final ElasticPoolState READY = fromString("Ready");

    /** Static value Disabled for ElasticPoolState. */
    public static final ElasticPoolState DISABLED = fromString("Disabled");

    /**
     * Creates or finds a ElasticPoolState from its string representation.
     * @param name a name to look for
     * @return the corresponding ElasticPoolState
     */
    @JsonCreator
    public static ElasticPoolState fromString(String name) {
        return fromString(name, ElasticPoolState.class);
    }

    /**
     * @return known ElasticPoolState values
     */
    public static Collection<ElasticPoolState> values() {
        return values(ElasticPoolState.class);
    }
}
