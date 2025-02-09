// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AutonomousDatabaseNationalCharacterSet resource model.
 */
@Immutable
public final class AutonomousDatabaseNationalCharacterSetProperties {
    /*
     * The Oracle Autonomous Database supported national character sets.
     */
    @JsonProperty(value = "characterSet", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String characterSet;

    /**
     * Creates an instance of AutonomousDatabaseNationalCharacterSetProperties class.
     */
    public AutonomousDatabaseNationalCharacterSetProperties() {
    }

    /**
     * Get the characterSet property: The Oracle Autonomous Database supported national character sets.
     * 
     * @return the characterSet value.
     */
    public String characterSet() {
        return this.characterSet;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
