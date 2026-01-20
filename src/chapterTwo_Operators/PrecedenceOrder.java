package chapterTwo_Operators;

public class PrecedenceOrder {
 
    public static void main(String[] args){
        //Java follows Mathematical precedence
        var firstResult = 2*2+3;
        var secondResult = 2*(2+3);
        //The first will result in 7
        //The second will result in 10

        System.out.println(firstResult);
        System.out.println(secondResult);
    }
}
