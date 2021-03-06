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
 * Users generated by hbm2java
 */
@Entity
@Table(name="USERS"
    ,schema="dbo"
    ,catalog="PRST001_prod"
)
public class Users  implements java.io.Serializable {


     private int id;
     private int groupId;
     private String name;
     private String username;
     private String password;
     private String email;
     private String noHandphone;
     private Integer status;
     private Date lastLogin;

    public Users() {
    }

	
    public Users(int id, int groupId, String username, String password) {
        this.id = id;
        this.groupId = groupId;
        this.username = username;
        this.password = password;
    }
    public Users(int id, int groupId, String name, String username, String password, String email, String noHandphone, Integer status, Date lastLogin) {
       this.id = id;
       this.groupId = groupId;
       this.name = name;
       this.username = username;
       this.password = password;
       this.email = email;
       this.noHandphone = noHandphone;
       this.status = status;
       this.lastLogin = lastLogin;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="GROUP_ID", nullable=false)
    public int getGroupId() {
        return this.groupId;
    }
    
    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    
    @Column(name="NAME", length=100)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="USERNAME", nullable=false, length=50)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    
    @Column(name="PASSWORD", nullable=false, length=50)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="EMAIL", length=100)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="NO_HANDPHONE", length=100)
    public String getNoHandphone() {
        return this.noHandphone;
    }
    
    public void setNoHandphone(String noHandphone) {
        this.noHandphone = noHandphone;
    }

    
    @Column(name="STATUS")
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="LAST_LOGIN", length=23)
    public Date getLastLogin() {
        return this.lastLogin;
    }
    
    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }




}


