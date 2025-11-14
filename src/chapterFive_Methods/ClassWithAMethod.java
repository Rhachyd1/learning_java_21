package chapterFive_Methods;

public class ClassWithAMethod {

    /*
     * This is a method Declaration.
     * The method name and its parameters are called Method Signatures
     * 
     * in order, from left to right
     * Access Modifier, optional modifier, Return type, method name, List of Parameters (Parenthesis required) and Exception
     */
    public final void takingANap(int minutes) throws Exception{
        /*
         * this is the method's body.
         */
    }

    /*
     * as the name says, this method can ONLY be called from within the same class, it must contains the PRIVATE modifier
     */
    private void thisMethodCanOnlyBeCalledFromWithinTheSameClass(){ this.thisMethodCanBeCalledFromAClassInTheSamePackage();}

    /*
     * this is a package access method, it can be called from a class within the same package (and within the same class, as you can see above)
     * it must contains NO MODIFIER AT ALL
     */
    void thisMethodCanBeCalledFromAClassInTheSamePackage(){ System.err.println("Hello World!"); }

    /*
     * This method can be called from within the same class, the classes within the same package and its subclasses
     * it must contains the PROTECTED modifier
     */
    protected void thisMethodCanBeCalledFromTheSamePackageOrSubclass(){}
    public static void main (String args[]){
        new ClassWithAMethod().thisMethodCanOnlyBeCalledFromWithinTheSameClass();
    }
}
