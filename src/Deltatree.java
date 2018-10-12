public class Deltatree extends Plant {

    Deltatree(String name, int nutrients) {
        super(name, nutrients, plantType.DELTATREE);
    }

    @Override
    public void gotAlfaRadiation() {
        nutrients -= 3;
    }

    @Override
    public void gotDeltaRadiation() {
        nutrients += 4;
    }
}
