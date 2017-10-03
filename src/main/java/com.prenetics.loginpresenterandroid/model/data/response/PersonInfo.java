package com.prenetics.loginpresenterandroid.model.data.response;

import java.util.HashMap;
import java.util.Map;

public class PersonInfo {
    private String gender;
    private String birthday;
    private String reportLanguage;
    private String customerConsent;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getReportLanguage() {
        return reportLanguage;
    }

    public void setReportLanguage(String reportLanguage) {
        this.reportLanguage = reportLanguage;
    }

    public String getCustomerConsent() {
        return customerConsent;
    }

    public void setCustomerConsent(String customerConsent) {
        this.customerConsent = customerConsent;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}