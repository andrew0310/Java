import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {

    private BankAccount bankAccount;

    @Before
    public void init(){
        bankAccount = new BankAccount("Andrzej");
    }

    @Test
    public void depositTestZero() {
        Assert.assertEquals(0, bankAccount.deposit(0));
    }

    @Test
    public void depositTestPositive() {
        Assert.assertEquals(300, bankAccount.deposit(300));
    }

    @Test
    public void depositTestNegative() {
        Assert.assertEquals(0, bankAccount.deposit(-150));
    }

    @Test
    public void withdrawTestZero() throws NotEnoughMoneyException {
        Assert.assertEquals(0, bankAccount.withdraw(0));
    }

   @Test
    public void withdrawTestPositive() throws NotEnoughMoneyException {
        Assert.assertEquals(0, bankAccount.withdraw(150));
    }

    @Test
    public void withdrawTestNegative() throws NotEnoughMoneyException {
        Assert.assertEquals(0, bankAccount.withdraw(-150));
    }
}
