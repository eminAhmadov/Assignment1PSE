package test;

import source.Deltatree;
import source.Parabush;
import source.Puffs;


public class WhiteBoxTest {
    public static void main(String args[]){
        System.out.println("White box testing:");
        System.out.println("Set number of plants to 4");
        int plantNum = 4;
        System.out.println("Create new plant of type Puffs with name Piggy and nutrients 7");
        Puffs plant1 = new Puffs("Piggy", 7);
        System.out.println("Create new plant of type Deltatee with name Slender and nutrients 5");
        Deltatree plant2 = new Deltatree("Slender", 5);
        System.out.println("Create new plant of type Parabush with name Dumpy and nutrients 4");
        Parabush plant3 = new Parabush("Dumpy", 4);
        System.out.println("Create new plant of type Deltatree with name Willowy and nutrients 3");
        Deltatree plant4 = new Deltatree("Willowy", 3);
        System.out.println("Set number of days to 10");
        int dayNum = 10;





    }
}
