package models;
// Generated Mar 27, 2014 2:07:59 PM by Hibernate Tools 3.6.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ABanks generated by hbm2java
 */
@Entity
@Table(name="A_BANKS"
    ,schema="dbo"
    ,catalog="PRST001_prod"
)
public class ABanks  implements java.io.Serializable {


     private int id;
     private String name;
     private Date created;
     private Date modified;

    public ABanks() {
    }

	
    public ABanks(int id) {
        this.id = id;
    }
    public ABanks(int id, String name, Date created, Date modified) {
       this.id = id;
       this.name = name;
       this.created = created;
       this.modified = modified;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="NAME")
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CREATED", length=23)
    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="MODIFIED", length=23)
    public Date getModified() {
        return this.modified;
    }
    
    public void setModified(Date modified) {
        this.modified = modified;
    }




}


