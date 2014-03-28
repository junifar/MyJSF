package models;
// Generated Mar 27, 2014 2:07:59 PM by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Sites generated by hbm2java
 */
@Entity
@Table(name="SITES"
    ,schema="dbo"
    ,catalog="PRST001_prod"
)
public class Sites  implements java.io.Serializable {


     private int id;
     private Integer customerId;
     private String prasetiaSiteId;
     private String customerSiteId;
     private Integer operatorId;
     private Integer islandId;
     private Integer provinceId;
     private Integer cityId;
     private Integer towerTypeId;
     private Integer kakiTowerTypeId;
     private Integer tinggiTowerId;
     private Integer pondasiTypeId;
     private Integer shelterTypeId;
     private String name;
     private String alias1;
     private String alias2;
     private String address;
     private String actualCoordinateLong;
     private String actualCoordinateLat;
     private Integer userCreated;
     private Date created;
     private Date modified;
     private Integer areaId;
     private String pabrikasiTower;
     private String dayaPln;
     private Integer fieldTypeId;
     private Integer bunga;
     private BigDecimal fixedCost;
     private Integer keuanganProjectLock;

    public Sites() {
    }

	
    public Sites(int id) {
        this.id = id;
    }
    public Sites(int id, Integer customerId, String prasetiaSiteId, String customerSiteId, Integer operatorId, Integer islandId, Integer provinceId, Integer cityId, Integer towerTypeId, Integer kakiTowerTypeId, Integer tinggiTowerId, Integer pondasiTypeId, Integer shelterTypeId, String name, String alias1, String alias2, String address, String actualCoordinateLong, String actualCoordinateLat, Integer userCreated, Date created, Date modified, Integer areaId, String pabrikasiTower, String dayaPln, Integer fieldTypeId, Integer bunga, BigDecimal fixedCost, Integer keuanganProjectLock) {
       this.id = id;
       this.customerId = customerId;
       this.prasetiaSiteId = prasetiaSiteId;
       this.customerSiteId = customerSiteId;
       this.operatorId = operatorId;
       this.islandId = islandId;
       this.provinceId = provinceId;
       this.cityId = cityId;
       this.towerTypeId = towerTypeId;
       this.kakiTowerTypeId = kakiTowerTypeId;
       this.tinggiTowerId = tinggiTowerId;
       this.pondasiTypeId = pondasiTypeId;
       this.shelterTypeId = shelterTypeId;
       this.name = name;
       this.alias1 = alias1;
       this.alias2 = alias2;
       this.address = address;
       this.actualCoordinateLong = actualCoordinateLong;
       this.actualCoordinateLat = actualCoordinateLat;
       this.userCreated = userCreated;
       this.created = created;
       this.modified = modified;
       this.areaId = areaId;
       this.pabrikasiTower = pabrikasiTower;
       this.dayaPln = dayaPln;
       this.fieldTypeId = fieldTypeId;
       this.bunga = bunga;
       this.fixedCost = fixedCost;
       this.keuanganProjectLock = keuanganProjectLock;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="CUSTOMER_ID")
    public Integer getCustomerId() {
        return this.customerId;
    }
    
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    
    @Column(name="PRASETIA_SITE_ID", length=12)
    public String getPrasetiaSiteId() {
        return this.prasetiaSiteId;
    }
    
    public void setPrasetiaSiteId(String prasetiaSiteId) {
        this.prasetiaSiteId = prasetiaSiteId;
    }

    
    @Column(name="CUSTOMER_SITE_ID", length=25)
    public String getCustomerSiteId() {
        return this.customerSiteId;
    }
    
    public void setCustomerSiteId(String customerSiteId) {
        this.customerSiteId = customerSiteId;
    }

    
    @Column(name="OPERATOR_ID")
    public Integer getOperatorId() {
        return this.operatorId;
    }
    
    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    
    @Column(name="ISLAND_ID")
    public Integer getIslandId() {
        return this.islandId;
    }
    
    public void setIslandId(Integer islandId) {
        this.islandId = islandId;
    }

    
    @Column(name="PROVINCE_ID")
    public Integer getProvinceId() {
        return this.provinceId;
    }
    
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    
    @Column(name="CITY_ID")
    public Integer getCityId() {
        return this.cityId;
    }
    
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    
    @Column(name="TOWER_TYPE_ID")
    public Integer getTowerTypeId() {
        return this.towerTypeId;
    }
    
