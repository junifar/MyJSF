/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package helper;

import java.io.Serializable;
import java.util.List;
import model.Agama;
import static model.Agama_.id;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import static util.BaseUtil.errorTrackingApp;
import util.HibernateUtil;

/**
 *
 * @author prasetia
 */
public class AgamaHelper {
    //Session session = null;
    
    public AgamaHelper(){
        //this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public List getListAgama(){
        List<Agama> listAgama;
        Session session;
        
        session = HibernateUtil.getSessionFactory().getCurrentSession();        
        session.getSessionFactory().openSession();
        try {
            Transaction tx = session.beginTransaction();
            Query q;
            q = session.createQuery("from Agama");
            listAgama = (List<Agama>) q.list();
            tx.commit();
        } catch (HibernateException ex) {
            errorTrackingApp(ex);
            session.beginTransaction().rollback();
            throw ex;
        }  
        
        return listAgama;
    }
    
    public List getListAgamaByID(int id){
        List<Agama> listAgama;
        Session session;
        
        session = HibernateUtil.getSessionFactory().getCurrentSession();        
        session.getSessionFactory().openSession();
        try {
            Transaction tx = session.beginTransaction();
            Query q;
            q = session.createQuery("from Agama as agama where agama.id = :id");
            q.setParameter("id", id);
            listAgama = (List<Agama>) q.list();
            tx.commit();
        } catch (HibernateException ex) {
            errorTrackingApp(ex);
            session.beginTransaction().rollback();
            throw ex;
        }  
        
        return listAgama;
    }

    public void insertAgama(String name) {
        Session session;
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.getSessionFactory().openSession();
        try {
            Transaction tx = session.beginTransaction();
            Agama agama = new Agama();
            agama.setName(name);
            session.save(agama);
            tx.commit();
        } catch (Exception ex) {
            errorTrackingApp(ex);
            session.beginTransaction().rollback();
            throw ex;
        }     
    }
    
    public void hapusAgama(int ID){
        Session session;
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.getSessionFactory().openSession();
        try {
            Transaction tx = session.beginTransaction();
            Agama agama = (Agama) session.load(Agama.class, (Serializable) ID);
            session.delete(agama);          
            tx.commit();
        } catch (Exception ex) {
            errorTrackingApp(ex);
            session.beginTransaction().rollback();
            throw ex;
        }    
    }
    
    public void editAgama(Agama agama){
        Session session;
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.getSessionFactory().openSession();
        try {
            Transaction tx = session.beginTransaction();
            session.update(agama);          
            tx.commit();
        } catch (Exception ex) {
            errorTrackingApp(ex);
            session.beginTransaction().rollback();
            throw ex;
        }    
    }
}
