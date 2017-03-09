/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vksservice.DAO;

import com.vksservice.Bean.StockBean;
import com.vksservice.Util.Util;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author bala
 */
public class StockDAO {
     public int addSparePart(StockBean stockBean) {
        int x = 0;
         Session session = Util.getSessionFactory().openSession();
         Transaction t = null;
        try {
            t = session.beginTransaction();
            x = (Integer) session.save(stockBean);
            t.commit();
        } catch (HibernateException e) {
            if (t != null) {
                t.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return x;
    }
    public Boolean updateQuantity(String spareNumber,int Quantity)
    {
        
         Session session = Util.getSessionFactory().openSession();
         Transaction t = null;
        try {
            t = session.beginTransaction();
           StockBean stockBean=new StockBean();
           stockBean=(StockBean)session.get(StockBean.class, spareNumber);
           stockBean.setQuantity(Quantity);
           session.update(stockBean);
                       t.commit();
                       
        } catch (HibernateException e) {
            if (t != null) {
                t.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
     return true;
        
    }
     
    
}
