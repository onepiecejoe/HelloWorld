package com.joe.bean;

public class Express {
    private String company; // 快递公司
    private String number;  // 快递单号
    private String phoneNumber; // 收件人手机号码
    private int extractionCode; // 取件码
    public Express(){}
    public Express(String company, String number, String phoneNumber, int extractionCode) {
        this.company = company;
        this.number = number;
        this.phoneNumber = phoneNumber;
        this.extractionCode = extractionCode;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getExtractionCode() {
        return extractionCode;
    }

    public void setExtractionCode(int extractionCode) {
        this.extractionCode = extractionCode;
    }
}
