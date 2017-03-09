/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vksservice.DAO;

import com.vksservice.Bean.BillBean;

import com.vksservice.Util.Util;
import java.util.List;
import org.hibernate.Criteria;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author bala
 */
public class BillDAO {

    public int addBill(BillBean billBean) {
        int x = 0;
        Session session = Util.getSessionFactory().openSession();
        Transaction t = null;
        try {
            t = session.beginTransaction();
            x = (Integer) session.save(billBean);
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

    public List<BillBean> viewBillDetailsByCompanyName(String companyName) {
        Session session = Util.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(BillBean.class);
        criteria.add(Restrictions.eq("companyName", companyName));
        List<BillBean> billBeans = criteria.list();
        session.close();
        return billBeans;
    }
    public List<BillBean> viewAllBillDetails()
    {
        Session session = Util.getSessionFactory().openSession();
        Query query=session.createQuery("From BillBean");
        List<BillBean> billBeans=query.list();
        session.close();
       return billBeans;
    }
}
