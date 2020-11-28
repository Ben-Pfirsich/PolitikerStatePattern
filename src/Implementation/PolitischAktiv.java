package Implementation;

import Abstraction.Zustand;
import Model.Politiker;

public class PolitischAktiv implements Zustand {
    private Politiker politiker;
    private Zustand unterZustandPartei;
    private Zustand unterZustandWirtschaft;

    public PolitischAktiv(Politiker politiker) {
        this.politiker = politiker;
        setUnterZustandPartei(new Loyal(this));
        setUnterZustandWirtschaft(new Protegiert(this));
    }

    public Politiker getPolitiker() {
        return politiker;
    }

    public Zustand getUnterZustandPartei() {
        return unterZustandPartei;
    }

    public void setUnterZustandPartei(Zustand unterZustandPartei) {
        this.unterZustandPartei = unterZustandPartei;
    }

    public Zustand getUnterZustandWirtschaft() {
        return unterZustandWirtschaft;
    }

    public void setUnterZustandWirtschaft(Zustand unterZustandWirtschaft) {
        this.unterZustandWirtschaft = unterZustandWirtschaft;
    }

    @Override
    public void parteilob() {
        unterZustandPartei.parteilob();
    }

    @Override
    public void parteitadel() {
        unterZustandPartei.parteitadel();
    }

    @Override
    public void wirtschaftskritik() {
        unterZustandWirtschaft.wirtschaftskritik();
    }

    @Override
    public void wirtschaftslob() {
        unterZustandWirtschaft.wirtschaftslob();
    }

    @Override
    public void erwischst() {
        this.politiker.setAktuellerZustand(new Ruhestand(this.politiker));
    }

    @Override
    public String toString() {
        return "Politisch Aktiv, " + this.unterZustandPartei.toString()+ ", " + this.unterZustandWirtschaft.toString();
    }
}
