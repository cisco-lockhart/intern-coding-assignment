/**
 * Copyright (c) Cisco Systems 2016. All rights reserved.
 */
package com.cisco.security.models;

public class FileTypePolicy {
    private String mimeType;

    private PolicyAction policyAction;

    public enum PolicyAction {
        ALLOW,
        BLOCK,
        SCAN
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public PolicyAction getPolicyAction() {
        return policyAction;
    }

    public void setPolicyAction(PolicyAction policyAction) {
        this.policyAction = policyAction;
    }

    @Override
    public String toString() {
        return "FileTypePolicy{" +
                "mimeType='" + mimeType + '\'' +
                ", policyAction=" + policyAction +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }
}
