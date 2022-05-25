package at.campus02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountSorting {
    public static void main(String[] args) {


        Account a1 = new Account("Mein", "AT2584681", "54841325");
        Account a2 = new Account("Ich", "ATmhuhbuhd25", "545452");
        Account a3 = new Account("Dei Mama", "AT44878", "1764632");
        a1.add(1000);
        a2.add(400);
        a3.add(200);

        ArrayList<Account> allAccounts = new ArrayList<>();
        allAccounts.add(a1);
        allAccounts.add(a2);
        allAccounts.add(a3);

        Collections.sort(allAccounts);
//        Collections.sort(allAccounts); --> sollte eigentlich funktionieren...
//        System.out.println(allAccounts);

    }
}
