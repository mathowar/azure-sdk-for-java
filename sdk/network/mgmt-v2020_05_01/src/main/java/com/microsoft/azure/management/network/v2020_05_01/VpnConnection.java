/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2020_05_01.implementation.VpnConnectionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_05_01.implementation.NetworkManager;
import com.microsoft.azure.SubResource;
import java.util.List;
import com.microsoft.azure.management.network.v2020_05_01.implementation.VpnSiteLinkConnectionInner;

/**
 * Type representing VpnConnection.
 */
public interface VpnConnection extends HasInner<VpnConnectionInner>, Indexable, Refreshable<VpnConnection>, Updatable<VpnConnection.Update>, HasManager<NetworkManager> {
    /**
     * @return the connectionBandwidth value.
     */
    Integer connectionBandwidth();

    /**
     * @return the connectionStatus value.
     */
    VpnConnectionStatus connectionStatus();

    /**
     * @return the dpdTimeoutSeconds value.
     */
    Integer dpdTimeoutSeconds();

    /**
     * @return the egressBytesTransferred value.
     */
    Long egressBytesTransferred();

    /**
     * @return the enableBgp value.
     */
    Boolean enableBgp();

    /**
     * @return the enableInternetSecurity value.
     */
    Boolean enableInternetSecurity();

    /**
     * @return the enableRateLimiting value.
     */
    Boolean enableRateLimiting();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the ingressBytesTransferred value.
     */
    Long ingressBytesTransferred();

    /**
     * @return the ipsecPolicies value.
     */
    List<IpsecPolicy> ipsecPolicies();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the remoteVpnSite value.
     */
    SubResource remoteVpnSite();

    /**
     * @return the routingConfiguration value.
     */
    RoutingConfiguration routingConfiguration();

    /**
     * @return the routingWeight value.
     */
    Integer routingWeight();

    /**
     * @return the sharedKey value.
     */
    String sharedKey();

    /**
     * @return the useLocalAzureIpAddress value.
     */
    Boolean useLocalAzureIpAddress();

    /**
     * @return the usePolicyBasedTrafficSelectors value.
     */
    Boolean usePolicyBasedTrafficSelectors();

    /**
     * @return the vpnConnectionProtocolType value.
     */
    VirtualNetworkGatewayConnectionProtocol vpnConnectionProtocolType();

    /**
     * @return the vpnLinkConnections value.
     */
    List<VpnConnectionVpnGatewayVpnSiteLinkConnection> vpnLinkConnections();

    /**
     * The entirety of the VpnConnection definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithVpnGateway, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of VpnConnection definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a VpnConnection definition.
         */
        interface Blank extends WithVpnGateway {
        }

        /**
         * The stage of the vpnconnection definition allowing to specify VpnGateway.
         */
        interface WithVpnGateway {
           /**
            * Specifies resourceGroupName, gatewayName.
            * @param resourceGroupName The resource group name of the VpnGateway
            * @param gatewayName The name of the gateway
            * @return the next definition stage
            */
            WithCreate withExistingVpnGateway(String resourceGroupName, String gatewayName);
        }

        /**
         * The stage of the vpnconnection definition allowing to specify ConnectionBandwidth.
         */
        interface WithConnectionBandwidth {
            /**
             * Specifies connectionBandwidth.
             * @param connectionBandwidth Expected bandwidth in MBPS
             * @return the next definition stage
             */
            WithCreate withConnectionBandwidth(Integer connectionBandwidth);
        }

        /**
         * The stage of the vpnconnection definition allowing to specify ConnectionStatus.
         */
        interface WithConnectionStatus {
            /**
             * Specifies connectionStatus.
             * @param connectionStatus The connection status. Possible values include: 'Unknown', 'Connecting', 'Connected', 'NotConnected'
             * @return the next definition stage
             */
            WithCreate withConnectionStatus(VpnConnectionStatus connectionStatus);
        }

        /**
         * The stage of the vpnconnection definition allowing to specify DpdTimeoutSeconds.
         */
        interface WithDpdTimeoutSeconds {
            /**
             * Specifies dpdTimeoutSeconds.
             * @param dpdTimeoutSeconds The dead peer detection timeout for a vpn connection in seconds
             * @return the next definition stage
             */
            WithCreate withDpdTimeoutSeconds(Integer dpdTimeoutSeconds);
        }

