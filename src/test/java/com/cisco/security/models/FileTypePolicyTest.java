/**
 * Copyright (c) Cisco Systems 2016. All rights reserved.
 */
package com.cisco.security.models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FileTypePolicyTest {
    //TIP: Your tests should always describe the behaviour of your application's interface
    @Test
    public void should_mark_two_file_type_policies_with_same_mime_type_and_action_as_equal() {
        FileTypePolicy first = new FileTypePolicy();
        first.setMimeType("application/xml");
        first.setPolicyAction(FileTypePolicy.PolicyAction.ALLOW);
        FileTypePolicy second = new FileTypePolicy();
        second.setMimeType(first.getMimeType());
        second.setPolicyAction(first.getPolicyAction());

        assertEquals(first, second);
    }
}
