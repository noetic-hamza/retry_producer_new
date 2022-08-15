package com.example.demo.util;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;

public final class RetryMqMessage implements Serializable {

    private BigInteger id;
    private Long tblChargingId;
    private Long smsId;
    private String msisdn;
    private Timestamp ctimestamp;
    private Double amount;
    private Long operatorId;
    private Integer partnerId;
    private String shortCode;
    private Integer responseCode;
    private Integer numOfAttempts;
    private Integer isCharged;
    private String smsText;

    @Override
    public String toString() {
        return "RetryMqMessage{" +
                "id=" + id +
                ", tblChargingId=" + tblChargingId +
                ", smsId=" + smsId +
                ", msisdn='" + msisdn + '\'' +
                ", ctimestamp=" + ctimestamp +
                ", amount=" + amount +
                ", operatorId=" + operatorId +
                ", partnerId=" + partnerId +
                ", shortCode='" + shortCode + '\'' +
                ", responseCode=" + responseCode +
                ", numOfAttempts=" + numOfAttempts +
                ", isCharged=" + isCharged +
                ", smsText='" + smsText + '\'' +
                '}';
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public Long getTblChargingId() {
        return tblChargingId;
    }

    public void setTblChargingId(Long tblChargingId) {
        this.tblChargingId = tblChargingId;
    }

    public Long getSmsId() {
        return smsId;
    }

    public void setSmsId(Long smsId) {
        this.smsId = smsId;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public Timestamp getCtimestamp() {
        return ctimestamp;
    }

    public void setCtimestamp(Timestamp ctimestamp) {
        this.ctimestamp = ctimestamp;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public Integer getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    public Integer getNumOfAttempts() {
        return numOfAttempts;
    }

    public void setNumOfAttempts(Integer numOfAttempts) {
        this.numOfAttempts = numOfAttempts;
    }

    public Integer getIsCharged() {
        return isCharged;
    }

    public void setIsCharged(Integer isCharged) {
        this.isCharged = isCharged;
    }

    public String getSmsText() {
        return smsText;
    }

    public void setSmsText(String smsText) {
        this.smsText = smsText;
    }
}
