/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enviro.assessment.grad001.AphaneInnocent.bl;

import com.enviro.assessment.grad001.AphaneInnocent.entities.WithdrawalNotice;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Student
 */
@Local
public interface WithdrawalNoticeFacadeLocal {

    void create(WithdrawalNotice withdrawalNotice);

    void edit(WithdrawalNotice withdrawalNotice);

    void remove(WithdrawalNotice withdrawalNotice);

    WithdrawalNotice find(Object id);

    List<WithdrawalNotice> findAll();

    List<WithdrawalNotice> findRange(int[] range);

    int count();
    
}
