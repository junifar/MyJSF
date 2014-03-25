/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.JenisKelamin;

/**
 *
 * @author Junifar
 */
@Stateless
public class JenisKelaminFacade extends AbstractFacade<JenisKelamin> {
    @PersistenceContext(unitName = "Project5PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public JenisKelaminFacade() {
        super(JenisKelamin.class);
    }
    
}
