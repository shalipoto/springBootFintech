package com.halipoto.springBootFintech.fintech.service;

import com.halipoto.springBootFintech.fintech.model.CardAcct;
import com.halipoto.springBootFintech.fintech.model.CcAccount;

public class AccountService {

    /**
     * This method receives a CcAccount retrieved from the backend
     * and then populates the UI card account object with synthetic data
     * @param cc backend
     * @return cardAcct
     * @author AHalipoto
     */

    // TODO
    // take the input CcAccount object, create values and add to the
    // newly created CardAcct object and return the object.
    // you are only required to populate the cardAcct object completely
    public CardAcct processCreditCardAccountForUi(CcAccount cc) throws Exception {

        CardAcct cardAcct = new CardAcct();

        validateCCAccount(cc);
        return processCCAccount(cc, cardAcct);

    }
    private CardAcct processCCAccount(CcAccount cc, CardAcct cardAcct) {
        cardAcct.setCardProcessor(cc.getCardProcessorPartner());
        if (cc.isAutoPayenrolled())
            cardAcct.setAutopayIndicator("true");
        else cardAcct.setAutopayIndicator("false");
        cardAcct.setCardStatus(cc.getCardStatus());
        if (cc.isChipCard())
            cardAcct.setChipCardIndicator("true");
        else cardAcct.setAutopayIndicator("false");
        cardAcct.setCcAccountNumber(cc.getCardAccountNumber());
        cardAcct.setGracePeriod(cc.getGracePeriod());
        cardAcct.setRewards(cc.getRewardsType());
        cardAcct.setTotalBalance(cc.getTotalBalanceDue());
        cardAcct.setMinimumPaymentAmountDue(cc.getMinimumPaymentDue());
        cardAcct.setLastStatementBalanceDue(cc.getLastStatementBalanceDue());

        return cardAcct;
    }

    private void validateCCAccount(CcAccount cc) throws Exception { //throws exception for null or empty string
        if (cc.getCardAccountNumber() == null
                || cc.getTotalBalanceDue() == null
                || cc.getLastStatementBalanceDue() == null
                || cc.getMinimumPaymentDue() == null
                || cc.getCardProcessorPartner() == null
                || cc.getRewardsType()== null
                || cc.getCardStatus() == null){
            throw new Exception("Values cannot be null");
        }
        if (cc.getCardAccountNumber().equals("")
                || cc.getCardProcessorPartner().equals("")
                || cc.getRewardsType().equals("")
                || cc.getCardStatus().equals("")){
            throw new Exception("String cannot be empty");
        }
    }

}
