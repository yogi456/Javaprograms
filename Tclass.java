public class Tclass {

    //At run time JVM always suggest for main method with the following prototypes
    // Public - so that JVM can call it from anywhere
    // static - withoud existing object also JVM has to call this method
    // void -- Main method wo'nt return anything to JVM
    // Main -- this is the configuration inside JVM we can't change it but if we want then redesign the JVM
    // String[] args -- Command Line Arguments
   static public void main(String[] args) {
   // final synchronized strictfp public static void main(String[] yogi){
    
    System.out.println("Hello main");
    
   } 
   public static void main(int[] args)
   {
    System.out.println("HELLO");
   }

   // The above syntax is very strict and if we perform any change then we will get runtime exception
// saying noSuchMethodError : main
// or Main method not found in class please define it as -- PSVM(String[] args)

/*
 *Some changes are Possible 
 * like Static Public instead of Public Statuc
 * We can use Var-arg method --> String... args
 * String []args
 * String arg[]
 * String Yogesh[]
 * Main Method can be declared as Final Synchronized Stringfp
 */
}

class c extends Tclass
{
public static void main(String[] args) {
    System.out.println("child main");
}
}