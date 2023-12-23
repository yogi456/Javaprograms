public class Operators {
    public static void main(String[] args) {
        final int x=10;
    //   boolean b;
    //   b++; we can not apply Increment/Decrement operator to Boolean Data Type
    // Except boolean we can apply increment and Decrement operator to Int,Char and Double data types.
      char ch='a';
      ch++;

      byte b=10;
     b++;
      System.out.println(b);
      System.out.println( ch);
        //System.out.println(y);

        System.out.println('a'+'b'); // It will not show ab this will just convert them to integer and then add them

        System.out.println('a'+ 0.89);//  this will be 97.89
        System.out.println(10/0.0);

        System.out.println(0.0/0);
        System.out.println(x);
    }
}
