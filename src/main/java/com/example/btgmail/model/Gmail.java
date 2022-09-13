package com.example.btgmail.model;

public class Gmail {
    private String Languages;
    private int size;
    private boolean filter;
    private String signature;


    public Gmail(String languages, int size, boolean filter, String signature) {
        Languages = languages;
        this.size = size;
        this.filter = filter;
        this.signature = signature;
    }

    public Gmail() {
    }

    public String getLanguages() {
        return Languages;
    }

    public void setLanguages(String languages) {
        Languages = languages;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isFilter() {
        return filter;
    }

    public void setFilter(boolean filter) {
        this.filter = filter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
