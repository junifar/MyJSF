package models;
// Generated Mar 27, 2014 2:07:59 PM by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Operators generated by hbm2java
 */
@Entity
@Table(name="OPERATORS"
    ,schema="dbo"
    ,catalog="PRST001_prod"
)
public class Operators  implements java.io.Serializable {


     private int id;
     private String name;
     private String customerOperatorId;

    public Operators() {
    }

	
    public Operators(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Operators(int id, String name, String customerOperatorId) {
       this.id = id;
       this.name = name;
       this.customerOperatorId = customerOperatorId;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="NAME", nullable=false, length=50)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="CUSTOMER_OPERATOR_ID", length=20)
    public String getCustomerOperatorId() {
        return this.customerOperatorId;
    }
    
    public void setCustomerOperatorId(String customerOperatorId) {
        this.customerOperatorId = customerOperatorId;
    }




}

