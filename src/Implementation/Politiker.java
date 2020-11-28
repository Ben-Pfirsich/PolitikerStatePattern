package Implementation;

import Abstraction.Zustand;

public class Politiker {
    private Zustand aktuellerZustand;

    public Politiker() {
        setAktuellerZustand(new PolitschAktiv(this));
    }

    public Zustand getAktuellerZustand() {
        return aktuellerZustand;
    }

    public void setAktuellerZustand(Zustand aktuellerZustand) {
        this.aktuellerZustand = aktuellerZustand;
    }

}
