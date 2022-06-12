package OOP.arrays;


import OOP.animal.Cat;

import java.util.Random;

public class CatOwner {

    private Cat[] cats;

    public CatOwner() {
    }

    public void makeCats(int amount){
        cats = new Cat[amount];
        Random r = new Random();
        for(int i=0; i<amount; i++){
            cats[i] = new Cat("Fluffe "+ r.nextInt(7), r.nextInt(15));
        }
    }

    public String[] tellCatNames(){
        String[] catNames = new String[cats.length];
        for(int i=0; i<cats.length; i++){
            catNames[i] = cats[i].getName();
        }
        return catNames;
    }
}
