public class Account {
    protected double balance;
    protected String name;

    public Account(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }
    public void deposit(double a) {
        if (a > 0) {
            System.out.println(a + " baht is deposited to " + name + ".");
            balance += a;
        }
        else {
            System.out.println("Input number must be a positive integer.");
        }
    }
    public void withdraw(double amount) throws WithdrawException {
        if (amount > 0) {
            System.out.println(amount + " baht is withdrawn from " + name + ".");
            balance -= amount;
        }
        else if ((balance - amount) < 0) {
            throw new WithdrawException("Account " + name + " has not enough money.");
        }
        else {
            System.out.println("Input number must be a positive integer.");
        }
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void showAccount() {
        System.out.println(name + " account has " + balance + " baht.");
    }
}
