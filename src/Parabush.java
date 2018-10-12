public class Parabush extends Plant {

    Parabush(String name, int nutrients) {
        super(name, nutrients, plantType.PARABUSH);
    }

    @Override
    public void gotAlfaRadiation() {
        nutrients += 1;
    }

    @Override
    public void gotDeltaRadiation() {
        nutrients += 1;
    }
}
