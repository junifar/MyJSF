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
 * DocumentAccess generated by hbm2java
 */
@Entity
@Table(name="DOCUMENT_ACCESS"
    ,schema="dbo"
    ,catalog="PRST001_prod"
)
public class DocumentAccess  implements java.io.Serializable {


     private int id;
     private Integer documentBinderTypeId;
     private Integer groupId;
     private Date created;
     private Date modified;

    public DocumentAccess() {
    }

	
    public DocumentAccess(int id) {
        this.id = id;
    }
    public DocumentAccess(int id, Integer documentBinderTypeId, Integer groupId, Date created, Date modified) {
       this.id = id;
       this.documentBinderTypeId = documentBinderTypeId;
       this.groupId = groupId;
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

    
    @Column(name="DOCUMENT_BINDER_TYPE_ID")
    public Integer getDocumentBinderTypeId() {
        return this.documentBinderTypeId;
    }
    
    public void setDocumentBinderTypeId(Integer documentBinderTypeId) {
        this.documentBinderTypeId = documentBinderTypeId;
    }

    
    @Column(name="GROUP_ID")
    public Integer getGroupId() {
        return this.groupId;
    }
    
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="CREATED", length=10)
    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="MODIFIED", length=10)
    public Date getModified() {
        return this.modified;
    }
    
    public void setModified(Date modified) {
        this.modified = modified;
    }




}


