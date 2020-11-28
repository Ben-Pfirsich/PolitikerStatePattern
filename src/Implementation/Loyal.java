package Implementation;

import Abstraction.Zustand;

public class Loyal implements Zustand {
    private PolitischAktiv politischAktiv;

    public Loyal(PolitischAktiv politischAktiv) {
        this.politischAktiv = politischAktiv;
    }

    @Override
    public void parteilob() {
        politischAktiv.setUnterZustandPartei(new Kriechend(this.politischAktiv));
    }

    @Override
    public void parteitadel() {
        politischAktiv.setUnterZustandPartei(new Rebellisch(this.politischAktiv));
    }

    @Override
    public void wirtschaftskritik() {

    }

    @Override
    public void wirtschaftslob() {

    }

    @Override
    public void erwischst() {
        this.politischAktiv.erwischst();
    }
}
