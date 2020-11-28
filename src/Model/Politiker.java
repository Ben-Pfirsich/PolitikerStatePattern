package Model;

import Abstraction.Zustand;
import Implementation.PolitischAktiv;

public class Politiker {
    private Zustand aktuellerZustand;

    public boolean aktiv(){
        return aktuellerZustand instanceof PolitischAktiv;
    }

    public void parteilob(){
        aktuellerZustand.parteilob();
    }

    public void parteitadel(){
        aktuellerZustand.parteitadel();
    }

    public void wirtschaftslob(){
        aktuellerZustand.wirtschaftslob();
    }

    public void wirtschaftskritik(){
        aktuellerZustand.wirtschaftskritik();
    }

    public void erwischt(){
        aktuellerZustand.erwischst();
    }

    public Politiker() {
        setAktuellerZustand(new PolitischAktiv(this));
    }

    public Zustand getAktuellerZustand() {
        return aktuellerZustand;
    }

    public void setAktuellerZustand(Zustand aktuellerZustand) {
        this.aktuellerZustand = aktuellerZustand;
    }

}
