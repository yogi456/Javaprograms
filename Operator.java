public class Operator {
    //Unary Operators


public static void main(String[] args) {
    // byte b=10;   
    // b=b++;
    // byte c;
    // c=b++;
    // System.out.println(b);
    // b=b++;
    // System.out.println(b);
     byte d=10;
 d=(byte)(d+1);
 System.out.println(d);

   //b=b+1; 
   
   //System.out.println(0/0);
   // we can not directly divide an integer number by 0 we have to convert it to double 
   // as we don't have any way to represent Infinity in the Integral Arithmatic .. NAN :)

   System.out.println('a'>'A');
   // the reason being it will be converted to integer value that will be in the following way

char chh='a';
chh=chh+1;
   int a='a';
   System.out.println(a++);
   int A='A';
   System.out.println("Value of a"+a +"Value of A"+A);
   char ch=97;
   ch++;
   System.out.println("Now it should be 98:) .. "+ch);
   // it will not be 98 it will be b.




    // System.out.println("Value of B after increment"+b);
    //     int x=10;
    //     System.out.println("OG value of X is "+x);
    //     int y;
    //     byte o =(byte)130;
    //     //Jaaadu ..... it will be -126 :) we are assigning 130 and it is getting -126
    //     System.out.println("Value of O after assigning 130 is: "+o);
    
    //     y=x++; //POST Increment
    //     System.out.println("Value of Y "+y);
    //     y= ++y; //PRE-INCREMENT
    //     System.out.println("Value of Y after Preincrement "+y);
    //    System.out.println("Value of X after Post Increment "+x); // As we have assigned the Value to y and it got changed but if we will not assign then it won't get changed.

    //    System.out.println('a'=='b');
}

}
