package models;
// Generated Mar 27, 2014 2:07:59 PM by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MiscWorks generated by hbm2java
 */
@Entity
@Table(name="MISC_WORKS"
    ,schema="dbo"
    ,catalog="PRST001_prod"
)
public class MiscWorks  implements java.io.Serializable {


     private int id;
     private Integer miscCategoryId;
     private String name;

    public MiscWorks() {
    }

	
    public MiscWorks(int id) {
        this.id = id;
    }
    public MiscWorks(int id, Integer miscCategoryId, String name) {
       this.id = id;
       this.miscCategoryId = miscCategoryId;
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

    
    @Column(name="MISC_CATEGORY_ID")
    public Integer getMiscCategoryId() {
        return this.miscCategoryId;
    }
    
    public void setMiscCategoryId(Integer miscCategoryId) {
        this.miscCategoryId = miscCategoryId;
    }

    
    @Column(name="NAME", length=50)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }




}


