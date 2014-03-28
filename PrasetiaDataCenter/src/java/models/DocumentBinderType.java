package models;
// Generated Mar 27, 2014 2:07:59 PM by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DocumentBinderType generated by hbm2java
 */
@Entity
@Table(name="DOCUMENT_BINDER_TYPE"
    ,schema="dbo"
    ,catalog="PRST001_prod"
)
public class DocumentBinderType  implements java.io.Serializable {


     private int id;
     private String name;
     private String departement;

    public DocumentBinderType() {
    }

	
    public DocumentBinderType(int id) {
        this.id = id;
    }
    public DocumentBinderType(int id, String name, String departement) {
       this.id = id;
       this.name = name;
       this.departement = departement;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="NAME", length=200)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="DEPARTEMENT", length=200)
    public String getDepartement() {
        return this.departement;
    }
    
    public void setDepartement(String departement) {
        this.departement = departement;
    }




}

