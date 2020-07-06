/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2020_03_20;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.avs.v2020_03_20.implementation.AVSManager;
import java.util.List;
import com.microsoft.azure.management.avs.v2020_03_20.implementation.PrivateCloudInner;

/**
 * Type representing PrivateCloud.
 */
public interface PrivateCloud extends HasInner<PrivateCloudInner>, Resource, GroupableResourceCore<AVSManager, PrivateCloudInner>, HasResourceGroup, Refreshable<PrivateCloud>, Updatable<PrivateCloud.Update>, HasManager<AVSManager> {
    /**
     * @return the circuit value.
     */
    Circuit circuit();

    /**
     * @return the endpoints value.
     */
    Endpoints endpoints();

    /**
     * @return the identitySources value.
     */
    List<IdentitySource> identitySources();

    /**
     * @return the internet value.
     */
    InternetEnum internet();

    /**
     * @return the managementCluster value.
     */
    ManagementCluster managementCluster();

    /**
     * @return the managementNetwork value.
     */
    String managementNetwork();

    /**
     * @return the networkBlock value.
     */
    String networkBlock();

    /**
     * @return the nsxtCertificateThumbprint value.
     */
    String nsxtCertificateThumbprint();

    /**
     * @return the nsxtPassword value.
     */
    String nsxtPassword();

    /**
     * @return the provisioningNetwork value.
     */
    String provisioningNetwork();

    /**
     * @return the provisioningState value.
     */
    PrivateCloudProvisioningState provisioningState();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the vcenterCertificateThumbprint value.
     */
    String vcenterCertificateThumbprint();

    /**
     * @return the vcenterPassword value.
     */
    String vcenterPassword();

    /**
     * @return the vmotionNetwork value.
     */
    String vmotionNetwork();

    /**
     * The entirety of the PrivateCloud definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithNetworkBlock, DefinitionStages.WithSku, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of PrivateCloud definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a PrivateCloud definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the PrivateCloud definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithNetworkBlock> {
        }

        /**
         * The stage of the privatecloud definition allowing to specify NetworkBlock.
         */
        interface WithNetworkBlock {
           /**
            * Specifies networkBlock.
            * @param networkBlock The block of addresses should be unique across VNet in your subscription as well as on-premise. Make sure the CIDR format is conformed to (A.B.C.D/X) where A,B,C,D are between 0 and 255, and X is between 0 and 22
            * @return the next definition stage
*/
            WithSku withNetworkBlock(String networkBlock);
        }

        /**
         * The stage of the privatecloud definition allowing to specify Sku.
         */
        interface WithSku {
           /**
            * Specifies sku.
            * @param sku The private cloud SKU
            * @return the next definition stage
*/
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the privatecloud definition allowing to specify Circuit.
         */
        interface WithCircuit {
            /**
             * Specifies circuit.
             * @param circuit An ExpressRoute Circuit
             * @return the next definition stage
             */
            WithCreate withCircuit(Circuit circuit);
        }

        /**
         * The stage of the privatecloud definition allowing to specify IdentitySources.
         */
        interface WithIdentitySources {
            /**
             * Specifies identitySources.
             * @param identitySources vCenter Single Sign On Identity Sources
             * @return the next definition stage
             */
            WithCreate withIdentitySources(List<IdentitySource> identitySources);
        }

        /**
         * The stage of the privatecloud definition allowing to specify Internet.
         */
        interface WithInternet {
            /**
             * Specifies internet.
             * @param internet Connectivity to internet is enabled or disabled. Possible values include: 'Enabled', 'Disabled'
             * @return the next definition stage
             */
            WithCreate withInternet(InternetEnum internet);
        }

        /**
         * The stage of the privatecloud definition allowing to specify ManagementCluster.
         */
        interface WithManagementCluster {
            /**
             * Specifies managementCluster.
             * @param managementCluster The default cluster used for management
             * @return the next definition stage
             */
            WithCreate withManagementCluster(ManagementCluster managementCluster);
        }

        /**
         * The stage of the privatecloud definition allowing to specify NsxtPassword.
         */
        interface WithNsxtPassword {
            /**
             * Specifies nsxtPassword.
             * @param nsxtPassword Optionally, set the NSX-T Manager password when the private cloud is created
             * @return the next definition stage
             */
            WithCreate withNsxtPassword(String nsxtPassword);
        }

        /**
         * The stage of the privatecloud definition allowing to specify VcenterPassword.
         */
        interface WithVcenterPassword {
            /**
             * Specifies vcenterPassword.
             * @param vcenterPassword Optionally, set the vCenter admin password when the private cloud is created
             * @return the next definition stage
             */
            WithCreate withVcenterPassword(String vcenterPassword);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<PrivateCloud>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithCircuit, DefinitionStages.WithIdentitySources, DefinitionStages.WithInternet, DefinitionStages.WithManagementCluster, DefinitionStages.WithNsxtPassword, DefinitionStages.WithVcenterPassword {
        }
    }
    /**
     * The template for a PrivateCloud update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<PrivateCloud>, Resource.UpdateWithTags<Update>, UpdateStages.WithIdentitySources, UpdateStages.WithInternet, UpdateStages.WithManagementCluster {
    }

    /**
     * Grouping of PrivateCloud update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the privatecloud update allowing to specify IdentitySources.
         */
        interface WithIdentitySources {
            /**
             * Specifies identitySources.
             * @param identitySources vCenter Single Sign On Identity Sources
             * @return the next update stage
             */
            Update withIdentitySources(List<IdentitySource> identitySources);
        }

        /**
         * The stage of the privatecloud update allowing to specify Internet.
         */
        interface WithInternet {
            /**
             * Specifies internet.
             * @param internet Connectivity to internet is enabled or disabled. Possible values include: 'Enabled', 'Disabled'
             * @return the next update stage
             */
            Update withInternet(InternetEnum internet);
        }

        /**
         * The stage of the privatecloud update allowing to specify ManagementCluster.
         */
        interface WithManagementCluster {
            /**
             * Specifies managementCluster.
             * @param managementCluster The default cluster used for management
             * @return the next update stage
             */
            Update withManagementCluster(ManagementCluster managementCluster);
        }

    }
}
