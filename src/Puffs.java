public class Puffs extends Plant {

    Puffs(String name, int nutrients) {
        super(name, nutrients);
    }

    @Override
    public void gotAlfaRadiation() {
        nutrients += 2;
    }

    @Override
    public void gotDeltaRadiation() {
        nutrients -= 2;
    }

    @Override
    public void produceRadiation(Radiation radiation) {
        if (getNutrients() > 0)
            radiation.addAlfa(10 - getNutrients());
    }

}
