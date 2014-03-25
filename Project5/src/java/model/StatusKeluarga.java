package model;
// Generated Mar 25, 2014 6:54:33 AM by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * StatusKeluarga generated by hbm2java
 */
@Entity
@Table(name="status_keluarga"
    ,catalog="rtrw"
)
public class StatusKeluarga  implements java.io.Serializable {


     private Integer id;
     private String name;

    public StatusKeluarga() {
    }

    public StatusKeluarga(String name) {
       this.name = name;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="ID", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="NAME", length=100)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }




}


