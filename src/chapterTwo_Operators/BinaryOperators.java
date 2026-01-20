package chapterTwo_Operators;

public class BinaryOperators {
    
    public static void main(String[] args){
        System.out.println("Simple sum example");
        int a = 2 +3;
        System.out.println(a);
        
        System.out.println("Simple subtratcion example");
        int b = 3-2;
        System.out.println(b);
        
        System.out.println("Simple multiplicative example");
        int c = 2*3;
        System.out.println(c);
        
        System.out.println("Simple division example");
        int d = 3 /2;
        double d1 = 3/2;
        double d2 = 3.0/2.0; //1.5
        System.out.println(d);
        System.out.println(d1); //1.0 since its an integer value inserted on a double variable
        System.out.println(d2); //Now its all double

        System.out.println("Simple remainder example (modulus)");
        int e = 3%2;
        System.out.println(e);
    }
}
