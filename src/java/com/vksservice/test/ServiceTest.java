/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vksservice.test;

import com.vksservice.Bean.BoardBean;
import com.vksservice.Bean.ImageBean;
import com.vksservice.Bean.ServiceBean;
import com.vksservice.DAO.ServiceDAO;
import com.vksservice.Util.Util;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;

/**
 *
 * @author bala
 */
public class ServiceTest {
    public static void main(String[] args) throws FileNotFoundException {
//        code to insert new service
        ServiceBean serviceBean=new ServiceBean();
        Date date=new Date();
        serviceBean.setInDate(date);
        serviceBean.setOutDate(date);
        serviceBean.setCompanyName("vks");
        serviceBean.setCompanyAddress("salem");
        serviceBean.setReceivedBy("adfsda");
        serviceBean.setAttendedBy("dssfdsfds");
        serviceBean.setStatusOfService("delivered");
        serviceBean.setBusDetails("djfda");
        serviceBean.setCourierNo("dfdsfsdds");
        BoardBean boardBean=new BoardBean();
        boardBean.setBoardSNo("dsfdsf");
        boardBean.setBoardName("dfdssd");
        boardBean.setProblem("dsfsad");
        boardBean.setRemedy("asdfsda");
        boardBean.setStatusOfBoard("sdfas");
        ImageBean imageBean=new ImageBean();
        File file=new File("C:\\Users\\bala\\Pictures\\img_1.jpg");
        Session session=Util.getSessionFactory().openSession();
        FileInputStream fileInputStream=new FileInputStream(file);
        Blob blob=Hibernate.getLobCreator(session).createBlob(fileInputStream, file.length());
        imageBean.setBoardImage(blob);
        session.close();
        List<ImageBean> list=new ArrayList<>();
        list.add(imageBean);
        boardBean.setImageBean(list);
        List<BoardBean> listboard=new ArrayList<>();
        listboard.add(boardBean);
        serviceBean.setBoardBean(listboard);
        int x=new ServiceDAO().addService(serviceBean);
        if(x==1)
            System.out.println("success");
          Util.getSessionFactory().close();
    }
    }
