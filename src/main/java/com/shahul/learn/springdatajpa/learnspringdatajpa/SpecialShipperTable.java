package com.shahul.learn.springdatajpa.learnspringdatajpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "special_shipper_table")
public class SpecialShipperTable {

    @Id
    @Column(name="shipper_number")
    private String shipperNumber;

    @Column(name="insert_timestamp")
    private String insertTimeStamp;

    @Column(name="user_login_id")
    private String userLoginId;

    @Column(name="retention_period")
    private short retentionPeriod;

    public SpecialShipperTable() {

    }

    public SpecialShipperTable(String shipperNumber, String insertTimeStamp, String userLoginId, short retentionPeriod) {
        this.shipperNumber = shipperNumber;
        this.insertTimeStamp = insertTimeStamp;
        this.userLoginId = userLoginId;
        this.retentionPeriod = retentionPeriod;
    }

    public String getShipperNumber() {
        return shipperNumber;
    }
    public void setShipperNumber(String shipperNumber) {
        this.shipperNumber = shipperNumber;
    }

    public String getInsertTimeStamp() {
        return insertTimeStamp;
    }
    public void setInsertTimeStamp(String insertTimeStamp) {
        this.insertTimeStamp = insertTimeStamp;
    }

    public String getUserLoginId() {
        return userLoginId;
    }
    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    public short getRetentionPeriod() {
        return retentionPeriod;
    }
    public void setRetentionPeriod(short retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    @Override
    public String toString() {
        return "SpecialShipper [shipperNumber=" + shipperNumber + ", insertTimeStamp=" + insertTimeStamp
                + ", userLoginId=" + userLoginId + ", retentionPeriod=" + retentionPeriod + "]";
    }

}
