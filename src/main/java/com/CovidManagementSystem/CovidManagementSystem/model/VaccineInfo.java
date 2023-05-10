package com.CovidManagementSystem.CovidManagementSystem.model;

import com.CovidManagementSystem.CovidManagementSystem.util.vaccineManufacturer;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class VaccineInfo {
    @Id
    String memberID;
    Date[] vaccineDate = new Date[4];
    com.CovidManagementSystem.CovidManagementSystem.util.vaccineManufacturer vaccineManufacturer;
    Date exposureDate;
    Date recoveryDate;

    @PersistenceConstructor
    public VaccineInfo(String memberID, Date[] vaccineDate,
                       com.CovidManagementSystem.CovidManagementSystem.util.vaccineManufacturer vaccineManufacturer,
                       Date exposureDate, Date recoveryDate) {
        this.memberID = memberID;
        this.vaccineDate = vaccineDate;
        this.vaccineManufacturer = vaccineManufacturer;
        this.exposureDate = exposureDate;
        this.recoveryDate = recoveryDate;
    }

    public VaccineInfo(String memberID, Date[] vaccineDate,
                       com.CovidManagementSystem.CovidManagementSystem
                               .util.vaccineManufacturer vaccineManufacturer,
                       Date exposureDate) {
        this.memberID = memberID;
        this.vaccineDate = vaccineDate;
        this.vaccineManufacturer = vaccineManufacturer;
        this.exposureDate = exposureDate;
    }

    public VaccineInfo(String memberID, Date[] vaccineDate,
                       com.CovidManagementSystem.CovidManagementSystem
                               .util.vaccineManufacturer vaccineManufacturer) {
        this.memberID = memberID;
        this.vaccineDate = vaccineDate;
        this.vaccineManufacturer = vaccineManufacturer;
    }

    public VaccineInfo(String memberID) {
        this.memberID = memberID;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public Date[] getVaccineDate() {
        return vaccineDate;
    }

    public void setVaccineDate(Date[] vaccineDate) {
        this.vaccineDate = vaccineDate;
    }

    public com.CovidManagementSystem.CovidManagementSystem.util.vaccineManufacturer getVaccineManufacturer() {
        return vaccineManufacturer;
    }

    public void setVaccineManufacturer(com.CovidManagementSystem.CovidManagementSystem.util.vaccineManufacturer vaccineManufacturer) {
        this.vaccineManufacturer = vaccineManufacturer;
    }

    public Date getExposureDate() {
        return exposureDate;
    }

    public void setExposureDate(Date exposureDate) {
        this.exposureDate = exposureDate;
    }

    public Date getRecoveryDate() {
        return recoveryDate;
    }

    public void setRecoveryDate(Date recoveryDate) {
        this.recoveryDate = recoveryDate;
    }
}
