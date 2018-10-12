import java.util.ArrayList;

public class PlanetMain {

    public static void main(String args[]){
        int plantNum;
        int dayNum;

        plantNum = 4;
        Puffs plant1 = new Puffs("Piggy", 7);
        Deltatree plant2 = new Deltatree("Slender", 5);
        Parabush plant3 = new Parabush("Dumpy", 4);
        Deltatree plant4 = new Deltatree("Willowy", 3);
        dayNum = 10;

        ArrayList<Plant> plantList = new ArrayList<Plant>();

        plantList.add(plant1);
        plantList.add(plant2);
        plantList.add(plant3);
        plantList.add(plant4);

        Radiation radiation = new Radiation();
        radiation.setRadiationType(radiationType.NONE);

        for(int i = 1; i<=dayNum; i++){
            System.out.println("Day " + i + ":");
            for(Plant plant : plantList){
                if(plant.isLiving() == true) {
                    if (radiation.getRadiationType() == radiationType.ALFA) {
                        switch (plant.getPlantType()) {
                            case PUFFS:
                                plant.gotAlfaRadiation();
                                radiation.addAlfa(10 - plant.getNutrients());
                                break;

                            case DELTATREE:
                                plant.gotAlfaRadiation();
                                if (plant.getNutrients() < 5) {
                                    radiation.addDelta(4);
                                } else if (plant.getNutrients() >= 5 && plant.getNutrients() <= 10) {
                                    radiation.addDelta(1);
                                }
                                break;

                            case PARABUSH:
                                plant.gotAlfaRadiation();
                                break;
                        }
                    } else if (radiation.getRadiationType() == radiationType.DELTA) {
                        switch (plant.getPlantType()) {
                            case PUFFS:
                                plant.gotDeltaRadiation();
                                radiation.addAlfa(10 - plant.getNutrients());
                                break;

                            case DELTATREE:
                                plant.gotDeltaRadiation();
                                if (plant.getNutrients() < 5) {
                                    radiation.addDelta(4);
                                } else if (plant.getNutrients() >= 5 && plant.getNutrients() <= 10) {
                                    radiation.addDelta(1);
                                }
                                break;

                            case PARABUSH:
                                plant.gotDeltaRadiation();
                                break;
                        }
                    } else if (radiation.getRadiationType() == radiationType.NONE) {
                        switch (plant.getPlantType()) {
                            case PUFFS:
                                plant.gotNoRadiation();
                                radiation.addAlfa(10 - plant.getNutrients());
                                break;

                            case DELTATREE:
                                plant.gotNoRadiation();
                                if (plant.getNutrients() < 5) {
                                    radiation.addDelta(4);
                                } else if (plant.getNutrients() >= 5 && plant.getNutrients() <= 10) {
                                    radiation.addDelta(1);
                                }
                                break;

                            case PARABUSH:
                                plant.gotNoRadiation();
                                break;
                        }
                    }

                }


                if(radiation.getNeedAlfa() - radiation.getNeedDelta() >= 3){
                    radiation.setRadiationType(radiationType.ALFA);
                }else if(radiation.getNeedDelta() - radiation.getNeedAlfa() >= 3){
                    radiation.setRadiationType(radiationType.DELTA);
                }else{
                    radiation.setRadiationType(radiationType.NONE);
                }

                System.out.println(plant.getName() + " " + plant.getNutrients());

                if(plant.getNutrients() < 10) {
                    plant.setLiving(false);
                    // plantList.remove(plant);
                }
            }

            System.out.println("Next radiation: " + radiation.getRadiationType());
        }
    }
}
