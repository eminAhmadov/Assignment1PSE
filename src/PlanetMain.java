import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PlanetMain {

    public static void main(String args[]) {
        String filename = "";

        int plantNum = 0;
        int dayNum = 0;

//        plantNum = 4;
//        Puffs plant1 = new Puffs("Piggy", 7);
//        Deltatree plant2 = new Deltatree("Slender", 5);
//        Parabush plant3 = new Parabush("Dumpy", 4);
//        Deltatree plant4 = new Deltatree("Willowy", 3);
//        dayNum = 10;

        ArrayList<Plant> plantList = new ArrayList<>(plantNum);

//        plantList.add(plant1);
//        plantList.add(plant2);
//        plantList.add(plant3);
//        plantList.add(plant4);

        Radiation radiation = new Radiation();
        radiation.setRadiationType(radiationType.NONE);

        //filename in read
        System.out.print("Please give the input file name: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            filename = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //read in
        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader(filename)));
            plantNum = sc.nextInt();
            for (int i = 0; i < plantNum; i++) {
                Plant plant;
                String name = sc.next();
                String type = sc.next();
                int nutrients = sc.nextInt();
                switch (type) {
                    case "p":
                        plant = new Puffs(name, nutrients);
                        break;
                    case "d":
                        plant = new Deltatree(name, nutrients);
                        break;
                    case "b":
                        plant = new Parabush(name, nutrients);
                        break;
                    default:
                        throw new InvalidInputException();
                }
                plantList.add(plant);
            }
            dayNum = sc.nextInt();
        } catch (FileNotFoundException | InvalidInputException e) {
            e.printStackTrace();
        }

        for (int i = 1; i <= dayNum; i++) {
            //System.out.println("Day " + i + ":");
            radiation.setNeedAlfa(0);
            radiation.setNeedDelta(0);
            for (Plant plant : plantList) {
                if (plant.isLiving()) {
                    if (radiation.getRadiationType() == radiationType.ALFA) {
                        plant.gotAlfaRadiation();
                        plant.produceRadiation(radiation);
                    } else if (radiation.getRadiationType() == radiationType.DELTA) {
                        plant.gotDeltaRadiation();
                        plant.produceRadiation(radiation);
                    } else if (radiation.getRadiationType() == radiationType.NONE) {
                        plant.gotNoRadiation();
                        plant.produceRadiation(radiation);
                    }
                }

                //System.out.println(plant.getName() + " " + plant.getNutrients());

                if (plant.getNutrients() > 10 || plant.getNutrients() <= 0) {
                    plant.setLiving(false);
                    // plantList.remove(plant);
                }
            }

            if (radiation.getNeedAlfa() - radiation.getNeedDelta() >= 3) {
                radiation.setRadiationType(radiationType.ALFA);
            } else if (radiation.getNeedDelta() - radiation.getNeedAlfa() >= 3) {
                radiation.setRadiationType(radiationType.DELTA);
            } else {
                radiation.setRadiationType(radiationType.NONE);
            }

            //System.out.println("Next radiation: " + radiation.getRadiationType());
        }

        for (Plant plant : plantList) {
            if (plant.isLiving())
                System.out.println(plant.getName());
        }

    }

}
