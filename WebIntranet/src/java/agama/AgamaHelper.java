/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agama;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import rtrw.HibernateUtil;

/**
 *
 * @author Junifar
 */
public class AgamaHelper {
    Session session = null;
    
    public AgamaHelper(){
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public List getListAgama(){
        List<Agama> agamaList = null;
        
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Agama");
        agamaList = (List<Agama>) q.list();
        
        return  agamaList;
    }
}
