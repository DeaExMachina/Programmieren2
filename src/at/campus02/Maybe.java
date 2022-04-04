package at.campus02;

public class Maybe<T> {
    //T = Platzhalter für einen konkreten Typ, wenn das Objekt erzeugt wird

    private T data;
    private int status;

    public Maybe(T data, int status) {
        this.data = data;
        this.status = status;
    }

    //generische Version der Klasse - der Typ T wird dann ersetzt durch konkreten Typ (nach Erzeugung einer Instanz)
   public void print() {
        switch (status) {
            case 1:
                System.out.println("Zugriff gewährt. " + data);
                break;
            case 2:
                System.out.println("Geht dich nix an!");
                break;
            case 3:
                System.out.println("Daten nicht erfasst.");
                break;
            default:
                System.out.println("Bitte Status zwischen 1 und 3 wählen!");
                break;
        }
   }
}
