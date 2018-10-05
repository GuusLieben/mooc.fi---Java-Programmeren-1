public class LyyraCard {

    private double balance;

    public LyyraCard (double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public void payEconomical() {
        if (this.balance >= 2.5) {
            this.balance -= 2.5;
        }
    }

    public void payGourmet() {
        if (this.balance >= 4.0) {
            this.balance -= 4.0;
        }
    }

    public String toString() {
        return ("The card has " + balance + " euros");
    }

    public void loadMoney(double amount) {
        if (balance + amount > 150) {
            amount = 150 - balance;
        }
        if (!(amount <= 0)) {
            balance += amount;
        }
    }
}
