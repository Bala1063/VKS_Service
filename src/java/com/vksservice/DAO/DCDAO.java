/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vksservice.DAO;

import com.vksservice.Bean.DCBean;
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
public class DCDAO {

    public int addDc(DCBean dCBean) {
        int x = 0;
        Session session = Util.getSessionFactory().openSession();
        Transaction t = null;
        try {
            t = session.beginTransaction();
            x = (Integer) session.save(dCBean);
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

    public List<DCBean> viewDcByCompanyName(String companyName) {
        Session session = Util.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(DCBean.class);
        criteria.add(Restrictions.eq("companyName", companyName));
        List<DCBean> dCBeans = criteria.list();
        session.close();
        return dCBeans;
    }
    public List<DCBean> viewAllDc()
    {
        Session session=Util.getSessionFactory().openSession();
        Query query=session.createQuery("From DCBean");
        List<DCBean> dCBeans=query.list();
        session.close();
        return dCBeans;
    }

}
