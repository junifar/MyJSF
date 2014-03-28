package models;
// Generated Mar 27, 2014 2:07:59 PM by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MiscCategories generated by hbm2java
 */
@Entity
@Table(name="MISC_CATEGORIES"
    ,schema="dbo"
    ,catalog="PRST001_prod"
)
public class MiscCategories  implements java.io.Serializable {


     private int id;
     private String name;

    public MiscCategories() {
    }

	
    public MiscCategories(int id) {
        this.id = id;
    }
    public MiscCategories(int id, String name) {
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

    
    @Column(name="NAME", length=50)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }




}


