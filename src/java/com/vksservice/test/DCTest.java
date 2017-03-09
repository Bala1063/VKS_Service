/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vksservice.test;

import com.vksservice.Bean.DCBean;
import com.vksservice.DAO.DCDAO;
import java.util.Date;

/**
 *
 * @author bala
 */
public class DCTest {
    public static void main(String[] args) {
        DCBean dCBean=new DCBean();
        dCBean.setServiceNo(123);
        Date date=new Date();
        dCBean.setDcDate(date);
        dCBean.setCompanyName("dfasd");
        dCBean.setCompanyAddress("sdfa");
        int x=new DCDAO().addDc(dCBean);
        if(x==1)
        {
            System.out.println("success");
        }
    }
}
