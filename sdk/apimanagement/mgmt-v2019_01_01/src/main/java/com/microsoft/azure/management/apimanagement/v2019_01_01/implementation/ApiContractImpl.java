/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01.implementation;

import com.microsoft.azure.management.apimanagement.v2019_01_01.ApiContract;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2019_01_01.ApiCreateOrUpdateParameter;
import java.util.List;
import com.microsoft.azure.management.apimanagement.v2019_01_01.ApiType;
import com.microsoft.azure.management.apimanagement.v2019_01_01.ApiVersionSetContractDetails;
import com.microsoft.azure.management.apimanagement.v2019_01_01.AuthenticationSettingsContract;
import com.microsoft.azure.management.apimanagement.v2019_01_01.Protocol;
import com.microsoft.azure.management.apimanagement.v2019_01_01.SubscriptionKeyParameterNamesContract;
import com.microsoft.azure.management.apimanagement.v2019_01_01.ContentFormat;
import com.microsoft.azure.management.apimanagement.v2019_01_01.SoapApiType;
import com.microsoft.azure.management.apimanagement.v2019_01_01.ApiCreateOrUpdatePropertiesWsdlSelector;
import rx.functions.Func1;

class ApiContractImpl extends CreatableUpdatableImpl<ApiContract, ApiContractInner, ApiContractImpl> implements ApiContract, ApiContract.Definition, ApiContract.Update {
    private String resourceGroupName;
    private String serviceName;
    private String apiId;
    private String cifMatch;
    private String uifMatch;
    private ApiCreateOrUpdateParameter createOrUpdateParameter;
    private final ApiManagementManager manager;

    ApiContractImpl(String name, ApiManagementManager manager) {
        super(name, new ApiContractInner());
        this.manager = manager;
        // Set resource name
        this.apiId = name;
        //
        this.createOrUpdateParameter = new ApiCreateOrUpdateParameter();
    }

    ApiContractImpl(ApiContractInner inner, ApiManagementManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.apiId = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serviceName = IdParsingUtils.getValueFromIdByName(inner.id(), "service");
        this.apiId = IdParsingUtils.getValueFromIdByName(inner.id(), "apis");
        // set other parameters for create and update
        this.createOrUpdateParameter = new ApiCreateOrUpdateParameter();
    }

