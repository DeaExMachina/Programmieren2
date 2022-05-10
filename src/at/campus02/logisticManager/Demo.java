package at.campus02.logisticManager;

public class Demo {
    public static void main(String[] args) {

        LogisticManager hansi = new LogisticManager();

        hansi.add(new Shirt("Hansibear", "L", "snow white"));
        hansi.add(new Car("Mercedes Puch G", "military green", 3000));

        hansi.moveAll("Schladming");

    }
}
