package com.halipoto.springBootFintech.fintech.service;

import com.halipoto.springBootFintech.fintech.model.CardAcct;
import com.halipoto.springBootFintech.fintech.model.CcAccount;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;
import static org.junit.Assert.*;

import java.math.BigDecimal;

public class TestAccountService {

    @InjectMocks //gives the class you want to test and names it service
    AccountService service = new AccountService(); //MAKE SURE U DO THIS?

    @Test
    public void accountProcessingTest (){
        CcAccount newCCAccount = new CcAccount(); //populating 'original' cc account

        newCCAccount.setCardAccountNumber("987654321");
        newCCAccount.setUserName("aaminahh");
        newCCAccount.setTotalBalanceDue(BigDecimal.valueOf(239349.23));
        newCCAccount.setLastStatementBalanceDue(BigDecimal.valueOf(495.49));
        newCCAccount.setMinimumPaymentDue(BigDecimal.valueOf(12.34));
        newCCAccount.setGracePeriod(12);
        newCCAccount.setCardProcessorPartner("Comerica");
        newCCAccount.setProductCode(388595);
        newCCAccount.setRewardsType("premium");
        newCCAccount.setAutoPayenrolled(false);
        newCCAccount.setChipCard(true);
        newCCAccount.setCardStatus("available");

        CardAcct thunder = new CardAcct(); //now making dummy card account

        thunder = service.processCreditCardAccountForUi(newCCAccount); // processing thunder class

        assertEquals("987654321", thunder.getCcAccountNumber()); // checking each thunder att
        assertEquals(BigDecimal.valueOf(239349.23), thunder.getTotalBalance());
        assertEquals(BigDecimal.valueOf(495.49), thunder.getLastStatementBalanceDue());
        assertEquals(BigDecimal.valueOf(12.34), thunder.getMinimumPaymentAmountDue());
        assertEquals(12, thunder.getGracePeriod());
        assertEquals("Comerica", thunder.getCardProcessor());
        assertEquals("premium", thunder.getRewards());
        assertEquals("false", thunder.getAutopayIndicator());
        assertEquals("true", thunder.getChipCardIndicator());
        assertEquals("available", thunder.getCardStatus());

    }

    // TODO
    /** Write a new test method to see what your code does when one or more of the
     *  inputs are null or have empty String values (e.g. "")
     */

}
