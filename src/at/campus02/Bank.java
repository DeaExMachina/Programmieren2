package at.campus02;

public class Bank {
    public static void main(String[] args) {
        Account hansi = new Account("Hansi", "AT0115678458", "RZFHSDAF11");
        Account susi = new Account("Susi", "AT012854848532", "RZFNFIAZSB55");
        Account peter = new Account("Peter", "AT01687848735", "RZFJGNTBSU69");

        System.out.println(hansi.add(500));

        System.out.println(susi.add(90));
        System.out.println(susi.deposit(100));

        System.out.println(peter.add(2));

        Account [] accounts = new Account[] {hansi, susi, peter};

        for (int x = 0; x < accounts.length; x++) {
            System.out.println(accounts[x].getBalance());
        }

    }
}
