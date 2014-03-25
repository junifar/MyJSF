/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package db.agama;

import db.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Junifar
 */
public class AgamaHelper {
    Session session = null;
    
    public AgamaHelper(){
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
        //this.session = HibernateUtil.getSessionFactory().openSession();
    }
    
    public List getListAgama(){
        List<Agama> agamaList = null;
        try{
            Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Agama");
            agamaList = (List<Agama>) q.list();
            //tx.commit();
        }catch(HibernateException e){}
        return  agamaList;
    }

    public void insertAgama(String name) {
        //session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Agama agama = new Agama("aaa");

        session.save(agama);
        tx.commit();
    }
}
