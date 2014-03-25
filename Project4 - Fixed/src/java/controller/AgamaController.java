/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import helper.AgamaHelper;
import java.io.IOException;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.DataModel;
import model.Agama;

/**
 *
 * @author prasetia
 */
@ManagedBean
@SessionScoped
public class AgamaController {
    
    DataModel listAgama;
    AgamaHelper helper;
    
    private Agama ag;

    public Agama getAg() {
        return ag;
    }

    public void setAg(Agama ag) {
        this.ag = ag;
    }
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Creates a new instance of AgamaController
     */
    public AgamaController() {
        helper = new AgamaHelper();
    }
    
    public List<Agama> getListAgama(){
        List<Agama> agama;
        agama = helper.getListAgama();
        return agama;        
    }
    
    public List<Agama> getListAgamaByID(int id){
        List<Agama> agama;
        agama = helper.getListAgamaByID(id);
        return agama;        
    }
    
    public String newAgama() throws IOException
    {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        helper.insertAgama(this.getName());
        return "newTemplateClient?faces-redirect=true";
    }
    
    public String hapusAgama(int id)
    {
        helper.hapusAgama(id);
        return  "newTemplateClient?faces-redirect=true";
    }
    
    public String editAgama(){
        helper.editAgama(ag);
        return "newTemplateClient?faces-redirect=true";
    }
    
    public String loadAgama(Agama agama){
        ag = agama;        
        return "editAgama";
    }
}