    public void setTowerTypeId(Integer towerTypeId) {
        this.towerTypeId = towerTypeId;
    }

    
    @Column(name="KAKI_TOWER_TYPE_ID")
    public Integer getKakiTowerTypeId() {
        return this.kakiTowerTypeId;
    }
    
    public void setKakiTowerTypeId(Integer kakiTowerTypeId) {
        this.kakiTowerTypeId = kakiTowerTypeId;
    }

    
    @Column(name="TINGGI_TOWER_ID")
    public Integer getTinggiTowerId() {
        return this.tinggiTowerId;
    }
    
    public void setTinggiTowerId(Integer tinggiTowerId) {
        this.tinggiTowerId = tinggiTowerId;
    }

    
    @Column(name="PONDASI_TYPE_ID")
    public Integer getPondasiTypeId() {
        return this.pondasiTypeId;
    }
    
    public void setPondasiTypeId(Integer pondasiTypeId) {
        this.pondasiTypeId = pondasiTypeId;
    }

    
    @Column(name="SHELTER_TYPE_ID")
    public Integer getShelterTypeId() {
        return this.shelterTypeId;
    }
    
    public void setShelterTypeId(Integer shelterTypeId) {
        this.shelterTypeId = shelterTypeId;
    }

    
    @Column(name="NAME", length=50)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="ALIAS_1", length=50)
    public String getAlias1() {
        return this.alias1;
    }
    
    public void setAlias1(String alias1) {
        this.alias1 = alias1;
    }

    
    @Column(name="ALIAS_2", length=50)
    public String getAlias2() {
        return this.alias2;
    }
    
    public void setAlias2(String alias2) {
        this.alias2 = alias2;
    }

    
    @Column(name="ADDRESS", length=100)
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    
    @Column(name="ACTUAL_COORDINATE_LONG", length=15)
    public String getActualCoordinateLong() {
        return this.actualCoordinateLong;
    }
    
    public void setActualCoordinateLong(String actualCoordinateLong) {
        this.actualCoordinateLong = actualCoordinateLong;
    }

    
    @Column(name="ACTUAL_COORDINATE_LAT", length=15)
    public String getActualCoordinateLat() {
        return this.actualCoordinateLat;
    }
    
    public void setActualCoordinateLat(String actualCoordinateLat) {
        this.actualCoordinateLat = actualCoordinateLat;
    }

    
    @Column(name="USER_CREATED")
    public Integer getUserCreated() {
        return this.userCreated;
    }
    
    public void setUserCreated(Integer userCreated) {
        this.userCreated = userCreated;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CREATED", length=23)
    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="MODIFIED", length=23)
    public Date getModified() {
        return this.modified;
    }
    
    public void setModified(Date modified) {
        this.modified = modified;
    }

    
    @Column(name="AREA_ID")
    public Integer getAreaId() {
        return this.areaId;
    }
    
    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    
    @Column(name="PABRIKASI_TOWER", length=50)
    public String getPabrikasiTower() {
        return this.pabrikasiTower;
    }
    
    public void setPabrikasiTower(String pabrikasiTower) {
        this.pabrikasiTower = pabrikasiTower;
    }

    
    @Column(name="DAYA_PLN", length=50)
    public String getDayaPln() {
        return this.dayaPln;
    }
    
    public void setDayaPln(String dayaPln) {
        this.dayaPln = dayaPln;
    }

    
    @Column(name="FIELD_TYPE_ID")
    public Integer getFieldTypeId() {
        return this.fieldTypeId;
    }
    
    public void setFieldTypeId(Integer fieldTypeId) {
        this.fieldTypeId = fieldTypeId;
    }

    
    @Column(name="BUNGA")
    public Integer getBunga() {
        return this.bunga;
    }
    
    public void setBunga(Integer bunga) {
        this.bunga = bunga;
    }

    
    @Column(name="FIXED_COST", precision=12)
    public BigDecimal getFixedCost() {
        return this.fixedCost;
    }
    
    public void setFixedCost(BigDecimal fixedCost) {
        this.fixedCost = fixedCost;
    }

    
    @Column(name="KEUANGAN_PROJECT_LOCK")
    public Integer getKeuanganProjectLock() {
        return this.keuanganProjectLock;
    }
    
    public void setKeuanganProjectLock(Integer keuanganProjectLock) {
        this.keuanganProjectLock = keuanganProjectLock;
    }




}


