/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Configuration needed to perform TLS termination &amp; initiation.
 */
public class FirewallPolicyTransportSecurity {
    /**
     * The CA used for intermediate CA generation.
     */
    @JsonProperty(value = "certificateAuthority")
    private FirewallPolicyCertificateAuthority certificateAuthority;

    /**
     * List of domains which are excluded from TLS termination.
     */
    @JsonProperty(value = "excludedDomains")
    private List<String> excludedDomains;

    /**
     * Certificates which are to be trusted by the firewall.
     */
    @JsonProperty(value = "trustedRootCertificates")
    private List<FirewallPolicyTrustedRootCertificate> trustedRootCertificates;

    /**
     * Get the CA used for intermediate CA generation.
     *
     * @return the certificateAuthority value
     */
    public FirewallPolicyCertificateAuthority certificateAuthority() {
        return this.certificateAuthority;
    }

    /**
     * Set the CA used for intermediate CA generation.
     *
     * @param certificateAuthority the certificateAuthority value to set
     * @return the FirewallPolicyTransportSecurity object itself.
     */
    public FirewallPolicyTransportSecurity withCertificateAuthority(FirewallPolicyCertificateAuthority certificateAuthority) {
        this.certificateAuthority = certificateAuthority;
        return this;
    }

    /**
     * Get list of domains which are excluded from TLS termination.
     *
     * @return the excludedDomains value
     */
    public List<String> excludedDomains() {
        return this.excludedDomains;
    }

    /**
     * Set list of domains which are excluded from TLS termination.
     *
     * @param excludedDomains the excludedDomains value to set
     * @return the FirewallPolicyTransportSecurity object itself.
     */
    public FirewallPolicyTransportSecurity withExcludedDomains(List<String> excludedDomains) {
        this.excludedDomains = excludedDomains;
        return this;
    }

    /**
     * Get certificates which are to be trusted by the firewall.
     *
     * @return the trustedRootCertificates value
     */
    public List<FirewallPolicyTrustedRootCertificate> trustedRootCertificates() {
        return this.trustedRootCertificates;
    }

    /**
     * Set certificates which are to be trusted by the firewall.
     *
     * @param trustedRootCertificates the trustedRootCertificates value to set
     * @return the FirewallPolicyTransportSecurity object itself.
     */
    public FirewallPolicyTransportSecurity withTrustedRootCertificates(List<FirewallPolicyTrustedRootCertificate> trustedRootCertificates) {
        this.trustedRootCertificates = trustedRootCertificates;
        return this;
    }

}
