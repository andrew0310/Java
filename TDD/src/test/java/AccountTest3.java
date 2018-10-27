import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.core.StringStartsWith.startsWith;
import static org.junit.Assert.fail;

public class AccountTest3 {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldThrowsNotEnoughMoneyException() throws Exception {

        // given
        final Account account = new Account("Maciej");
        account.deposit(100);
        thrown.expect(NotEnoughMoneyException.class);
        thrown.expectMessage("cannot withdraw 200");
        thrown.expectMessage(startsWith("Account{name='Maciej'"));

        // when
        account.withdraw(200);

        // then
        fail("attempt to withdraw too much money should throw an exception"); // optional
    }
}