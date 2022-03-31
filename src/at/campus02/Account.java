package at.campus02;

public class Account {

    private String owner = null;
    private String iban = null;
    private String bic = null;
    private double balance = 0.0;

    public Account (String owner, String iban, String bic, double balance) {
        this.owner = owner;
        this.iban = iban;
        this.bic = bic;
        this.balance = 0.0;
    }

    public double add(double wert) {
        return balance = balance + wert;
    }

    public double deposit (double wert) {
        if (balance <= wert) {
            wert = wert - balance;
            balance = 0;
        }
        if (balance > wert) {
             balance = balance - wert;
        }
        return balance;
    }

    public double getBalance() {
        return balance;
    }

}
