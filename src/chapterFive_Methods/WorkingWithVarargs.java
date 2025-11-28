package chapterFive_Methods;

public class WorkingWithVarargs {
 
    public static void main(String[] args){

        final Integer[] anArrayOfInteger = {1,2,3,4,5,6,7,8,9,10};
        final Integer aSingleInteger = 0;

        thisWorks(anArrayOfInteger);
        thisAlsoWorks(aSingleInteger, anArrayOfInteger);

        //This DOESNT WORK
        //thisWorks({1,2,3,4,5,6,7,8,10});
        //But This works:
        thisWorks(1,2,3,4,5,6,7,8,9,10,11);
        thisAlsoWorks(0, 1,2,3,4,5,6,7,8,9,10,11,12);
    }

    /*Why doesnt compile? Simple: only ONE vararg is allowed and it must be the last parameter. */
    // public static void thisVarargMethodDoesNotCompile(Integer...arg1, Integer...arg2){}
    //public static void thisVarargMethodAlsoDoesNotCompile(Integer...arg1, Integer arg2){}

    public static void thisWorks(Integer ... arg1){
        System.out.println("This Works");
        for(Integer i : arg1){
            System.out.print(i+", ");
        }
    }
    public static void thisAlsoWorks(Integer arg1, Integer...arg2){
        System.out.println("This Also Works");
        System.out.println(arg1);
        for(Integer i : arg2){
            System.out.print(i+", ");
        }
    }
}
