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
 * KontrakArsip generated by hbm2java
 */
@Entity
@Table(name="KONTRAK_ARSIP"
    ,schema="dbo"
    ,catalog="PRST001_prod"
)
public class KontrakArsip  implements java.io.Serializable {


     private int id;
     private Integer projectId;
     private String name;
     private String filePath;
     private Integer userCreated;
     private Integer userModified;
     private Date created;
     private Date modified;

    public KontrakArsip() {
    }

	
    public KontrakArsip(int id) {
        this.id = id;
    }
    public KontrakArsip(int id, Integer projectId, String name, String filePath, Integer userCreated, Integer userModified, Date created, Date modified) {
       this.id = id;
       this.projectId = projectId;
       this.name = name;
       this.filePath = filePath;
       this.userCreated = userCreated;
       this.userModified = userModified;
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

    
    @Column(name="PROJECT_ID")
    public Integer getProjectId() {
        return this.projectId;
    }
    
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    
    @Column(name="NAME", length=50)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="FILE_PATH", length=200)
    public String getFilePath() {
        return this.filePath;
    }
    
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    
    @Column(name="USER_CREATED")
    public Integer getUserCreated() {
        return this.userCreated;
    }
    
    public void setUserCreated(Integer userCreated) {
        this.userCreated = userCreated;
    }

    
    @Column(name="USER_MODIFIED")
    public Integer getUserModified() {
        return this.userModified;
    }
    
    public void setUserModified(Integer userModified) {
        this.userModified = userModified;
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


