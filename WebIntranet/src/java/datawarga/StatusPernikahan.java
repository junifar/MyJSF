package datawarga;
// Generated Mar 20, 2014 10:11:04 PM by Hibernate Tools 3.6.0



/**
 * StatusPernikahan generated by hbm2java
 */
public class StatusPernikahan  implements java.io.Serializable {


     private Integer id;
     private String name;

    public StatusPernikahan() {
    }

    public StatusPernikahan(String name) {
       this.name = name;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }




}


