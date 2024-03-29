public class CheckingAccount extends Account {
    private double credit;

    public CheckingAccount() {
        super(0, "");
        credit = 0;
    }
    public CheckingAccount(double balance, String name, double credit) {
        super(balance, name);
        this.credit = credit;
    }
    public void setCredit(double credit) {
        if (credit > 0) {
            this.credit = credit;
        }
        else {
            System.out.println("Input number must be a positive integer.");
        }
    }
    public double getCredit() {
        return credit;
    }
    public void withdraw(double a) throws WithdrawException {
        if (a > 0) {
            if ((balance - a) >= 0) {
                if (a > 0) {
                    System.out.println(a + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
                    balance -= a;
                }
                else if ((balance - a) < 0) {
                    throw new WithdrawException("Account " + name + " has not enough money.");
                }
                else {
                System.out.println("Input number must be a positive integer.");
                }
            }
            else if ((balance - a) + credit >= 0) {
                    credit = balance - a + credit;
                    balance = 0;
                    System.out.println(a + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
            }
            else {
                throw new WithdrawException("Account " + name + " has not enough money.");
                }
            }
        }
    public void withdraw(String a) throws WithdrawException {
        withdraw(Double.parseDouble(a));
    }
    public String toString() {
        return "The " + name + " account has " + balance + " baht and " + credit + " credits.";
    }
}
