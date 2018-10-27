import org.junit.Assert;
import org.junit.Test;

public class AccountTest1 {

    @Test(expected = NotEnoughMoneyException.class)
    public void shouldThrowsNotEnoughMoneyException() throws Exception {
        // given
        final Account account = new Account("Maciej");
        account.deposit(100);

        // when
        account.withdraw(200);

        // then
        Assert.fail("attempt to withdraw too much money should throw an exception");  // optional
    }
}

