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
 * LogExpenseWarning generated by hbm2java
 */
@Entity
@Table(name="LOG_EXPENSE_WARNING"
    ,schema="dbo"
    ,catalog="PRST001_prod"
)
public class LogExpenseWarning  implements java.io.Serializable {


     private int id;
     private String email;
     private Date created;

    public LogExpenseWarning() {
    }

	
    public LogExpenseWarning(int id) {
        this.id = id;
    }
    public LogExpenseWarning(int id, String email, Date created) {
       this.id = id;
       this.email = email;
       this.created = created;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="EMAIL", length=150)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CREATED", length=23)
    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }




}


