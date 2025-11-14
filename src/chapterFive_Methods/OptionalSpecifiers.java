package chapterFive_Methods;

public class OptionalSpecifiers {
    
    /*
     * Methods can have optional specifiers, you can have them as many as you can and in any order, but not all combinations are possible.
     */

     final void test(){}
     static void test1(){}
     static final void test2(){}
     final static void test3(){}
     
     /* 
      * this one is tricky, It can ONLY be used in an abstract class. there is no static abstract or final abstract, only abstract.
      */
     //abstract void test4();

     /*
      * this is used with multithreading
      */
     synchronized void test5(){}
     synchronized final void test6(){}
     synchronized static void test7(){}
     synchronized final static void test8(){}
     
}
