package model;
// Generated Mar 25, 2014 6:54:33 AM by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Penduduk generated by hbm2java
 */
@Entity
@Table(name="penduduk"
    ,catalog="rtrw"
)
public class Penduduk  implements java.io.Serializable {


     private Integer id;
     private String nik;
     private String name;

    public Penduduk() {
    }

    public Penduduk(String nik, String name) {
       this.nik = nik;
       this.name = name;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="nik", nullable=false, length=20)
    public String getNik() {
        return this.nik;
    }
    
    public void setNik(String nik) {
        this.nik = nik;
    }

    
    @Column(name="name", nullable=false, length=100)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }




}

