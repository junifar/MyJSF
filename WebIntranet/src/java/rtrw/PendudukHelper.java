package rtrw;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PendudukHelper {
    Session session = null;
    
    public PendudukHelper(){
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public List getListPenduduk(int startID, int endID){
        List<Penduduk> pendudukList = null;
        
        try{
            Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Penduduk as penduduk where penduduk.id between '"+startID+"' and '"+endID+"'");
            pendudukList = (List<Penduduk>) q.list();
        }catch(HibernateException e){}
        
        return pendudukList;
    }
    
    public List getListPendudukByID(int pendudukID){
        List<Penduduk> pendudukList = null;
        
        try{
            Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Penduduk as penduduk where penduduk.id = "+ pendudukID);
            pendudukList = (List<Penduduk>) q.list();
        }catch(HibernateException e){}
        
        return pendudukList;
    }
    
    public void insertPenduduk(String nik, String name){
        String HQL = "insert into Penduduk (nik, name) values ('"+nik+"','"+name+"')";
        Transaction tx = session.beginTransaction();
        
        Penduduk pend = new Penduduk(nik,name);
        
        session.save(pend);
        tx.commit();
    }
}
