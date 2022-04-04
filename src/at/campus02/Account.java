package at.campus02;

public class Account {

    private String owner;
    private String iban;
    private String bic;
    private double balance;
    private int accountID;
    private static int uniqueID;

    public int getAccountID() {
        return accountID;
    }

    public Account (String owner, String iban, String bic) {
        this.owner = owner;
        this.iban = iban;
        this.bic = bic;
        balance = 0.0;
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
