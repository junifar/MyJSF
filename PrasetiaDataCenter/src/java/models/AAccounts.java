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
 * AAccounts generated by hbm2java
 */
@Entity
@Table(name="A_ACCOUNTS"
    ,schema="dbo"
    ,catalog="PRST001_prod"
)
public class AAccounts  implements java.io.Serializable {


     private int id;
     private String name;
     private String pic;
     private String job;
     private Date created;
     private Date modified;

    public AAccounts() {
    }

	
    public AAccounts(int id) {
        this.id = id;
    }
    public AAccounts(int id, String name, String pic, String job, Date created, Date modified) {
       this.id = id;
       this.name = name;
       this.pic = pic;
       this.job = job;
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

    
    @Column(name="PIC")
    public String getPic() {
        return this.pic;
    }
    
    public void setPic(String pic) {
        this.pic = pic;
    }

    
    @Column(name="JOB")
    public String getJob() {
        return this.job;
    }
    
    public void setJob(String job) {
        this.job = job;
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


