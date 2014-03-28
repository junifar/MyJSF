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
 * InvoiceFp generated by hbm2java
 */
@Entity
@Table(name="INVOICE_FP"
    ,schema="dbo"
    ,catalog="PRST001_prod"
)
public class InvoiceFp  implements java.io.Serializable {


     private int id;
     private String noInvoice;
     private Integer customerFpId;
     private Integer tax;
     private String taxNo;
     private String taxNo1;
     private Integer managerAssignId;
     private Date dateCreated;
     private Date dateModified;
     private Integer userCreated;
     private Integer userModified;
     private Integer bankAssignId;
     private BigDecimal uangMuka;
     private BigDecimal potonganHarga;
     private BigDecimal otherPrice;
     private Date tanggalCetak;
     private Integer checkHargaJual;
     private Integer checkUangMuka;
     private Integer checkPenggantian;
     private Integer checkTermin;

    public InvoiceFp() {
    }

	
    public InvoiceFp(int id) {
        this.id = id;
    }
    public InvoiceFp(int id, String noInvoice, Integer customerFpId, Integer tax, String taxNo, String taxNo1, Integer managerAssignId, Date dateCreated, Date dateModified, Integer userCreated, Integer userModified, Integer bankAssignId, BigDecimal uangMuka, BigDecimal potonganHarga, BigDecimal otherPrice, Date tanggalCetak, Integer checkHargaJual, Integer checkUangMuka, Integer checkPenggantian, Integer checkTermin) {
       this.id = id;
       this.noInvoice = noInvoice;
       this.customerFpId = customerFpId;
       this.tax = tax;
       this.taxNo = taxNo;
       this.taxNo1 = taxNo1;
       this.managerAssignId = managerAssignId;
       this.dateCreated = dateCreated;
       this.dateModified = dateModified;
       this.userCreated = userCreated;
       this.userModified = userModified;
       this.bankAssignId = bankAssignId;
       this.uangMuka = uangMuka;
       this.potonganHarga = potonganHarga;
       this.otherPrice = otherPrice;
       this.tanggalCetak = tanggalCetak;
       this.checkHargaJual = checkHargaJual;
       this.checkUangMuka = checkUangMuka;
       this.checkPenggantian = checkPenggantian;
       this.checkTermin = checkTermin;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="NO_INVOICE", length=100)
    public String getNoInvoice() {
        return this.noInvoice;
    }
    
    public void setNoInvoice(String noInvoice) {
        this.noInvoice = noInvoice;
    }

    
    @Column(name="CUSTOMER_FP_ID")
    public Integer getCustomerFpId() {
        return this.customerFpId;
    }
    
    public void setCustomerFpId(Integer customerFpId) {
        this.customerFpId = customerFpId;
    }

    
    @Column(name="TAX")
    public Integer getTax() {
        return this.tax;
    }
    
    public void setTax(Integer tax) {
        this.tax = tax;
    }

    
    @Column(name="TAX_NO", length=100)
    public String getTaxNo() {
        return this.taxNo;
    }
    
    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo;
    }

    
    @Column(name="TAX_NO_1", length=100)
    public String getTaxNo1() {
        return this.taxNo1;
    }
    
    public void setTaxNo1(String taxNo1) {
        this.taxNo1 = taxNo1;
    }

    
    @Column(name="MANAGER_ASSIGN_ID")
    public Integer getManagerAssignId() {
        return this.managerAssignId;
    }
    
    public void setManagerAssignId(Integer managerAssignId) {
        this.managerAssignId = managerAssignId;
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

    
    @Column(name="BANK_ASSIGN_ID")
    public Integer getBankAssignId() {
        return this.bankAssignId;
    }
    
    public void setBankAssignId(Integer bankAssignId) {
        this.bankAssignId = bankAssignId;
    }

    
    @Column(name="UANG_MUKA", precision=12)
    public BigDecimal getUangMuka() {
        return this.uangMuka;
    }
    
    public void setUangMuka(BigDecimal uangMuka) {
        this.uangMuka = uangMuka;
    }

    
    @Column(name="POTONGAN_HARGA", precision=12)
    public BigDecimal getPotonganHarga() {
        return this.potonganHarga;
    }
    
    public void setPotonganHarga(BigDecimal potonganHarga) {
        this.potonganHarga = potonganHarga;
    }

    
    @Column(name="OTHER_PRICE", precision=12)
    public BigDecimal getOtherPrice() {
        return this.otherPrice;
    }
    
    public void setOtherPrice(BigDecimal otherPrice) {
        this.otherPrice = otherPrice;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="TANGGAL_CETAK", length=23)
    public Date getTanggalCetak() {
        return this.tanggalCetak;
    }
    
    public void setTanggalCetak(Date tanggalCetak) {
        this.tanggalCetak = tanggalCetak;
    }

    
    @Column(name="CHECK_HARGA_JUAL")
    public Integer getCheckHargaJual() {
        return this.checkHargaJual;
    }
    
    public void setCheckHargaJual(Integer checkHargaJual) {
        this.checkHargaJual = checkHargaJual;
    }

    
    @Column(name="CHECK_UANG_MUKA")
    public Integer getCheckUangMuka() {
        return this.checkUangMuka;
    }
    
    public void setCheckUangMuka(Integer checkUangMuka) {
        this.checkUangMuka = checkUangMuka;
    }

    
    @Column(name="CHECK_PENGGANTIAN")
    public Integer getCheckPenggantian() {
        return this.checkPenggantian;
    }
    
    public void setCheckPenggantian(Integer checkPenggantian) {
        this.checkPenggantian = checkPenggantian;
    }

    
    @Column(name="CHECK_TERMIN")
    public Integer getCheckTermin() {
        return this.checkTermin;
    }
    
    public void setCheckTermin(Integer checkTermin) {
        this.checkTermin = checkTermin;
    }




}

