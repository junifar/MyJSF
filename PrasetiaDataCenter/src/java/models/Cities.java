package models;
// Generated Mar 27, 2014 2:07:59 PM by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Cities generated by hbm2java
 */
@Entity
@Table(name="CITIES"
    ,schema="dbo"
    ,catalog="PRST001_prod"
)
public class Cities  implements java.io.Serializable {


     private int id;
     private int provinceId;
     private String name;
     private Integer islandId;

    public Cities() {
    }

	
    public Cities(int id, int provinceId, String name) {
        this.id = id;
        this.provinceId = provinceId;
        this.name = name;
    }
    public Cities(int id, int provinceId, String name, Integer islandId) {
       this.id = id;
       this.provinceId = provinceId;
       this.name = name;
       this.islandId = islandId;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="PROVINCE_ID", nullable=false)
    public int getProvinceId() {
        return this.provinceId;
    }
    
    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    
    @Column(name="NAME", nullable=false, length=50)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="ISLAND_ID")
    public Integer getIslandId() {
        return this.islandId;
    }
    
    public void setIslandId(Integer islandId) {
        this.islandId = islandId;
    }




}


