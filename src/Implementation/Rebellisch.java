package Implementation;

import Abstraction.Zustand;

public class Rebellisch implements Zustand {
    private PolitischAktiv politischAktiv;

    public Rebellisch(PolitischAktiv politischAktiv) {
        this.politischAktiv = politischAktiv;
    }

    @Override
    public void parteilob() {
        politischAktiv.setUnterZustandPartei(new Loyal(this.politischAktiv));
    }

    @Override
    public void parteitadel() {

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

    @Override
    public String toString() {
        return "Rebellisch";
    }
}
