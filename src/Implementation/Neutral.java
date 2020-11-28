package Implementation;

import Abstraction.Zustand;

public class Neutral implements Zustand {
    private PolitischAktiv politischAktiv;

    public Neutral(PolitischAktiv politischAktiv) {
        this.politischAktiv = politischAktiv;
    }

    @Override
    public void parteilob() {

    }

    @Override
    public void parteitadel() {

    }

    @Override
    public void wirtschaftskritik() {

    }

    @Override
    public void wirtschaftslob() {
        Protegiert protegiert = new Protegiert(this.politischAktiv);
        protegiert.setUnterzustand(new Rehabilitiert(protegiert));
        this.politischAktiv.setUnterZustandWirtschaft(protegiert);
    }

    @Override
    public void erwischst() {
        this.politischAktiv.erwischst();
    }
}
