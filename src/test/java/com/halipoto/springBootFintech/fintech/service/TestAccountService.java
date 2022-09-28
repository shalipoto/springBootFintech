package com.halipoto.springBootFintech.fintech.service;

import com.halipoto.springBootFintech.fintech.model.CardAcct;
import com.halipoto.springBootFintech.fintech.model.CcAccount;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class TestAccountService {

    //@InjectMocks //gives the class you want to test and names it service
    AccountService service = new AccountService(); //MAKE SURE U DO THIS?
    CardAcct thunder = new CardAcct(); //now making dummy ui account
    List<CardAcct> thunderList = new ArrayList<>(); // now making dummy ui account list

    @Test //needed for every test method
    public void accountProcessingTest () throws Exception {
        CcAccount newCCAccount = new CcAccount(); //instantiating ccaccount to put dummy backend data into

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

        thunder = service.processCreditCardAccountForUi(newCCAccount); // service class now populates ui account object

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
    @Test
    public void accountListProcessingTest () throws Exception{
        List<CcAccount> newCcAccountList = new ArrayList<CcAccount>();

        thunderList = service.processCreditCardAccountListForUi();
    }
    // TODO
    /** Write a new test method to see what your code does when one or more of the
     *  inputs are null or have empty String values (e.g. "")
     */
    @Test(expected = Exception.class) // ensuring that test case passes on exception
    //method throws an exception, finds exception, passes bc it finds exception
    public void validateCCNumberTest () throws Exception {
        CcAccount newCCAccount = new CcAccount(); //casting 'original' cc account

        newCCAccount.setCardAccountNumber(null);
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
    @Test(expected = Exception.class)
    public void validateCCTotalBalanceDueTest () throws Exception {
        CcAccount newCCAccount = new CcAccount(); //casting 'original' cc account

        newCCAccount.setCardAccountNumber("123546789");
        newCCAccount.setUserName("aaminahh");
        newCCAccount.setTotalBalanceDue(null);
        newCCAccount.setLastStatementBalanceDue(BigDecimal.valueOf(495.49));
        newCCAccount.setMinimumPaymentDue(BigDecimal.valueOf(12.34));
        newCCAccount.setGracePeriod(12);
        newCCAccount.setCardProcessorPartner("Comerica");
        newCCAccount.setProductCode(388595);
        newCCAccount.setRewardsType("premium");
        newCCAccount.setAutoPayenrolled(false);
        newCCAccount.setChipCard(true);
        newCCAccount.setCardStatus("available");

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
    @Test(expected = Exception.class)
    public void validateCCLastStatementDueTest () throws Exception {
        CcAccount newCCAccount = new CcAccount(); //casting 'original' cc account

        newCCAccount.setCardAccountNumber("123546789");
        newCCAccount.setUserName("aaminahh");
        newCCAccount.setTotalBalanceDue(BigDecimal.valueOf(239349.23));
        newCCAccount.setLastStatementBalanceDue(null);
        newCCAccount.setMinimumPaymentDue(BigDecimal.valueOf(12.34));
        newCCAccount.setGracePeriod(12);
        newCCAccount.setCardProcessorPartner("Comerica");
        newCCAccount.setProductCode(388595);
        newCCAccount.setRewardsType("premium");
        newCCAccount.setAutoPayenrolled(false);
        newCCAccount.setChipCard(true);
        newCCAccount.setCardStatus("available");

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
    @Test(expected = Exception.class)
    public void validateCCMinimumPaymentTest () throws Exception {
        CcAccount newCCAccount = new CcAccount(); //casting 'original' cc account

        newCCAccount.setCardAccountNumber("123546789");
        newCCAccount.setUserName("aaminahh");
        newCCAccount.setTotalBalanceDue(BigDecimal.valueOf(239349.23));
        newCCAccount.setLastStatementBalanceDue(BigDecimal.valueOf(495.49));
        newCCAccount.setMinimumPaymentDue(null);
        newCCAccount.setGracePeriod(12);
        newCCAccount.setCardProcessorPartner("Comerica");
        newCCAccount.setProductCode(388595);
        newCCAccount.setRewardsType("premium");
        newCCAccount.setAutoPayenrolled(false);
        newCCAccount.setChipCard(true);
        newCCAccount.setCardStatus("available");

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
    @Test(expected = Exception.class)
    public void validateCCProcessorPartnerTest () throws Exception {
        CcAccount newCCAccount = new CcAccount(); //casting 'original' cc account

        newCCAccount.setCardAccountNumber("123546789");
        newCCAccount.setUserName("aaminahh");
        newCCAccount.setTotalBalanceDue(BigDecimal.valueOf(239349.23));
        newCCAccount.setLastStatementBalanceDue(BigDecimal.valueOf(495.49));
        newCCAccount.setMinimumPaymentDue(BigDecimal.valueOf(12.34));
        newCCAccount.setGracePeriod(12);
        newCCAccount.setCardProcessorPartner(null);
        newCCAccount.setProductCode(388595);
        newCCAccount.setRewardsType("premium");
        newCCAccount.setAutoPayenrolled(false);
        newCCAccount.setChipCard(true);
        newCCAccount.setCardStatus("available");

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
    @Test(expected = Exception.class)
    public void validateCCRewardsTypeTest () throws Exception {
        CcAccount newCCAccount = new CcAccount(); //casting 'original' cc account

        newCCAccount.setCardAccountNumber("123546789");
        newCCAccount.setUserName("aaminahh");
        newCCAccount.setTotalBalanceDue(BigDecimal.valueOf(239349.23));
        newCCAccount.setLastStatementBalanceDue(BigDecimal.valueOf(495.49));
        newCCAccount.setMinimumPaymentDue(BigDecimal.valueOf(12.34));
        newCCAccount.setGracePeriod(12);
        newCCAccount.setCardProcessorPartner("Comerica");
        newCCAccount.setProductCode(388595);
        newCCAccount.setRewardsType(null);
        newCCAccount.setAutoPayenrolled(false);
        newCCAccount.setChipCard(true);
        newCCAccount.setCardStatus("available");

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
    @Test(expected = Exception.class)
    public void validateCCCardStatusTest () throws Exception {
        CcAccount newCCAccount = new CcAccount(); //casting 'original' cc account

        newCCAccount.setCardAccountNumber("123546789");
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
        newCCAccount.setCardStatus(null);

        //CardAcct thunder = new CardAcct(); //now making dummy card account

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

}
