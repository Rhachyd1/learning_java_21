package chapterFive_Methods.accessMethods.pond.goose;

import chapterFive_Methods.accessMethods.pond.shore.Bird;

public class Gosling extends Bird {
    public void swim(){
        floatInWater();
        System.out.println(text);
    }

    public static void main (String...args){
        new Gosling().swim();
    }
}
