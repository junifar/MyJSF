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
 * StateWorks generated by hbm2java
 */
@Entity
@Table(name="STATE_WORKS"
    ,schema="dbo"
    ,catalog="PRST001_prod"
)
public class StateWorks  implements java.io.Serializable {


     private int id;
     private String name;
     private Integer progressDetailId;
     private Date created;

    public StateWorks() {
    }

	
    public StateWorks(int id) {
        this.id = id;
    }
    public StateWorks(int id, String name, Integer progressDetailId, Date created) {
       this.id = id;
       this.name = name;
       this.progressDetailId = progressDetailId;
       this.created = created;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="NAME", length=1000)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="PROGRESS_DETAIL_ID")
    public Integer getProgressDetailId() {
        return this.progressDetailId;
    }
    
    public void setProgressDetailId(Integer progressDetailId) {
        this.progressDetailId = progressDetailId;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CREATED", length=23)
    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }




}


