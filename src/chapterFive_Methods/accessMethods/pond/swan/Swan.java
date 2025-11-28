package chapterFive_Methods.accessMethods.pond.swan;

import chapterFive_Methods.accessMethods.pond.shore.Bird;

public class Swan extends Bird {
    public void swim(){
        floatInWater();
        System.out.println(text);
    }

    public  void helpOtherSwanSwim(){
        Swan swan = new Swan();
        swan.floatInWater();
        System.out.println(swan.text);
    }

    public void helpOtherBirdSwim(){
        Bird bird = new Bird();
        //bird.floatInWater();
        //System.out.println();(bird.text);
    }
}
