package Implementation;

import Abstraction.Zustand;

public class Ergeben implements Zustand {
    private Politiker politiker;

    public Ergeben(Politiker politiker) {
        this.politiker = politiker;
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
