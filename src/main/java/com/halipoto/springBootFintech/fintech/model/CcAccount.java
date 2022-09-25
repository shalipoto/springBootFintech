package com.halipoto.springBootFintech.fintech.model;

import java.math.BigDecimal;

/**
 * This class represents a credit card account
 * as it is retrieved from the back end system
 */
public class CcAccount
{

    String cardAccountNumber;
    String userName;
    BigDecimal totalBalanceDue;
    BigDecimal lastStatementBalanceDue;
    BigDecimal minimumPaymentDue;
    int gracePeriod;
    String cardProcessorPartner;
    int productCode;
    String rewardsType;
    boolean isAutoPayenrolled;
    boolean isChipCard;
    String cardStatus;

}
