package Implementation;

import Abstraction.Zustand;
import Model.Politiker;

public class Aufsichtsrat implements Zustand {
    private Politiker politiker;

    public Aufsichtsrat(Politiker politiker) {
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
        this.politiker.setAktuellerZustand(new Ruhestand(this.politiker));
    }

    @Override
    public String toString() {
        return "Aufsichtsrat";
    }
}
