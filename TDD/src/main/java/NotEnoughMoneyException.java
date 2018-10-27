public class NotEnoughMoneyException extends Exception {

    public NotEnoughMoneyException(final Account account, final int ammount) {
        super(account + " cannot withdraw " + ammount);
    }
}
