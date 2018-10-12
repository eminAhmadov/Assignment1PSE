enum plantType {
    PUFFS, DELTATREE, PARABUSH;
}
public abstract class Plant {

    protected String name;
    protected int nutrients;
    private boolean living = true;
    private plantType plantType;

    Plant(String name, int nutrients, plantType plantType){
        this.name = name;
        this.nutrients = nutrients;
        this.plantType = plantType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNutrients() {
        return nutrients;
    }

    public void setNutrients(int nutrients) {
        this.nutrients += nutrients;
    }

    public boolean isLiving() {
        return living;
    }

    public void setLiving(boolean living) {
        this.living = living;
    }

    public plantType getPlantType() {
        return plantType;
    }

    public void setPlantType(plantType plantType) {
        this.plantType = plantType;
    }

    public abstract void gotAlfaRadiation();

    public abstract void gotDeltaRadiation();

    public void gotNoRadiation(){
        nutrients -= 1;
    }
}
