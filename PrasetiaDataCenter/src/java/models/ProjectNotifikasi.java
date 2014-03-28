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
 * ProjectNotifikasi generated by hbm2java
 */
@Entity
@Table(name="PROJECT_NOTIFIKASI"
    ,schema="dbo"
    ,catalog="PRST001_prod"
)
public class ProjectNotifikasi  implements java.io.Serializable {


     private int id;
     private Integer messageCodeId;
     private Integer projectId;
     private String message;
     private Date changes;

    public ProjectNotifikasi() {
    }

	
    public ProjectNotifikasi(int id) {
        this.id = id;
    }
    public ProjectNotifikasi(int id, Integer messageCodeId, Integer projectId, String message, Date changes) {
       this.id = id;
       this.messageCodeId = messageCodeId;
       this.projectId = projectId;
       this.message = message;
       this.changes = changes;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="MESSAGE_CODE_ID")
    public Integer getMessageCodeId() {
        return this.messageCodeId;
    }
    
    public void setMessageCodeId(Integer messageCodeId) {
        this.messageCodeId = messageCodeId;
    }

    
    @Column(name="PROJECT_ID")
    public Integer getProjectId() {
        return this.projectId;
    }
    
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    
    @Column(name="MESSAGE", length=3000)
    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CHANGES", length=23)
    public Date getChanges() {
        return this.changes;
    }
    
    public void setChanges(Date changes) {
        this.changes = changes;
    }




}


