import Model.Politiker;

import java.util.Scanner;

public class Steuerung {
    private Politiker politiker;

    public Steuerung() {
    }

    public static void main(String[] args) {
        new Steuerung().run();
    }

    public void run() {
        int eingabe = -1;
        politiker = new Politiker();
        while (politiker.aktiv()) {
            System.out.println("Welches nächste Ereignis?\n"
                    + " (0) Lob von der eigenen Partei\n"
                    + " (1) Tadel von der eigenen Partei\n"
                    + " (2) Lob von der Wirtschaft\n"
                    + " (3) Erwischt");
            eingabe = new Scanner(System.in).nextInt();
            switch (eingabe) {
                case 0 -> politiker.parteilob();
                case 1 -> politiker.parteitadel();
                case 2 -> politiker.wirtschaftslob();
                case 3 -> politiker.erwischt();
            }
            System.out.println(politiker.toString());
            //hier muss noch eine sinnvolle Ausgabe implementiert werden
        }

    }
}