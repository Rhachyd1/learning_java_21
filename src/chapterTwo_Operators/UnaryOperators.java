package chapterTwo_Operators;

public class UnaryOperators {

    public static void main(String[] args){
        System.out.println("! inverst booleans");
        System.out.println("~ inverts all bits in a number (0 becomes 1 and 1 becomes zero); It can only be applied to numeric types");
        System.out.println("+ indicate a positive number");
        System.out.println("- indicate a negative number");
        System.out.println("++ increment");
        System.out.println("-- decrement");
        System.out.println("About increments, if before the variable, increments before and then evaluates. if after, evaluates and then increment");
        System.out.println("for instance, int a = 1; ++a = 2; int b =1; b++ = 1");
        int a = 1;
        int b = 1;
        System.out.println(++a);
        System.out.println(b++);

        //Examples

        System.out.println("--------------------Boolean Examples-----------------------");
        boolean imTrueOrFalse = false;
        System.out.println(imTrueOrFalse);
        System.out.println(!imTrueOrFalse);

        System.out.println("-------------Bitwise Examples-------------");
        int bitWiseTest = 1;
        System.out.println(bitWiseTest);
        System.out.println(~bitWiseTest); //-2
        int reverseBitWise = -1;
        System.out.println(reverseBitWise);
        System.out.println(~reverseBitWise);//0
        int finalBitWiseTest = 2;
        finalBitWiseTest = ~finalBitWiseTest;
        System.out.println(finalBitWiseTest);//-3
        finalBitWiseTest = ~finalBitWiseTest;
        System.out.println(finalBitWiseTest);//2
    }
    
}
