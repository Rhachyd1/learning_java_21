package chapterTwo_Operators;

public class NumericPromotion {
    
    /*
        Remember
        Long>Integer>Char>Short>Byte
        Char doesnt have any negative value, Short does; 
        Short is, I believe, -12500 to 12499;
        Char is, I Believe 35000;
        Double>Float.
    */
    public static void main(String[] args){
        System.out.println("Rules:");
        System.out.println("If two values have different data types, Java will automatically promote one of the values to the larger of the two data types");

        long  a = 0;
        int   b = 1;
        short c = 2;

        var e = a+b+c;
        System.out.println(e);//3 LONG
        System.out.println("------------------------------------");

        System.out.println("If one of the values is integral and the other is floating-point, Java will automatically promote the integral value to the floating-point value's data-type");

        int anInteger = 2;
        double anDouble = 1.0;
        double finalDoubleResult = anInteger/anDouble;
        System.out.println(finalDoubleResult);
        System.out.println("------------------------------------");

        System.out.println("Smaller data types (byte, short and char) are first promoted to int any time theyre used with any binary arithmetics; Even if neither is an integer");
        short aShort = 3;
        char aChar = 'A';
        int finalIntegerResult = aShort + aChar;
        System.out.println(finalIntegerResult); // 68;
        System.out.println((char) finalIntegerResult); // D; In this example, Im "forcing" to become a char again.
        System.out.println("------------------------------------");

        System.out.println("After all promotions, the resulting value will have the same dataType as its Promoted Operands");
        double anotherFinalDouble = a+b+c+aShort+aChar;
        System.out.println(anotherFinalDouble); // all shorts and chars promoted to int, all ints promoted to long, evaluated and casted to double.
    }

}
