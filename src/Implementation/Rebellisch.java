package Implementation;

import Abstraction.Zustand;

public class Rebellisch implements Zustand {
    private PolitschAktiv politschAktiv;

    public Rebellisch(PolitschAktiv politschAktiv) {
        this.politschAktiv = politschAktiv;
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

    }

    @Override
    public void erwischst() {

    }
}
