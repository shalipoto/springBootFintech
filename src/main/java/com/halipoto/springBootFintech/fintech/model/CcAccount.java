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

    public String getCardAccountNumber() {
        return cardAccountNumber;
    }

    public void setCardAccountNumber(String cardAccountNumber) {
        this.cardAccountNumber = cardAccountNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public BigDecimal getTotalBalanceDue() {
        return totalBalanceDue;
    }

    public void setTotalBalanceDue(BigDecimal totalBalanceDue) {
        this.totalBalanceDue = totalBalanceDue;
    }

    public BigDecimal getLastStatementBalanceDue() {
        return lastStatementBalanceDue;
    }

    public void setLastStatementBalanceDue(BigDecimal lastStatementBalanceDue) {
        this.lastStatementBalanceDue = lastStatementBalanceDue;
    }

    public BigDecimal getMinimumPaymentDue() {
        return minimumPaymentDue;
    }

    public void setMinimumPaymentDue(BigDecimal minimumPaymentDue) {
        this.minimumPaymentDue = minimumPaymentDue;
    }

    public int getGracePeriod() {
        return gracePeriod;
    }

    public void setGracePeriod(int gracePeriod) {
        this.gracePeriod = gracePeriod;
    }

    public String getCardProcessorPartner() {
        return cardProcessorPartner;
    }

    public void setCardProcessorPartner(String cardProcessorPartner) {
        this.cardProcessorPartner = cardProcessorPartner;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getRewardsType() {
        return rewardsType;
    }

    public void setRewardsType(String rewardsType) {
        this.rewardsType = rewardsType;
    }

    public boolean isAutoPayenrolled() {
        return isAutoPayenrolled;
    }

    public void setAutoPayenrolled(boolean autoPayenrolled) {
        isAutoPayenrolled = autoPayenrolled;
    }

    public boolean isChipCard() {
        return isChipCard;
    }

    public void setChipCard(boolean chipCard) {
        isChipCard = chipCard;
    }

    public String getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(String cardStatus) {
        this.cardStatus = cardStatus;
    }
}
