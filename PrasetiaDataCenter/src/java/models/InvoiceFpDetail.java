package models;
// Generated Mar 27, 2014 2:07:59 PM by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * InvoiceFpDetail generated by hbm2java
 */
@Entity
@Table(name="INVOICE_FP_DETAIL"
    ,schema="dbo"
    ,catalog="PRST001_prod"
)
public class InvoiceFpDetail  implements java.io.Serializable {


     private int id;
     private Integer invoiceFpId;
     private String keterangan;
     private BigDecimal value;
     private Integer userCreated;
     private Integer userModified;
     private Date dateCreated;
     private Date dateModified;

    public InvoiceFpDetail() {
    }

	
    public InvoiceFpDetail(int id) {
        this.id = id;
    }
    public InvoiceFpDetail(int id, Integer invoiceFpId, String keterangan, BigDecimal value, Integer userCreated, Integer userModified, Date dateCreated, Date dateModified) {
       this.id = id;
       this.invoiceFpId = invoiceFpId;
       this.keterangan = keterangan;
       this.value = value;
       this.userCreated = userCreated;
       this.userModified = userModified;
       this.dateCreated = dateCreated;
       this.dateModified = dateModified;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="INVOICE_FP_ID")
    public Integer getInvoiceFpId() {
        return this.invoiceFpId;
    }
    
    public void setInvoiceFpId(Integer invoiceFpId) {
        this.invoiceFpId = invoiceFpId;
    }

    
    @Column(name="KETERANGAN")
    public String getKeterangan() {
        return this.keterangan;
    }
    
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    
    @Column(name="VALUE", precision=12)
    public BigDecimal getValue() {
        return this.value;
    }
    
    public void setValue(BigDecimal value) {
        this.value = value;
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
    @Column(name="DATE_CREATED", length=23)
    public Date getDateCreated() {
        return this.dateCreated;
    }
    
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="DATE_MODIFIED", length=23)
    public Date getDateModified() {
        return this.dateModified;
    }
    
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }




}


