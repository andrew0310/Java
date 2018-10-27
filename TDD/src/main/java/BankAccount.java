public class BankAccount {
    private int balance = 0;
    private String name;


    public BankAccount(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int deposit(final int ammount) {
        if (ammount < 0) {
            System.out.println("Ammount cannot be less than 0");
        } else {
            balance += ammount;
        }
        return balance;
    }

    public int withdraw(final int ammount) {

        if (ammount < 0) {
            System.out.println("Ammount cannot be less than 0");
        } else if (ammount > 0) {
            if (ammount > balance) {
                System.out.println("Sorry, low balance");
            } else {
                balance -= ammount;
            }
        }
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", name='" + name + '\'' +
                '}';
    }
}
