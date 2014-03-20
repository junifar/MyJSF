/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agama;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author Junifar
 */
@ManagedBean
@RequestScoped
public class AgamaController {
    DataModel listAgama;
    AgamaHelper helper;
    public AgamaController() {
        helper = new AgamaHelper();
    }
    
    public DataModel getListAgama(){
        if(listAgama == null){
            listAgama = new ListDataModel(helper.getListAgama());
        }
        return listAgama;
    }        
    
}
