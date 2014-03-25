/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.StatusPernikahan;

/**
 *
 * @author Junifar
 */
@Stateless
public class StatusPernikahanFacade extends AbstractFacade<StatusPernikahan> {
    @PersistenceContext(unitName = "Project5PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StatusPernikahanFacade() {
        super(StatusPernikahan.class);
    }
    
}
