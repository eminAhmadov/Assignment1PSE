enum radiationType {
    ALFA, DELTA, NONE;
}

public class Radiation {

    private radiationType radiationType;
    private int radiation = 0;
    private int needRadiation = 0;
    private int needAlfa = 0;
    private int needDelta = 0;

    public radiationType getRadiationType() {
        return radiationType;
    }

    public void setRadiationType(radiationType radiationType) {
        this.radiationType = radiationType;
    }

    public int getRadiation() {
        return radiation;
    }

    public void setRadiation(int radiation) {
        this.radiation = radiation;
    }

    public int getNeedRadiation() {
        return needRadiation;
    }

    public void setNeedRadiation(int needRadiation) {
        this.needRadiation = needRadiation;
    }

    public int getNeedAlfa() {
        return needAlfa;
    }

    public void setNeedAlfa(int needAlfa) {
        this.needAlfa = needAlfa;
    }

    public int getNeedDelta() {
        return needDelta;
    }

    public void setNeedDelta(int needDelta) {
        this.needDelta = needDelta;
    }

    public void addAlfa(int i){
        needAlfa += i;
    }

    public void addDelta(int i){
        needDelta += i;
    }
}
