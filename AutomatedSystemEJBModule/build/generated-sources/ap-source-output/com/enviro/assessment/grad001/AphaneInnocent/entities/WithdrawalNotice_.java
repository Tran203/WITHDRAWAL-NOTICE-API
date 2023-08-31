package com.enviro.assessment.grad001.AphaneInnocent.entities;

import com.enviro.assessment.grad001.AphaneInnocent.entities.Product;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-08-31T19:36:49")
@StaticMetamodel(WithdrawalNotice.class)
public class WithdrawalNotice_ { 

    public static volatile SingularAttribute<WithdrawalNotice, Product> product;
    public static volatile SingularAttribute<WithdrawalNotice, Date> withdrawalDate;
    public static volatile SingularAttribute<WithdrawalNotice, Double> withdrawalAmount;
    public static volatile SingularAttribute<WithdrawalNotice, Long> id;

}