/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enviro.assessment.grad001.AphaneInnocent.bl;

import com.enviro.assessment.grad001.AphaneInnocent.entities.WithdrawalNotice;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Student
 */
@Stateless
public class WithdrawalNoticeFacade extends AbstractFacade<WithdrawalNotice> implements WithdrawalNoticeFacadeLocal {

    @PersistenceContext(unitName = "AutomatedSystemEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public WithdrawalNoticeFacade() {
        super(WithdrawalNotice.class);
    }
    
}
