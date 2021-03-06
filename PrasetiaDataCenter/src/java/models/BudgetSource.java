package models;
// Generated Mar 27, 2014 2:07:59 PM by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * BudgetSource generated by hbm2java
 */
@Entity
@Table(name="BUDGET_SOURCE"
    ,schema="dbo"
    ,catalog="PRST001_prod"
)
public class BudgetSource  implements java.io.Serializable {


     private int id;
     private String budgetSource;

    public BudgetSource() {
    }

	
    public BudgetSource(int id) {
        this.id = id;
    }
    public BudgetSource(int id, String budgetSource) {
       this.id = id;
       this.budgetSource = budgetSource;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="BUDGET_SOURCE")
    public String getBudgetSource() {
        return this.budgetSource;
    }
    
    public void setBudgetSource(String budgetSource) {
        this.budgetSource = budgetSource;
    }




}


