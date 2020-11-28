package Implementation;

import Abstraction.Zustand;
import Model.Politiker;

public class Hoerig implements Zustand {
    private Protegiert protegiert;

    public Hoerig(Protegiert protegiert) {
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
        Politiker politiker = this.protegiert.getPolitischAktiv().getPolitiker();
        politiker.setAktuellerZustand(new Aufsichtsrat(politiker));
    }

    @Override
    public void erwischst() {
        this.protegiert.erwischst();
    }

    @Override
    public String toString() {
        return "Hoerig";
    }
}
