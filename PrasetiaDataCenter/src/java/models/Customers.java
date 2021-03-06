package models;
// Generated Mar 27, 2014 2:07:59 PM by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Customers generated by hbm2java
 */
@Entity
@Table(name="CUSTOMERS"
    ,schema="dbo"
    ,catalog="PRST001_prod"
)
public class Customers  implements java.io.Serializable {


     private int id;
     private String name;
     private String address;
     private String phone;
     private String fax;
     private Integer groupCustomerId;

    public Customers() {
    }

	
    public Customers(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Customers(int id, String name, String address, String phone, String fax, Integer groupCustomerId) {
       this.id = id;
       this.name = name;
       this.address = address;
       this.phone = phone;
       this.fax = fax;
       this.groupCustomerId = groupCustomerId;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="NAME", nullable=false, length=100)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="ADDRESS", length=100)
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    
    @Column(name="PHONE", length=25)
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    @Column(name="FAX", length=25)
    public String getFax() {
        return this.fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }

    
    @Column(name="GROUP_CUSTOMER_ID")
    public Integer getGroupCustomerId() {
        return this.groupCustomerId;
    }
    
    public void setGroupCustomerId(Integer groupCustomerId) {
        this.groupCustomerId = groupCustomerId;
    }




}


