/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package helpers;

import java.util.List;
import models.Sites;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import static utils.BaseUtil.errorTrackingApp;
import utils.HibernateUtil;

/**
 *
 * @author prasetia
 */
public class SiteHelper {
    public List geListSite(){
        List<Sites> listSite;
        Session session;
        
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.getSessionFactory().openSession();
        try {
            Transaction tx = session.beginTransaction();
            Query q;
            q = session.createQuery("from Sites");
            listSite = (List<Sites>) q.list();
            tx.commit();
        } catch (HibernateException ex) {
            errorTrackingApp(ex);
            session.beginTransaction().rollback();
            throw ex;
        }
        
        return listSite;
    }
}
