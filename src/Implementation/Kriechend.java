package Implementation;

import Abstraction.Zustand;

public class Kriechend implements Zustand {
    private PolitschAktiv politschAktiv;

    public Kriechend(PolitschAktiv politsch){
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