    @Override
    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ApiContract> createResourceAsync() {
        ApisInner client = this.manager().inner().apis();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceName, this.apiId, this.createOrUpdateParameter, this.cifMatch)
            .map(new Func1<ApiContractInner, ApiContractInner>() {
               @Override
               public ApiContractInner call(ApiContractInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ApiContract> updateResourceAsync() {
        ApisInner client = this.manager().inner().apis();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serviceName, this.apiId, this.createOrUpdateParameter, this.uifMatch)
            .map(new Func1<ApiContractInner, ApiContractInner>() {
               @Override
               public ApiContractInner call(ApiContractInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ApiContractInner> getInnerAsync() {
        ApisInner client = this.manager().inner().apis();
        return null; // NOP getInnerAsync implementation as get is not supported
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createOrUpdateParameter = new ApiCreateOrUpdateParameter();
    }

    @Override
    public String apiRevision() {
        return this.inner().apiRevision();
    }

    @Override
    public String apiRevisionDescription() {
        return this.inner().apiRevisionDescription();
    }

    @Override
    public ApiType apiType() {
        return this.inner().apiType();
    }

    @Override
    public String apiVersion() {
        return this.inner().apiVersion();
    }

    @Override
    public String apiVersionDescription() {
        return this.inner().apiVersionDescription();
    }

    @Override
    public ApiVersionSetContractDetails apiVersionSet() {
        return this.inner().apiVersionSet();
    }

    @Override
    public String apiVersionSetId() {
        return this.inner().apiVersionSetId();
    }

    @Override
    public AuthenticationSettingsContract authenticationSettings() {
        return this.inner().authenticationSettings();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String displayName() {
        return this.inner().displayName();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Boolean isCurrent() {
        return this.inner().isCurrent();
    }

    @Override
    public Boolean isOnline() {
        return this.inner().isOnline();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String path() {
        return this.inner().path();
    }

    @Override
    public List<Protocol> protocols() {
        return this.inner().protocols();
    }

    @Override
    public String serviceUrl() {
        return this.inner().serviceUrl();
    }

    @Override
    public String sourceApiId() {
        return this.inner().sourceApiId();
    }

    @Override
    public SubscriptionKeyParameterNamesContract subscriptionKeyParameterNames() {
        return this.inner().subscriptionKeyParameterNames();
    }

    @Override
    public Boolean subscriptionRequired() {
        return this.inner().subscriptionRequired();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ApiContractImpl withResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    @Override
    public ApiContractImpl withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    @Override
    public ApiContractImpl withPath(String path) {
        this.createOrUpdateParameter.withPath(path);
        return this;
    }

    @Override
    public ApiContractImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.cifMatch = ifMatch;
        } else {
            this.uifMatch = ifMatch;
        }
        return this;
    }

    @Override
    public ApiContractImpl withApiRevision(String apiRevision) {
        this.createOrUpdateParameter.withApiRevision(apiRevision);
        return this;
    }

    @Override
    public ApiContractImpl withApiRevisionDescription(String apiRevisionDescription) {
        this.createOrUpdateParameter.withApiRevisionDescription(apiRevisionDescription);
        return this;
    }

    @Override
    public ApiContractImpl withApiType(ApiType apiType) {
        this.createOrUpdateParameter.withApiType(apiType);
        return this;
    }

    @Override
    public ApiContractImpl withApiVersion(String apiVersion) {
        this.createOrUpdateParameter.withApiVersion(apiVersion);
        return this;
    }

    @Override
    public ApiContractImpl withApiVersionDescription(String apiVersionDescription) {
        this.createOrUpdateParameter.withApiVersionDescription(apiVersionDescription);
        return this;
    }

    @Override
    public ApiContractImpl withApiVersionSet(ApiVersionSetContractDetails apiVersionSet) {
        this.createOrUpdateParameter.withApiVersionSet(apiVersionSet);
        return this;
    }

    @Override
    public ApiContractImpl withApiVersionSetId(String apiVersionSetId) {
        this.createOrUpdateParameter.withApiVersionSetId(apiVersionSetId);
        return this;
    }

    @Override
    public ApiContractImpl withAuthenticationSettings(AuthenticationSettingsContract authenticationSettings) {
        this.createOrUpdateParameter.withAuthenticationSettings(authenticationSettings);
        return this;
    }

    @Override
    public ApiContractImpl withDescription(String description) {
        this.createOrUpdateParameter.withDescription(description);
        return this;
    }

    @Override
    public ApiContractImpl withDisplayName(String displayName) {
        this.createOrUpdateParameter.withDisplayName(displayName);
        return this;
    }

    @Override
    public ApiContractImpl withFormat(ContentFormat format) {
        this.createOrUpdateParameter.withFormat(format);
        return this;
    }

    @Override
    public ApiContractImpl withIsCurrent(Boolean isCurrent) {
        this.createOrUpdateParameter.withIsCurrent(isCurrent);
        return this;
    }

    @Override
    public ApiContractImpl withProtocols(List<Protocol> protocols) {
        this.createOrUpdateParameter.withProtocols(protocols);
        return this;
    }

    @Override
    public ApiContractImpl withServiceUrl(String serviceUrl) {
        this.createOrUpdateParameter.withServiceUrl(serviceUrl);
        return this;
    }

    @Override
    public ApiContractImpl withSoapApiType(SoapApiType soapApiType) {
        this.createOrUpdateParameter.withSoapApiType(soapApiType);
        return this;
    }

    @Override
    public ApiContractImpl withSourceApiId(String sourceApiId) {
        this.createOrUpdateParameter.withSourceApiId(sourceApiId);
        return this;
    }

    @Override
    public ApiContractImpl withSubscriptionKeyParameterNames(SubscriptionKeyParameterNamesContract subscriptionKeyParameterNames) {
        this.createOrUpdateParameter.withSubscriptionKeyParameterNames(subscriptionKeyParameterNames);
        return this;
    }

    @Override
    public ApiContractImpl withSubscriptionRequired(Boolean subscriptionRequired) {
        this.createOrUpdateParameter.withSubscriptionRequired(subscriptionRequired);
        return this;
    }

    @Override
    public ApiContractImpl withValue(String value) {
        this.createOrUpdateParameter.withValue(value);
        return this;
    }

    @Override
    public ApiContractImpl withWsdlSelector(ApiCreateOrUpdatePropertiesWsdlSelector wsdlSelector) {
        this.createOrUpdateParameter.withWsdlSelector(wsdlSelector);
        return this;
    }

}