package models;
// Generated Mar 27, 2014 2:07:59 PM by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * BankAssign generated by hbm2java
 */
@Entity
@Table(name="BANK_ASSIGN"
    ,schema="dbo"
    ,catalog="PRST001_prod"
)
public class BankAssign  implements java.io.Serializable {


     private int id;
     private String bankName;

    public BankAssign() {
    }

	
    public BankAssign(int id) {
        this.id = id;
    }
    public BankAssign(int id, String bankName) {
       this.id = id;
       this.bankName = bankName;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="BANK_NAME")
    public String getBankName() {
        return this.bankName;
    }
    
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }




}

