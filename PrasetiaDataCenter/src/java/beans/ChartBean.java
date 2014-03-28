/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;

/**
 *
 * @author prasetia
 */
@ManagedBean(name = "ChartBean")
@NoneScoped
public class ChartBean {
    
    private CartesianChartModel categoryModel;

    public CartesianChartModel getCategoryModel() {
        return categoryModel;
    }

    public void setCategoryModel(CartesianChartModel categoryModel) {
        this.categoryModel = categoryModel;
    }
    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public ChartBean() {
        createCategoryModel();  
    }
    
    private void createCategoryModel() {  
        categoryModel = new CartesianChartModel();  
  
        ChartSeries boys = new ChartSeries();  
        boys.setLabel("Test");  
  
        boys.set("2004", 120);  
        boys.set("2005", 100);    
  
        categoryModel.addSeries(boys);   
    }  
    
}
