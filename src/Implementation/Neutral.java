package Implementation;

import Abstraction.Zustand;

public class Neutral implements Zustand {
    private Politiker politiker;

    public Neutral(Politiker politiker) {
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
