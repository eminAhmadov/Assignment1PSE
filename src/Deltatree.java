public class Deltatree extends Plant {

    Deltatree(String name, int nutrients) {
        super(name, nutrients);
    }

    @Override
    public void gotAlfaRadiation() {
        nutrients -= 3;
    }

    @Override
    public void gotDeltaRadiation() {
        nutrients += 4;
    }

    @Override
    public void produceRadiation(Radiation radiation) {
        if (getNutrients() < 5 && getNutrients() > 0) {
            radiation.addDelta(4);
        } else if (getNutrients() >= 5 && getNutrients() <= 10) {
            radiation.addDelta(1);
        }
    }
}
