package com.halipoto.springBootFintech.fintech.service;

import com.halipoto.springBootFintech.fintech.model.CardAcct;
import com.halipoto.springBootFintech.fintech.model.CcAccount;

public class AccountService {

    /**
     * This method receives a CcAccount retreived from the backend
     * and then populates the ui card account object with synthetic data
     * @param cc
     * @return cardAcct
     */
    public CardAcct processCreditCardAccountForUi(CcAccount cc){

        CardAcct cardAcct = new CardAcct();

        // TODO
        // take the input CcAccount object, create values and add to the
        // newly created CardAcct object and return the object.
        // you are only required to populate the cardAcct object completely

    }
}
