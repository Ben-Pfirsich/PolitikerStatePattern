package Implementation;

import Abstraction.Zustand;

public class Rehabilitiert implements Zustand {
    private Protegiert protegiert;

    public Rehabilitiert(Protegiert protegiert) {
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
        this.protegiert.setUnterzustand(new Ergeben(this.protegiert));
    }

    @Override
    public void erwischst() {
        this.protegiert.erwischst();
    }
}
