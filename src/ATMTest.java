import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ATMTest {
    ATM atm = new ATM(5000);
    Account account = new Account(1,123,2000);
    @Test
    void loginTest() {
        assertEquals(atm.login(account,123),"Login successful");
        assertEquals(atm.login(account,111),"Login unsuccessful");
        assertEquals(atm.login(account,-123),"Login unsuccessful");
    }

    @Test
    void depositTest() {
        assertEquals(atm.Deposit(account,1000), "Deposit successful");
        assertEquals(account.balance,3000);
        assertEquals(atm.availableCash,6000);

    }

    @Test
    void withdrawTest() {
        assertEquals(atm.Withdraw(account,1000),"Withdraw successful");
        assertEquals(atm.Withdraw(account,5000),"No sufficient funds in ATM");
        assertEquals(atm.Withdraw(account,12),"please choose amount in multiple of 10 and bigger than or equal 50");
    }
}