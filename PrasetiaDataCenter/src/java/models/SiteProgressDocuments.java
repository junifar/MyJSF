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
 * SiteProgressDocuments generated by hbm2java
 */
@Entity
@Table(name="SITE_PROGRESS_DOCUMENTS"
    ,schema="dbo"
    ,catalog="PRST001_prod"
)
public class SiteProgressDocuments  implements java.io.Serializable {


     private int id;
     private Integer projectId;
     private Integer originalDocument;
     private Integer copyDocument;
     private Integer notDocumented;
     private int documentId;
     private String name;
     private String mimetype;
     private Integer filesize;
     private Date date;
     private String remark;
     private String dir;
     private Date created;
     private Date modified;
     private Integer projectCheck;
     private Date dateProjectChecked;
     private Integer documentStateId;
     private Integer fromDepartementId;

    public SiteProgressDocuments() {
    }

	
    public SiteProgressDocuments(int id, int documentId, Date created, Date modified) {
        this.id = id;
        this.documentId = documentId;
        this.created = created;
        this.modified = modified;
    }
    public SiteProgressDocuments(int id, Integer projectId, Integer originalDocument, Integer copyDocument, Integer notDocumented, int documentId, String name, String mimetype, Integer filesize, Date date, String remark, String dir, Date created, Date modified, Integer projectCheck, Date dateProjectChecked, Integer documentStateId, Integer fromDepartementId) {
       this.id = id;
       this.projectId = projectId;
       this.originalDocument = originalDocument;
       this.copyDocument = copyDocument;
       this.notDocumented = notDocumented;
       this.documentId = documentId;
       this.name = name;
       this.mimetype = mimetype;
       this.filesize = filesize;
       this.date = date;
       this.remark = remark;
       this.dir = dir;
       this.created = created;
       this.modified = modified;
       this.projectCheck = projectCheck;
       this.dateProjectChecked = dateProjectChecked;
       this.documentStateId = documentStateId;
       this.fromDepartementId = fromDepartementId;
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

    
    @Column(name="ORIGINAL_DOCUMENT")
    public Integer getOriginalDocument() {
        return this.originalDocument;
    }
    
    public void setOriginalDocument(Integer originalDocument) {
        this.originalDocument = originalDocument;
    }

    
    @Column(name="COPY_DOCUMENT")
    public Integer getCopyDocument() {
        return this.copyDocument;
    }
    
    public void setCopyDocument(Integer copyDocument) {
        this.copyDocument = copyDocument;
    }

    
    @Column(name="NOT_DOCUMENTED")
    public Integer getNotDocumented() {
        return this.notDocumented;
    }
    
    public void setNotDocumented(Integer notDocumented) {
        this.notDocumented = notDocumented;
    }

    
    @Column(name="DOCUMENT_ID", nullable=false)
    public int getDocumentId() {
        return this.documentId;
    }
    
    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    
    @Column(name="NAME", length=250)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="MIMETYPE", length=250)
    public String getMimetype() {
        return this.mimetype;
    }
    
    public void setMimetype(String mimetype) {
        this.mimetype = mimetype;
    }

    
    @Column(name="FILESIZE")
    public Integer getFilesize() {
        return this.filesize;
    }
    
    public void setFilesize(Integer filesize) {
        this.filesize = filesize;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="DATE_", length=23)
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }

    
    @Column(name="REMARK", length=250)
    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }

    
    @Column(name="DIR", length=250)
    public String getDir() {
        return this.dir;
    }
    
    public void setDir(String dir) {
        this.dir = dir;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CREATED", nullable=false, length=23)
    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="MODIFIED", nullable=false, length=23)
    public Date getModified() {
        return this.modified;
    }
    
    public void setModified(Date modified) {
        this.modified = modified;
    }

    
    @Column(name="PROJECT_CHECK")
    public Integer getProjectCheck() {
        return this.projectCheck;
    }
    
    public void setProjectCheck(Integer projectCheck) {
        this.projectCheck = projectCheck;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="DATE_PROJECT_CHECKED", length=23)
    public Date getDateProjectChecked() {
        return this.dateProjectChecked;
    }
    
    public void setDateProjectChecked(Date dateProjectChecked) {
        this.dateProjectChecked = dateProjectChecked;
    }

    
    @Column(name="DOCUMENT_STATE_ID")
    public Integer getDocumentStateId() {
        return this.documentStateId;
    }
    
    public void setDocumentStateId(Integer documentStateId) {
        this.documentStateId = documentStateId;
    }

    
    @Column(name="FROM_DEPARTEMENT_ID")
    public Integer getFromDepartementId() {
        return this.fromDepartementId;
    }
    
    public void setFromDepartementId(Integer fromDepartementId) {
        this.fromDepartementId = fromDepartementId;
    }




}

