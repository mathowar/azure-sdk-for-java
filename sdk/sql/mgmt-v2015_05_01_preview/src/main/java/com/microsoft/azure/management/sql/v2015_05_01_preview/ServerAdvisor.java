/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v2015_05_01_preview.implementation.AdvisorInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2015_05_01_preview.implementation.SqlManager;
import org.joda.time.DateTime;
import java.util.List;

/**
 * Type representing ServerAdvisor.
 */
public interface ServerAdvisor extends HasInner<AdvisorInner>, Indexable, Refreshable<ServerAdvisor>, Updatable<ServerAdvisor.Update>, HasManager<SqlManager> {
    /**
     * @return the advisorStatus value.
     */
    AdvisorStatus advisorStatus();

    /**
     * @return the autoExecuteStatus value.
     */
    AutoExecuteStatus autoExecuteStatus();

    /**
     * @return the autoExecuteStatusInheritedFrom value.
     */
    AutoExecuteStatusInheritedFrom autoExecuteStatusInheritedFrom();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the lastChecked value.
     */
    DateTime lastChecked();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the recommendationsStatus value.
     */
    String recommendationsStatus();

    /**
     * @return the recommendedActions value.
     */
    List<RecommendedAction> recommendedActions();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The template for a ServerAdvisor update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ServerAdvisor>, UpdateStages.WithAutoExecuteStatus {
    }

    /**
     * Grouping of ServerAdvisor update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the serveradvisor update allowing to specify AutoExecuteStatus.
         */
        interface WithAutoExecuteStatus {
            /**
             * Specifies autoExecuteStatus.
             * @param autoExecuteStatus Gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values are 'Enabled' and 'Disabled'. Possible values include: 'Enabled', 'Disabled', 'Default'
             * @return the next update stage
             */
            Update withAutoExecuteStatus(AutoExecuteStatus autoExecuteStatus);
        }

    }
}
