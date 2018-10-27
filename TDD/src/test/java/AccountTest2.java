import org.junit.Assert;
import org.junit.Test;

public class AccountTest2 {

    @Test
    public void shouldThrowNotEnoughMoneyException() throws Exception {
        // given
        final Account account = new Account("Maciej");
        account.deposit(100);

        try {
            // when
            account.withdraw(200);
            Assert.fail("attempt to withdraw too much money should throw an exception");
        } catch (NotEnoughMoneyException e) {
            // then
            Assert.assertEquals(100, account.getBalance());
            Assert.assertTrue(e.getMessage().contains("cannot withdraw"));
        }
    }
}
