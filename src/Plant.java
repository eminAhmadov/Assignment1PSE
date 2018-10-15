public abstract class Plant {

    protected String name;
    protected int nutrients;
    private boolean living = true;

    Plant(String name, int nutrients){
        this.name = name;
        this.nutrients = nutrients;
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
        this.nutrients = nutrients;
    }

    public boolean isLiving() {
        return living;
    }

    public void setLiving(boolean living) {
        this.living = living;
    }

    public abstract void gotAlfaRadiation();

    public abstract void gotDeltaRadiation();

    public void gotNoRadiation(){
        nutrients -= 1;
    }

    public abstract void produceRadiation(Radiation radiation);
}
