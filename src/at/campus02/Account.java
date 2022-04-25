package at.campus02;

import java.util.HashMap;
import java.util.Objects;

public class Account {

    private String owner;
    private String iban;
    private String bic;
    private double balance;
    private int accountID;
    private static int uniqueID = 1;

    public Account (String owner, String iban, String bic) {
        this.owner = owner;
        this.iban = iban;
        this.bic = bic;
        balance = 0.0;
        accountID = uniqueID++;
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

    @Override
    public String toString() {
        return "Account{" +
                "owner='" + owner + '\'' +
                ", iban='" + iban + '\'' +
                ", bic='" + bic + '\'' +
                ", balance=" + balance +
                ", accountID=" + accountID +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accountID == account.accountID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountID);
    }

    //wir möchten auf die Accounts +ber den Namen der Besitzerinnen zugreifen
    //mapping von Dagobert Duck --> Account(...)
    //Dagobert Duck ist ein Beispiel für ein Schlüsselelement --> String
    //Account(...) ist ein Beispiel für einen Wert --> Account()
    //Achtung: wenn wir das so machen, kann jede Person max. einen Account haben!
    public static void main(String[] args) {

        HashMap<String, Account> bank = new HashMap<>();

        Account a1 = new Account("Mein", "AT2584681", "54841325");
        Account a2 = new Account("Ich", "ATmhuhbuhd25", "545452");
        Account a3 = new Account("Dei Mama", "AT44878", "1764632");

        bank.put("Dagobert", a1);
        bank.put("Daisy", a2);
        bank.put("Donald", a3);

        //gibt es einen Wert hinter dem Schlüssel Dagobert?
        System.out.println(bank.containsKey("Dagobert"));

        //möchten den Wert des Schlüssels Daisy erhalten:
        System.out.println(bank.get("Daisy"));

        //einmal drüberiterieren --> Achtung: etwas anders!
        for(String owner : bank.keySet()) {
            System.out.println(owner);
            System.out.println(bank.get(owner));
        }
    }
}
