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
 * StatMandor generated by hbm2java
 */
@Entity
@Table(name="STAT_MANDOR"
    ,schema="dbo"
    ,catalog="PRST001_prod"
)
public class StatMandor  implements java.io.Serializable {


     private int id;
     private String kriteriaPenilaian;
     private String deskripsi;
     private Integer bobot;
     private Integer created;
     private Date dateCreated;

    public StatMandor() {
    }

	
    public StatMandor(int id) {
        this.id = id;
    }
    public StatMandor(int id, String kriteriaPenilaian, String deskripsi, Integer bobot, Integer created, Date dateCreated) {
       this.id = id;
       this.kriteriaPenilaian = kriteriaPenilaian;
       this.deskripsi = deskripsi;
       this.bobot = bobot;
       this.created = created;
       this.dateCreated = dateCreated;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="KRITERIA_PENILAIAN", length=1000)
    public String getKriteriaPenilaian() {
        return this.kriteriaPenilaian;
    }
    
    public void setKriteriaPenilaian(String kriteriaPenilaian) {
        this.kriteriaPenilaian = kriteriaPenilaian;
    }

    
    @Column(name="DESKRIPSI", length=1000)
    public String getDeskripsi() {
        return this.deskripsi;
    }
    
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    
    @Column(name="BOBOT")
    public Integer getBobot() {
        return this.bobot;
    }
    
    public void setBobot(Integer bobot) {
        this.bobot = bobot;
    }

    
    @Column(name="CREATED")
    public Integer getCreated() {
        return this.created;
    }
    
    public void setCreated(Integer created) {
        this.created = created;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DATE_CREATED", length=10)
    public Date getDateCreated() {
        return this.dateCreated;
    }
    
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }




}


