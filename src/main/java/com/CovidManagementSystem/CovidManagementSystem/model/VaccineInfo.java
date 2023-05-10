package com.CovidManagementSystem.CovidManagementSystem.model;

import com.CovidManagementSystem.CovidManagementSystem.util.vaccineManufacturer;

import java.util.Date;

public class VaccineInfo {
    String EmployeeID;
    Date[] VaccineDate = new Date[4];
    com.CovidManagementSystem.CovidManagementSystem.util.vaccineManufacturer vaccineManufacturer;
    Date exposureDate;
    Date recoveryDate;
}
