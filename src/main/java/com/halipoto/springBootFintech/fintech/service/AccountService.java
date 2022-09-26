package com.halipoto.springBootFintech.fintech.service;

import com.halipoto.springBootFintech.fintech.model.CardAcct;
import com.halipoto.springBootFintech.fintech.model.CcAccount;
import org.springframework.core.env.SystemEnvironmentPropertySource;

public class AccountService {

    /**
     * This method receives a CcAccount retrieved from the backend
     * and then populates the UI card account object with synthetic data
     * @param cc
     * @return cardAcct
     * @author AHalipoto
     */

    // TODO
    // take the input CcAccount object, create values and add to the
    // newly created CardAcct object and return the object.
    // you are only required to populate the cardAcct object completely
    public CardAcct processCreditCardAccountForUi(CcAccount cc){

        CardAcct cardAcct = new CardAcct();

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
}
