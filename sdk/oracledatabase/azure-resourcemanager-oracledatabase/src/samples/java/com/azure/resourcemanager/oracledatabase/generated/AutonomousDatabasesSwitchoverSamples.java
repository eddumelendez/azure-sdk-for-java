// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.resourcemanager.oracledatabase.models.PeerDbDetails;

/**
 * Samples for AutonomousDatabases Switchover.
 */
public final class AutonomousDatabasesSwitchoverSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/autonomousDatabase_switchover.json
     */
    /**
     * Sample code: Perform switchover action on Autonomous Database.
     * 
     * @param manager Entry point to OracleDatabaseManager.
     */
    public static void performSwitchoverActionOnAutonomousDatabase(
        com.azure.resourcemanager.oracledatabase.OracleDatabaseManager manager) {
        manager.autonomousDatabases()
            .switchover("rg000", "databasedb1", new PeerDbDetails().withPeerDbId("peerDbId"),
                com.azure.core.util.Context.NONE);
    }
}
