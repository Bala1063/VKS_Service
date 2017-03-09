/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vksservice.Bean;

import java.util.Date;
import java.util.List;

/**
 *
 * @author bala
 */
public class ServiceBean {
    private int serviceNo;
    private Date inDate;
    private Date outDate;
    private String companyName;
    private String companyAddress;
    private String receivedBy;
    private String attendedBy;
    private String statusOfService;
    private String busDetails;
    private String courierNo;
    private List<BoardBean> boardBean;

    public void setServiceNo(int serviceNo) {
        this.serviceNo = serviceNo;
    }

  
    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public void setReceivedBy(String receivedBy) {
        this.receivedBy = receivedBy;
    }

    public void setAttendedBy(String attendedBy) {
        this.attendedBy = attendedBy;
    }

    public void setStatusOfService(String statusOfService) {
        this.statusOfService = statusOfService;
    }

    public void setBusDetails(String busDetails) {
        this.busDetails = busDetails;
    }

    public void setCourierNo(String courierNo) {
        this.courierNo = courierNo;
    }

    public void setBoardBean(List<BoardBean> boardBean) {
        this.boardBean = boardBean;
    }

    public int getServiceNo() {
        return serviceNo;
    }

    public Date getInDate() {
        return inDate;
    }

    public Date getOutDate() {
        return outDate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public String getReceivedBy() {
        return receivedBy;
    }

    public String getAttendedBy() {
        return attendedBy;
    }

    public String getStatusOfService() {
        return statusOfService;
    }

    public String getBusDetails() {
        return busDetails;
    }

    public String getCourierNo() {
        return courierNo;
    }

    public List<BoardBean> getBoardBean() {
        return boardBean;
    }
    
    
    
}
