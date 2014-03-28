/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.DashboardReorderEvent;
import org.primefaces.model.DashboardColumn;
import org.primefaces.model.DashboardModel;
import org.primefaces.model.DefaultDashboardColumn;
import org.primefaces.model.DefaultDashboardModel;

/**
 *
 * @author prasetia
 */
@ManagedBean
@NoneScoped
public class DashboardBean {
    private DashboardModel model;

    public DashboardModel getModel() {
        return model;
    }

    public void setModel(DashboardModel model) {
        this.model = model;
    }
    /**
     * Creates a new instance of DashboardBean
     */
    public DashboardBean() {
        model = new DefaultDashboardModel();  
        DashboardColumn column1 = new DefaultDashboardColumn();   
          
        column1.addWidget("CurrentTarget");
        column1.addWidget("ProjectChart"); 
        column1.addWidget("ProjectInfo");    
  
        model.addColumn(column1);  
    }
    
    public void handleReorder(DashboardReorderEvent event) {  
        FacesMessage message = new FacesMessage();  
        message.setSeverity(FacesMessage.SEVERITY_INFO);  
        message.setSummary("Reordered: " + event.getWidgetId());  
        message.setDetail("Item index: " + event.getItemIndex() + ", Column index: " + event.getColumnIndex() + ", Sender index: " + event.getSenderColumnIndex());  
          
        addMessage(message);  
    }  

    private void addMessage(FacesMessage message) {
         FacesContext.getCurrentInstance().addMessage(null, message);  
    }
}
