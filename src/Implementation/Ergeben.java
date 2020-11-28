package Implementation;

import Abstraction.Zustand;

public class Ergeben implements Zustand {
    private Protegiert protegiert;

    public Ergeben(Protegiert protegiert) {
        this.protegiert = protegiert;
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
        this.protegiert.setUnterzustand(new Hoerig(this.protegiert));
    }

    @Override
    public void erwischst() {
        this.protegiert.erwischst();
    }
}
