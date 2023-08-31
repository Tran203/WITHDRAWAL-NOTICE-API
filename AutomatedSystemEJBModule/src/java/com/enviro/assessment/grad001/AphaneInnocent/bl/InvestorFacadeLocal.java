/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enviro.assessment.grad001.AphaneInnocent.bl;

import com.enviro.assessment.grad001.AphaneInnocent.entities.Investor;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Student
 */
@Local
public interface InvestorFacadeLocal {

    void create(Investor investor);

    void edit(Investor investor);

    void remove(Investor investor);

    Investor find(Object id);

    List<Investor> findAll();

    List<Investor> findRange(int[] range);

    int count();
    
}
