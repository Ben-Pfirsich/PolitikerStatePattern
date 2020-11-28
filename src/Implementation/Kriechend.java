package Implementation;

import Abstraction.Zustand;

public class Kriechend implements Zustand {
    private PolitischAktiv politischAktiv;

    public Kriechend(PolitischAktiv politischAktiv){
        this.politischAktiv = politischAktiv;
    }

    @Override
    public void parteilob() {
        this.politischAktiv.wirtschaftskritik();
    }

    @Override
    public void parteitadel() {
        this.politischAktiv.setUnterZustandPartei(new Rebellisch(this.politischAktiv));
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
        return "Kriechend";
    }
}
