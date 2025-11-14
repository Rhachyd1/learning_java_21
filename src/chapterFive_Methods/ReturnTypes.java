package chapterFive_Methods;

public class ReturnTypes {
    
    /*
     * Every method must return something, even if that something is nothing.
     * In this case, we're returning a string from the method's body.
     */
    public String returnHelloWorld(){
        return "Hello World";
    }

    /*
     * In this case, we're expecting an Integer object (wrapper), since it is an object, we can return a "null" reference.
     */
    public Integer returnNull(){
        return null;
    }

    /*
     * this is NOT a reference type, so it must return a literal primitive value, in this case, an int
     */
    public int returnZero(){
        return 0;
    }

    /*
     * If the method do not return anything, the return might be ommited. In both cases, we're returning nothing.
     * Important: null is something. so a void method that returns null will not compile
     */
    public void doNotReturn(){}
    public void doReturnSomething(){
        return;
    }

    /*
     * See? Toggle the comment, it doesnt compile.
     */
    /* public void thisDoesNotCompileAtAll(){
        return null;
    } */
}
