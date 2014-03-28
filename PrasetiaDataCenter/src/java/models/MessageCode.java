package models;
// Generated Mar 27, 2014 2:07:59 PM by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MessageCode generated by hbm2java
 */
@Entity
@Table(name="MESSAGE_CODE"
    ,schema="dbo"
    ,catalog="PRST001_prod"
)
public class MessageCode  implements java.io.Serializable {


     private int id;
     private String name;
     private String code;

    public MessageCode() {
    }

	
    public MessageCode(int id) {
        this.id = id;
    }
    public MessageCode(int id, String name, String code) {
       this.id = id;
       this.name = name;
       this.code = code;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="NAME", length=100)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="CODE", length=50)
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }




}


