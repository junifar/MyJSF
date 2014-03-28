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
 * Pb generated by hbm2java
 */
@Entity
@Table(name="PB"
    ,schema="dbo"
    ,catalog="PRST001_prod"
)
public class Pb  implements java.io.Serializable {


     private int id;
     private Integer rabId;
     private String noPb;
     private Integer nilaiPb;
     private String remark;
     private Date created;
     private Date modified;

    public Pb() {
    }

	
    public Pb(int id) {
        this.id = id;
    }
    public Pb(int id, Integer rabId, String noPb, Integer nilaiPb, String remark, Date created, Date modified) {
       this.id = id;
       this.rabId = rabId;
       this.noPb = noPb;
       this.nilaiPb = nilaiPb;
       this.remark = remark;
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

    
    @Column(name="RAB_ID")
    public Integer getRabId() {
        return this.rabId;
    }
    
    public void setRabId(Integer rabId) {
        this.rabId = rabId;
    }

    
    @Column(name="NO_PB", length=25)
    public String getNoPb() {
        return this.noPb;
    }
    
    public void setNoPb(String noPb) {
        this.noPb = noPb;
    }

    
    @Column(name="NILAI_PB")
    public Integer getNilaiPb() {
        return this.nilaiPb;
    }
    
    public void setNilaiPb(Integer nilaiPb) {
        this.nilaiPb = nilaiPb;
    }

    
    @Column(name="REMARK")
    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
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


