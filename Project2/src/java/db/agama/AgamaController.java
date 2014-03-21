/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package db.agama;

import java.io.IOException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author prasetia
 */
@ManagedBean
@SessionScoped
public class AgamaController extends Agama{
    
    DataModel listAgama;
    AgamaHelper helper;
    
    /**
     * Creates a new instance of AgamaController
     */
    public AgamaController() {
        helper = new AgamaHelper();
    }
    
    public DataModel getListAgama(){
        if(listAgama == null){
            listAgama = new ListDataModel(helper.getListAgama());
        }
        return listAgama;
    }       
    
    public String newAgama() throws IOException
    {
        helper.insertAgama(getName());
        return "listagama?faces-redirect=true";
    }
}
