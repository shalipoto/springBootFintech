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

    public String getCcAccountNumber() {
        return ccAccountNumber;
    }

    public void setCcAccountNumber(String ccAccountNumber) {
        this.ccAccountNumber = ccAccountNumber;
    }

    public BigDecimal getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(BigDecimal totalBalance) {
        this.totalBalance = totalBalance;
    }

    public BigDecimal getLastStatementBalanceDue() {
        return lastStatementBalanceDue;
    }

    public void setLastStatementBalanceDue(BigDecimal lastStatementBalanceDue) {
        this.lastStatementBalanceDue = lastStatementBalanceDue;
    }

    public BigDecimal getMinimumPaymentAmountDue() {
        return minimumPaymentAmountDue;
    }

    public void setMinimumPaymentAmountDue(BigDecimal minimumPaymentAmountDue) {
        this.minimumPaymentAmountDue = minimumPaymentAmountDue;
    }

    public int getGracePeriod() {
        return gracePeriod;
    }

    public void setGracePeriod(int gracePeriod) {
        this.gracePeriod = gracePeriod;
    }

    public String getCardProcessor() {
        return cardProcessor;
    }

    public void setCardProcessor(String cardProcessor) {
        this.cardProcessor = cardProcessor;
    }

    public String getRewards() {
        return rewards;
    }

    public void setRewards(String rewards) {
        this.rewards = rewards;
    }

    public String getAutopayIndicator() {
        return autopayIndicator;
    }

    public void setAutopayIndicator(String autopayIndicator) {
        this.autopayIndicator = autopayIndicator;
    }

    public String getChipCardIndicator() {
        return chipCardIndicator;
    }

    public void setChipCardIndicator(String chipCardIndicator) {
        this.chipCardIndicator = chipCardIndicator;
    }

    public String getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(String cardStatus) {
        this.cardStatus = cardStatus;
    }
}
