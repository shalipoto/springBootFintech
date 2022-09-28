package com.halipoto.springBootFintech.fintech.service;

import com.halipoto.springBootFintech.fintech.model.CardAcct;
import com.halipoto.springBootFintech.fintech.model.CcAccount;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

    public List<CardAcct> processCreditCardAccountListForUi(List<CcAccount> ccList) throws Exception {
        CardAcct cardAcct = new CardAcct();
        processCCAccountList(ccList);
        return processCCAccountList(ccList);
    }

    /**
     * This method does the processing for the card accounts
     * that are returned from the backend in list format
     *
     *
     * @param ccList
     * @return CardAcct, card account object for ui consumption
     * @throws Exception
     * @author Mohammad Saleem Halipoto
     */
    private List<CardAcct> processCCAccountList(List<CcAccount> ccList) throws Exception {

        Iterator<CcAccount> itr = ccList.iterator();
        CcAccount ccAcct = new CcAccount();
        List<CardAcct> cardAcctList = new ArrayList<CardAcct>();

        while (itr.hasNext()) {
            CardAcct cardAcct = new CardAcct();
            ccAcct = itr.next();
            validateCCAccount(ccAcct);
            cardAcctList.add(processCCAccount(ccAcct, cardAcct));
        }
        return cardAcctList;
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
