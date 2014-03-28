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
 * DocumentAccessUsers generated by hbm2java
 */
@Entity
@Table(name="DOCUMENT_ACCESS_USERS"
    ,schema="dbo"
    ,catalog="PRST001_prod"
)
public class DocumentAccessUsers  implements java.io.Serializable {


     private int id;
     private int documentBinderTypeId;
     private Integer userId;
     private Date created;
     private Date modified;

    public DocumentAccessUsers() {
    }

	
    public DocumentAccessUsers(int id, int documentBinderTypeId) {
        this.id = id;
        this.documentBinderTypeId = documentBinderTypeId;
    }
    public DocumentAccessUsers(int id, int documentBinderTypeId, Integer userId, Date created, Date modified) {
       this.id = id;
       this.documentBinderTypeId = documentBinderTypeId;
       this.userId = userId;
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

    
    @Column(name="DOCUMENT_BINDER_TYPE_ID", nullable=false)
    public int getDocumentBinderTypeId() {
        return this.documentBinderTypeId;
    }
    
    public void setDocumentBinderTypeId(int documentBinderTypeId) {
        this.documentBinderTypeId = documentBinderTypeId;
    }

    
    @Column(name="USER_ID")
    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
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


