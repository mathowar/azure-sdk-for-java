// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** The CreateRuleBody model. */
@JacksonXmlRootElement(localName = "entry", namespace = "http://www.w3.org/2005/Atom")
@Fluent
public final class CreateRuleBody {
    /*
     * RuleDescription for the new Rule.
     */
    @JacksonXmlProperty(localName = "content", namespace = "http://www.w3.org/2005/Atom")
    private CreateRuleBodyContent content;

    /**
     * Get the content property: RuleDescription for the new Rule.
     *
     * @return the content value.
     */
    public CreateRuleBodyContent getContent() {
        return this.content;
    }

    /**
     * Set the content property: RuleDescription for the new Rule.
     *
     * @param content the content value to set.
     * @return the CreateRuleBody object itself.
     */
    public CreateRuleBody setContent(CreateRuleBodyContent content) {
        this.content = content;
        return this;
    }
}
