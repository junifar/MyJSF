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
 * Expenses generated by hbm2java
 */
@Entity
@Table(name="EXPENSES"
    ,schema="dbo"
    ,catalog="PRST001_prod"
)
public class Expenses  implements java.io.Serializable {


     private int id;
     private String description;
     private Date tanggalPengeluaran;
     private BigDecimal jumlah;
     private String status;
     private Date dateCreated;
     private Integer userCreated;
     private Integer priority;
     private Integer departementId;

    public Expenses() {
    }

	
    public Expenses(int id) {
        this.id = id;
    }
    public Expenses(int id, String description, Date tanggalPengeluaran, BigDecimal jumlah, String status, Date dateCreated, Integer userCreated, Integer priority, Integer departementId) {
       this.id = id;
       this.description = description;
       this.tanggalPengeluaran = tanggalPengeluaran;
       this.jumlah = jumlah;
       this.status = status;
       this.dateCreated = dateCreated;
       this.userCreated = userCreated;
       this.priority = priority;
       this.departementId = departementId;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="DESCRIPTION", length=3000)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="TANGGAL_PENGELUARAN", length=23)
    public Date getTanggalPengeluaran() {
        return this.tanggalPengeluaran;
    }
    
    public void setTanggalPengeluaran(Date tanggalPengeluaran) {
        this.tanggalPengeluaran = tanggalPengeluaran;
    }

    
    @Column(name="JUMLAH", precision=12)
    public BigDecimal getJumlah() {
        return this.jumlah;
    }
    
    public void setJumlah(BigDecimal jumlah) {
        this.jumlah = jumlah;
    }

    
    @Column(name="STATUS", length=3000)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="DATE_CREATED", length=23)
    public Date getDateCreated() {
        return this.dateCreated;
    }
    
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    
    @Column(name="USER_CREATED")
    public Integer getUserCreated() {
        return this.userCreated;
    }
    
    public void setUserCreated(Integer userCreated) {
        this.userCreated = userCreated;
    }

    
    @Column(name="PRIORITY")
    public Integer getPriority() {
        return this.priority;
    }
    
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    
    @Column(name="DEPARTEMENT_ID")
    public Integer getDepartementId() {
        return this.departementId;
    }
    
    public void setDepartementId(Integer departementId) {
        this.departementId = departementId;
    }




}


