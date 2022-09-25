package com.halipoto.springBootFintech.fintech.model;

import java.math.BigDecimal;

/**
 * This class represents the credit card account
 * as it is expected by the Ui for display to the
 * customer
 */
public class CardAcct {

    String ccAccountNumber;
    BigDecimal totalBalance;
    BigDecimal lastStatementBalanceDue;
    BigDecimal minimumPaymentAmountDue;
    int gracePeriod;
    String cardProcessor;
    String rewards;
    String autopayIndicator;
    String chipCardIndicator;
    String cardStatus;

}
