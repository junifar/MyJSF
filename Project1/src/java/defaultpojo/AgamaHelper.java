/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package defaultpojo;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import project1.HibernateUtil;

/**
 *
 * @author prasetia
 */
public class AgamaHelper {
    Session session = null;
    
    public AgamaHelper(){
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public List getListAgama(){
        List<Agama> listAgama = null;
        
        Transaction tx = session.beginTransaction();
        Query q;
        q = session.createQuery("from Agama");
        listAgama = (List<Agama>) q.list();
        return listAgama;
    }
}
