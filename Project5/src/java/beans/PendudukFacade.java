/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Penduduk;

/**
 *
 * @author Junifar
 */
@Stateless
public class PendudukFacade extends AbstractFacade<Penduduk> {
    @PersistenceContext(unitName = "Project5PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PendudukFacade() {
        super(Penduduk.class);
    }
    
}