        /**
         * The stage of the vpnconnection definition allowing to specify EnableBgp.
         */
        interface WithEnableBgp {
            /**
             * Specifies enableBgp.
             * @param enableBgp EnableBgp flag
             * @return the next definition stage
             */
            WithCreate withEnableBgp(Boolean enableBgp);
        }

        /**
         * The stage of the vpnconnection definition allowing to specify EnableInternetSecurity.
         */
        interface WithEnableInternetSecurity {
            /**
             * Specifies enableInternetSecurity.
             * @param enableInternetSecurity Enable internet security
             * @return the next definition stage
             */
            WithCreate withEnableInternetSecurity(Boolean enableInternetSecurity);
        }

        /**
         * The stage of the vpnconnection definition allowing to specify EnableRateLimiting.
         */
        interface WithEnableRateLimiting {
            /**
             * Specifies enableRateLimiting.
             * @param enableRateLimiting EnableBgp flag
             * @return the next definition stage
             */
            WithCreate withEnableRateLimiting(Boolean enableRateLimiting);
        }

        /**
         * The stage of the vpnconnection definition allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             * @param id Resource ID
             * @return the next definition stage
             */
            WithCreate withId(String id);
        }

        /**
         * The stage of the vpnconnection definition allowing to specify IpsecPolicies.
         */
        interface WithIpsecPolicies {
            /**
             * Specifies ipsecPolicies.
             * @param ipsecPolicies The IPSec Policies to be considered by this connection
             * @return the next definition stage
             */
            WithCreate withIpsecPolicies(List<IpsecPolicy> ipsecPolicies);
        }

        /**
         * The stage of the vpnconnection definition allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource
             * @return the next definition stage
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the vpnconnection definition allowing to specify RemoteVpnSite.
         */
        interface WithRemoteVpnSite {
            /**
             * Specifies remoteVpnSite.
             * @param remoteVpnSite Id of the connected vpn site
             * @return the next definition stage
             */
            WithCreate withRemoteVpnSite(SubResource remoteVpnSite);
        }

        /**
         * The stage of the vpnconnection definition allowing to specify RoutingConfiguration.
         */
        interface WithRoutingConfiguration {
            /**
             * Specifies routingConfiguration.
             * @param routingConfiguration The Routing Configuration indicating the associated and propagated route tables on this connection
             * @return the next definition stage
             */
            WithCreate withRoutingConfiguration(RoutingConfiguration routingConfiguration);
        }

        /**
         * The stage of the vpnconnection definition allowing to specify RoutingWeight.
         */
        interface WithRoutingWeight {
            /**
             * Specifies routingWeight.
             * @param routingWeight Routing weight for vpn connection
             * @return the next definition stage
             */
            WithCreate withRoutingWeight(Integer routingWeight);
        }

        /**
         * The stage of the vpnconnection definition allowing to specify SharedKey.
         */
        interface WithSharedKey {
            /**
             * Specifies sharedKey.
             * @param sharedKey SharedKey for the vpn connection
             * @return the next definition stage
             */
            WithCreate withSharedKey(String sharedKey);
        }

        /**
         * The stage of the vpnconnection definition allowing to specify UseLocalAzureIpAddress.
         */
        interface WithUseLocalAzureIpAddress {
            /**
             * Specifies useLocalAzureIpAddress.
             * @param useLocalAzureIpAddress Use local azure ip to initiate connection
             * @return the next definition stage
             */
            WithCreate withUseLocalAzureIpAddress(Boolean useLocalAzureIpAddress);
        }

        /**
         * The stage of the vpnconnection definition allowing to specify UsePolicyBasedTrafficSelectors.
         */
        interface WithUsePolicyBasedTrafficSelectors {
            /**
             * Specifies usePolicyBasedTrafficSelectors.
             * @param usePolicyBasedTrafficSelectors Enable policy-based traffic selectors
             * @return the next definition stage
             */
            WithCreate withUsePolicyBasedTrafficSelectors(Boolean usePolicyBasedTrafficSelectors);
        }

        /**
         * The stage of the vpnconnection definition allowing to specify VpnConnectionProtocolType.
         */
        interface WithVpnConnectionProtocolType {
            /**
             * Specifies vpnConnectionProtocolType.
             * @param vpnConnectionProtocolType Connection protocol used for this connection. Possible values include: 'IKEv2', 'IKEv1'
             * @return the next definition stage
             */
            WithCreate withVpnConnectionProtocolType(VirtualNetworkGatewayConnectionProtocol vpnConnectionProtocolType);
        }

        /**
         * The stage of the vpnconnection definition allowing to specify VpnLinkConnections.
         */
        interface WithVpnLinkConnections {
            /**
             * Specifies vpnLinkConnections.
             * @param vpnLinkConnections List of all vpn site link connections to the gateway
             * @return the next definition stage
             */
            WithCreate withVpnLinkConnections(List<VpnSiteLinkConnectionInner> vpnLinkConnections);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<VpnConnection>, DefinitionStages.WithConnectionBandwidth, DefinitionStages.WithConnectionStatus, DefinitionStages.WithDpdTimeoutSeconds, DefinitionStages.WithEnableBgp, DefinitionStages.WithEnableInternetSecurity, DefinitionStages.WithEnableRateLimiting, DefinitionStages.WithId, DefinitionStages.WithIpsecPolicies, DefinitionStages.WithName, DefinitionStages.WithRemoteVpnSite, DefinitionStages.WithRoutingConfiguration, DefinitionStages.WithRoutingWeight, DefinitionStages.WithSharedKey, DefinitionStages.WithUseLocalAzureIpAddress, DefinitionStages.WithUsePolicyBasedTrafficSelectors, DefinitionStages.WithVpnConnectionProtocolType, DefinitionStages.WithVpnLinkConnections {
        }
    }
    /**
     * The template for a VpnConnection update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VpnConnection>, UpdateStages.WithConnectionBandwidth, UpdateStages.WithConnectionStatus, UpdateStages.WithDpdTimeoutSeconds, UpdateStages.WithEnableBgp, UpdateStages.WithEnableInternetSecurity, UpdateStages.WithEnableRateLimiting, UpdateStages.WithId, UpdateStages.WithIpsecPolicies, UpdateStages.WithName, UpdateStages.WithRemoteVpnSite, UpdateStages.WithRoutingConfiguration, UpdateStages.WithRoutingWeight, UpdateStages.WithSharedKey, UpdateStages.WithUseLocalAzureIpAddress, UpdateStages.WithUsePolicyBasedTrafficSelectors, UpdateStages.WithVpnConnectionProtocolType, UpdateStages.WithVpnLinkConnections {
    }

    /**
     * Grouping of VpnConnection update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the vpnconnection update allowing to specify ConnectionBandwidth.
         */
        interface WithConnectionBandwidth {
            /**
             * Specifies connectionBandwidth.
             * @param connectionBandwidth Expected bandwidth in MBPS
             * @return the next update stage
             */
            Update withConnectionBandwidth(Integer connectionBandwidth);
        }

        /**
         * The stage of the vpnconnection update allowing to specify ConnectionStatus.
         */
        interface WithConnectionStatus {
            /**
             * Specifies connectionStatus.
             * @param connectionStatus The connection status. Possible values include: 'Unknown', 'Connecting', 'Connected', 'NotConnected'
             * @return the next update stage
             */
            Update withConnectionStatus(VpnConnectionStatus connectionStatus);
        }

        /**
         * The stage of the vpnconnection update allowing to specify DpdTimeoutSeconds.
         */
        interface WithDpdTimeoutSeconds {
            /**
             * Specifies dpdTimeoutSeconds.
             * @param dpdTimeoutSeconds The dead peer detection timeout for a vpn connection in seconds
             * @return the next update stage
             */
            Update withDpdTimeoutSeconds(Integer dpdTimeoutSeconds);
        }

        /**
         * The stage of the vpnconnection update allowing to specify EnableBgp.
         */
        interface WithEnableBgp {
            /**
             * Specifies enableBgp.
             * @param enableBgp EnableBgp flag
             * @return the next update stage
             */
            Update withEnableBgp(Boolean enableBgp);
        }

        /**
         * The stage of the vpnconnection update allowing to specify EnableInternetSecurity.
         */
        interface WithEnableInternetSecurity {
            /**
             * Specifies enableInternetSecurity.
             * @param enableInternetSecurity Enable internet security
             * @return the next update stage
             */
            Update withEnableInternetSecurity(Boolean enableInternetSecurity);
        }

        /**
         * The stage of the vpnconnection update allowing to specify EnableRateLimiting.
         */
        interface WithEnableRateLimiting {
            /**
             * Specifies enableRateLimiting.
             * @param enableRateLimiting EnableBgp flag
             * @return the next update stage
             */
            Update withEnableRateLimiting(Boolean enableRateLimiting);
        }

        /**
         * The stage of the vpnconnection update allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             * @param id Resource ID
             * @return the next update stage
             */
            Update withId(String id);
        }

        /**
         * The stage of the vpnconnection update allowing to specify IpsecPolicies.
         */
        interface WithIpsecPolicies {
            /**
             * Specifies ipsecPolicies.
             * @param ipsecPolicies The IPSec Policies to be considered by this connection
             * @return the next update stage
             */
            Update withIpsecPolicies(List<IpsecPolicy> ipsecPolicies);
        }

        /**
         * The stage of the vpnconnection update allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource
             * @return the next update stage
             */
            Update withName(String name);
        }

        /**
         * The stage of the vpnconnection update allowing to specify RemoteVpnSite.
         */
        interface WithRemoteVpnSite {
            /**
             * Specifies remoteVpnSite.
             * @param remoteVpnSite Id of the connected vpn site
             * @return the next update stage
             */
            Update withRemoteVpnSite(SubResource remoteVpnSite);
        }

        /**
         * The stage of the vpnconnection update allowing to specify RoutingConfiguration.
         */
        interface WithRoutingConfiguration {
            /**
             * Specifies routingConfiguration.
             * @param routingConfiguration The Routing Configuration indicating the associated and propagated route tables on this connection
             * @return the next update stage
             */
            Update withRoutingConfiguration(RoutingConfiguration routingConfiguration);
        }

        /**
         * The stage of the vpnconnection update allowing to specify RoutingWeight.
         */
        interface WithRoutingWeight {
            /**
             * Specifies routingWeight.
             * @param routingWeight Routing weight for vpn connection
             * @return the next update stage
             */
            Update withRoutingWeight(Integer routingWeight);
        }

        /**
         * The stage of the vpnconnection update allowing to specify SharedKey.
         */
        interface WithSharedKey {
            /**
             * Specifies sharedKey.
             * @param sharedKey SharedKey for the vpn connection
             * @return the next update stage
             */
            Update withSharedKey(String sharedKey);
        }

        /**
         * The stage of the vpnconnection update allowing to specify UseLocalAzureIpAddress.
         */
        interface WithUseLocalAzureIpAddress {
            /**
             * Specifies useLocalAzureIpAddress.
             * @param useLocalAzureIpAddress Use local azure ip to initiate connection
             * @return the next update stage
             */
            Update withUseLocalAzureIpAddress(Boolean useLocalAzureIpAddress);
        }

        /**
         * The stage of the vpnconnection update allowing to specify UsePolicyBasedTrafficSelectors.
         */
        interface WithUsePolicyBasedTrafficSelectors {
            /**
             * Specifies usePolicyBasedTrafficSelectors.
             * @param usePolicyBasedTrafficSelectors Enable policy-based traffic selectors
             * @return the next update stage
             */
            Update withUsePolicyBasedTrafficSelectors(Boolean usePolicyBasedTrafficSelectors);
        }

        /**
         * The stage of the vpnconnection update allowing to specify VpnConnectionProtocolType.
         */
        interface WithVpnConnectionProtocolType {
            /**
             * Specifies vpnConnectionProtocolType.
             * @param vpnConnectionProtocolType Connection protocol used for this connection. Possible values include: 'IKEv2', 'IKEv1'
             * @return the next update stage
             */
            Update withVpnConnectionProtocolType(VirtualNetworkGatewayConnectionProtocol vpnConnectionProtocolType);
        }

        /**
         * The stage of the vpnconnection update allowing to specify VpnLinkConnections.
         */
        interface WithVpnLinkConnections {
            /**
             * Specifies vpnLinkConnections.
             * @param vpnLinkConnections List of all vpn site link connections to the gateway
             * @return the next update stage
             */
            Update withVpnLinkConnections(List<VpnSiteLinkConnectionInner> vpnLinkConnections);
        }

    }
}
