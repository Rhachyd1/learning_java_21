package chapterFive_Methods.accessMethods.pond.goose;

import chapterFive_Methods.accessMethods.pond.shore.Bird;

public class Goose extends Bird {
    public void helpGooseSwim(){
        Goose other = new Goose();
        other.floatInWater();
        System.out.println(other.text);
    }
    public void helpOtherGooseSwim(){
        Bird other = new Goose();
        //other.floatInWater();
        //System.out.println(other.text);
    }
}
