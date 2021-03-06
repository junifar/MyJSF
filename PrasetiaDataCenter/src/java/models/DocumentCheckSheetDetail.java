package models;
// Generated Mar 27, 2014 2:07:59 PM by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DocumentCheckSheetDetail generated by hbm2java
 */
@Entity
@Table(name="DOCUMENT_CHECK_SHEET_DETAIL"
    ,schema="dbo"
    ,catalog="PRST001_prod"
)
public class DocumentCheckSheetDetail  implements java.io.Serializable {


     private int id;
     private Integer documentId;
     private Integer documentChecksheetId;

    public DocumentCheckSheetDetail() {
    }

	
    public DocumentCheckSheetDetail(int id) {
        this.id = id;
    }
    public DocumentCheckSheetDetail(int id, Integer documentId, Integer documentChecksheetId) {
       this.id = id;
       this.documentId = documentId;
       this.documentChecksheetId = documentChecksheetId;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="DOCUMENT_ID")
    public Integer getDocumentId() {
        return this.documentId;
    }
    
    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    
    @Column(name="DOCUMENT_CHECKSHEET_ID")
    public Integer getDocumentChecksheetId() {
        return this.documentChecksheetId;
    }
    
    public void setDocumentChecksheetId(Integer documentChecksheetId) {
        this.documentChecksheetId = documentChecksheetId;
    }




}


