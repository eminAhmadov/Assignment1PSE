enum radiationType {
    ALFA, DELTA, NONE;
}

public class Radiation {

    private radiationType radiationType;
    private int needAlfa = 0;
    private int needDelta = 0;

    public radiationType getRadiationType() {
        return radiationType;
    }

    public void setRadiationType(radiationType radiationType) {
        this.radiationType = radiationType;
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
