package Implementation;

import Abstraction.Zustand;

public class Protegiert implements Zustand {
    private PolitischAktiv politischAktiv;
    private Zustand unterzustand;

    public Protegiert(PolitischAktiv politischAktiv) {
        this.politischAktiv = politischAktiv;
        this.unterzustand = new Ergeben(this);
    }

    public PolitischAktiv getPolitischAktiv() {
        return politischAktiv;
    }

    public void setUnterzustand(Zustand unterzustand) {
        this.unterzustand = unterzustand;
    }

    @Override
    public void parteilob() {

    }

    @Override
    public void parteitadel() {

    }

    @Override
    public void wirtschaftskritik() {
        this.politischAktiv.setUnterZustandWirtschaft(new Neutral(this.politischAktiv));
    }

    @Override
    public void wirtschaftslob() {
        this.unterzustand.wirtschaftslob();
    }

    @Override
    public void erwischst() {
        this.politischAktiv.erwischst();
    }

    @Override
    public String toString() {
        return "Protegiert, " + this.unterzustand.toString();
    }
}
