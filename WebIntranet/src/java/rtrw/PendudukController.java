/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rtrw;

import java.io.IOException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author prasetia
 */
@ManagedBean
@RequestScoped
public class PendudukController {

    private String nik;

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private String name;
    
    int startId;
    int endId;
    
    DataModel pendudukList;
    
    PendudukHelper helper;
    
    private int recordCount = 1000;
    private int pageSize = 10;
    
    private Penduduk current;
    private int selectedItemIndex;
    
    public PendudukController() {
        helper = new PendudukHelper();
        startId = 1;
        endId = 1000;
    }
    
    public Penduduk getSelected(){
        if(current == null){
            current = new Penduduk();
            selectedItemIndex = -1;
        }
        return  current;
    }
    
    public DataModel getPendudukList(){
        if(pendudukList == null){
            pendudukList = new ListDataModel(helper.getListPenduduk(startId, endId));
        }
        return pendudukList;
    }
    
    
    public String newPenduduk() throws IOException
    {
        helper.insertPenduduk(nik, name);
        return "viewpenduduk?faces-redirect=true";
    }
    
    void recreateModel(){
        pendudukList = null;
    }
    
    public boolean isHasNextPage(){
        if(endId + pageSize <= recordCount){
            return true;
        }
        return false;
    }
    
    public boolean isHasPreviousPage(){
        if(startId - pageSize > 0){
            return true;
        }
        return false;
    }
    
     public String next() {
        startId = endId+1;
        endId = endId + pageSize;
        recreateModel();
        return "index";
    }

    public String previous() {
        startId = startId - pageSize;
        endId = endId - pageSize;
        recreateModel();
        return "index";
    }

    public int getPageSize() {
        return pageSize;
    }

    public String prepareView(){
        current = (Penduduk) getPendudukList().getRowData();
        return "browse";
    }
    public String prepareList(){
        recreateModel();
        return "index";
    }
}
