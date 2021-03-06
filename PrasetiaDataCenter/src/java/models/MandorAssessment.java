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
 * MandorAssessment generated by hbm2java
 */
@Entity
@Table(name="MANDOR_ASSESSMENT"
    ,schema="dbo"
    ,catalog="PRST001_prod"
)
public class MandorAssessment  implements java.io.Serializable {


     private int id;
     private Integer statMandorId;
     private Integer projectId;
     private Integer point;
     private Date created;
     private Integer userCreated;
     private Integer mandorProjectId;

    public MandorAssessment() {
    }

	
    public MandorAssessment(int id) {
        this.id = id;
    }
    public MandorAssessment(int id, Integer statMandorId, Integer projectId, Integer point, Date created, Integer userCreated, Integer mandorProjectId) {
       this.id = id;
       this.statMandorId = statMandorId;
       this.projectId = projectId;
       this.point = point;
       this.created = created;
       this.userCreated = userCreated;
       this.mandorProjectId = mandorProjectId;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="STAT_MANDOR_ID")
    public Integer getStatMandorId() {
        return this.statMandorId;
    }
    
    public void setStatMandorId(Integer statMandorId) {
        this.statMandorId = statMandorId;
    }

    
    @Column(name="PROJECT_ID")
    public Integer getProjectId() {
        return this.projectId;
    }
    
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    
    @Column(name="POINT")
    public Integer getPoint() {
        return this.point;
    }
    
    public void setPoint(Integer point) {
        this.point = point;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="CREATED", length=10)
    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }

    
    @Column(name="USER_CREATED")
    public Integer getUserCreated() {
        return this.userCreated;
    }
    
    public void setUserCreated(Integer userCreated) {
        this.userCreated = userCreated;
    }

    
    @Column(name="MANDOR_PROJECT_ID")
    public Integer getMandorProjectId() {
        return this.mandorProjectId;
    }
    
    public void setMandorProjectId(Integer mandorProjectId) {
        this.mandorProjectId = mandorProjectId;
    }




}


