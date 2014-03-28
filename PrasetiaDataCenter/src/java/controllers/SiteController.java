/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import helpers.SiteHelper;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.DataModel;
import models.Sites;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

/**
 *
 * @author prasetia
 */
@ManagedBean
@SessionScoped
public class SiteController {
    
    DataModel listSite;
    SiteHelper helper;
    /**
     * Creates a new instance of SiteController
     */
    public List<Sites> filterSite;
    public Sites selectedSite;
    public Sites test;

    public Sites getTest() {
        return test;
    }

    public void setTest(Sites test) {
        this.test = test;
    }
    

    public Sites getSelectedSite() {
        return selectedSite;
    }

    public void setSelectedSite(Sites selectedSite) {
        this.selectedSite = selectedSite;
    }

    public List<Sites> getFilterSite() {
        return filterSite;
    }

    public void setFilterSite(List<Sites> filterSite) {
        this.filterSite = filterSite;
    }
    
    
    public SiteController() {
        helper = new SiteHelper();
    }
    
    public List<Sites> getListAgama(){
        List<Sites> site;
        site = helper.geListSite();
        return  site;
    }
    
    public void onRowSelect(SelectEvent event) {  
        FacesMessage msg = new FacesMessage("Site Selected", ((Sites) event.getObject()).getPrasetiaSiteId());  
  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }  
    
     public void onRowUnselect(UnselectEvent event) {  
        FacesMessage msg = new FacesMessage("Site Unselected", ((Sites) event.getObject()).getPrasetiaSiteId());  
  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }  
}
