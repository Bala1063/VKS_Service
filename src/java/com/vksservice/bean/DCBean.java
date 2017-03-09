/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vksservice.Bean;

import java.util.Date;

/**
 *
 * @author bala
 */
public class DCBean {
    private int dcNo;
    private int serviceNo;
    private Date dcDate;
    private String companyName;
    private String companyAddress;
    public int getDcNo() {
        return dcNo;
    }

    public void setDcNo(int dcNo) {
        this.dcNo = dcNo;
    }

    public int getServiceNo() {
        return serviceNo;
    }

    public void setServiceNo(int serviceNo) {
        this.serviceNo = serviceNo;
    }

  

    public Date getDcDate() {
        return dcDate;
    }

    public void setDcDate(Date dcDate) {
        this.dcDate = dcDate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

 
}
