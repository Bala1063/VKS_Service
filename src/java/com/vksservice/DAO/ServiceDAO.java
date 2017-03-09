/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vksservice.DAO;

import com.vksservice.Bean.ServiceBean;
import com.vksservice.Util.Util;
import java.util.List;
import org.hibernate.CacheMode;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.FlushMode;
import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.ScrollMode;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;
import org.hibernate.transform.ResultTransformer;

/**
 *
 * @author bala
 */
public class ServiceDAO {

    public int addService(ServiceBean serviceBean) {
        int x = 0;
        Session session = Util.getSessionFactory().openSession();
        Transaction t = null;
        try {
            t = session.beginTransaction();
            x = (Integer) session.save(serviceBean);
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

    public List<ServiceBean> viewServiceDetailsByCompanyName(String companyName) {
        Session session = Util.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(ServiceBean.class);
        criteria.add(Restrictions.eq("companyName", companyName));
        List<ServiceBean> serviceList = criteria.list();
        session.close();
        return serviceList;
    }
    public List<ServiceBean> viewAllService()
    {
       Session session=Util.getSessionFactory().openSession();
        Query query=session.createSQLQuery("From ServiceBean");
        List<ServiceBean> serviceList=query.list();
        session.close();
        return serviceList;
    }

}
