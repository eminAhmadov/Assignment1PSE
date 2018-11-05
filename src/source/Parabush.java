package source;

public class Parabush extends Plant {

    public Parabush(String name, int nutrients) {
        super(name, nutrients);
    }

    @Override
    public void gotAlfaRadiation() {
        nutrients += 1;
    }

    @Override
    public void gotDeltaRadiation() {
        nutrients += 1;
    }

    @Override
    public void produceRadiation(Radiation radiation) {

    }
}
