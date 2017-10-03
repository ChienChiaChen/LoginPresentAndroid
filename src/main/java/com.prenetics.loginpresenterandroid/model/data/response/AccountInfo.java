package com.prenetics.loginpresenterandroid.model.data.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountInfo {
    private String nickName;
    private String profileImage;
    private Integer role;
    private String dietitianAccount;
    private String uid;
    private Integer statusCode;
    private List<Integer> productIDs = null;
    private String serviceAccount;
    private String jid;
    private String jidPassword;
    private Integer customerId;
    private PersonInfo personalInformation;
    private String firstName;
    private String lastName;
    private ContactInfo contact;
    private String product;
    private String barcode;
    private String timestamp;
    private String tokenId;
    private GoalInfo goalData;
    private List<Object> extraData = null;
    private List<String> deviceToken = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getDietitianAccount() {
        return dietitianAccount;
    }

    public void setDietitianAccount(String dietitianAccount) {
        this.dietitianAccount = dietitianAccount;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public List<Integer> getProductIDs() {
        return productIDs;
    }

    public void setProductIDs(List<Integer> productIDs) {
        this.productIDs = productIDs;
    }

    public String getServiceAccount() {
        return serviceAccount;
    }

    public void setServiceAccount(String serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    public String getJid() {
        return jid;
    }

    public void setJid(String jid) {
        this.jid = jid;
    }

    public String getJidPassword() {
        return jidPassword;
    }

    public void setJidPassword(String jidPassword) {
        this.jidPassword = jidPassword;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public PersonInfo getPersonalInformation() {
        return personalInformation;
    }

    public void setPersonalInformation(PersonInfo personalInformation) {
        this.personalInformation = personalInformation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ContactInfo getContact() {
        return contact;
    }

    public void setContact(ContactInfo contact) {
        this.contact = contact;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public GoalInfo getGoalData() {
        return goalData;
    }

    public void setGoalData(GoalInfo goalData) {
        this.goalData = goalData;
    }

    public List<Object> getExtraData() {
        return extraData;
    }

    public void setExtraData(List<Object> extraData) {
        this.extraData = extraData;
    }

    public List<String> getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(List<String> deviceToken) {
        this.deviceToken = deviceToken;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
