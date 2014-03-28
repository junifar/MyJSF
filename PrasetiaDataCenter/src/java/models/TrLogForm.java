package models;
// Generated Mar 27, 2014 2:07:59 PM by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TrLogForm generated by hbm2java
 */
@Entity
@Table(name="TR_LOG_FORM"
    ,schema="dbo"
    ,catalog="PRST001_prod"
)
public class TrLogForm  implements java.io.Serializable {


     private int id;
     private String name;

    public TrLogForm() {
    }

	
    public TrLogForm(int id) {
        this.id = id;
    }
    public TrLogForm(int id, String name) {
       this.id = id;
       this.name = name;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="NAME", length=100)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }




}


