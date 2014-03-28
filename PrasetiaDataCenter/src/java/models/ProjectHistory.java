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
 * ProjectHistory generated by hbm2java
 */
@Entity
@Table(name="PROJECT_HISTORY"
    ,schema="dbo"
    ,catalog="PRST001_prod"
)
public class ProjectHistory  implements java.io.Serializable {


     private int id;
     private Integer projectId;
     private Date dateStart;
     private Date created;

    public ProjectHistory() {
    }

	
    public ProjectHistory(int id) {
        this.id = id;
    }
    public ProjectHistory(int id, Integer projectId, Date dateStart, Date created) {
       this.id = id;
       this.projectId = projectId;
       this.dateStart = dateStart;
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

    
    @Column(name="PROJECT_ID")
    public Integer getProjectId() {
        return this.projectId;
    }
    
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="DATE_START", length=23)
    public Date getDateStart() {
        return this.dateStart;
    }
    
    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
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


