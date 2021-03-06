package com.codegym.model;

public class Setting {
    String language;
    String pageSize;
    boolean spamsFilter;
    String signature;

    public Setting() {
    }

    public Setting(String language, String pageSize, boolean spamsFilter, String signature) {
        this.language = language;
        this.pageSize = pageSize;
        this.spamsFilter = spamsFilter;
        signature = signature;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isSpamsFilter() {
        return spamsFilter;
    }

    public void setSpamsFilter(boolean spamsFilter) {
        this.spamsFilter = spamsFilter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        signature = signature;
    }
}
