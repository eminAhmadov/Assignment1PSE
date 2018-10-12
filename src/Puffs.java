public class Puffs extends Plant {

    Puffs(String name, int nutrients) {
        super(name, nutrients, plantType.PUFFS);
    }

    @Override
    public void gotAlfaRadiation() {
        nutrients += 2;
    }

    @Override
    public void gotDeltaRadiation() {
        nutrients -= 2;
    }

}
