package db.agama;
// Generated Mar 21, 2014 3:20:06 PM by Hibernate Tools 3.6.0



/**
 * Agama generated by hbm2java
 */
public class Agama  implements java.io.Serializable {


     private Integer id;
     private String name;

    public Agama() {
    }

    public Agama(String name) {
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

