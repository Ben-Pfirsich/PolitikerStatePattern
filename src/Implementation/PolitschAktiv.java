package Implementation;

import Abstraction.Zustand;

public class PolitschAktiv implements Zustand {
    private Politiker politiker;
    private Zustand unterZustandPartei;
    private Zustand unterZustandWirtschaft;

    public PolitschAktiv(Politiker politiker) {
        this.politiker = politiker;
        setUnterZustandPartei(new Loyal(this));
        setUnterZustandWirtschaft(new Protegiert(this));
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
