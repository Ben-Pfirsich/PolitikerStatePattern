package Implementation;

import Abstraction.Zustand;

public class Loyal implements Zustand {
    private PolitschAktiv politschAktiv;

    public Loyal(PolitschAktiv politschAktiv) {
        this.politschAktiv = politschAktiv;
    }

    @Override
    public void parteilob() {
        politschAktiv.setUnterZustandPartei(new Kriechend(this.politschAktiv));
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

    }
}
