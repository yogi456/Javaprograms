class Test{
public static void sum(int... x)
{
int total =0;
for(int x1:x)
{
total = total +x1;
}
System.out.println(total);
}
// when we declare var-arg and general method then General method will run first
// we can't declare same type of method for ex- int ...x and int[]x will be same
// public static void sum(int x)
// {
// System.out.println("General method" +x);
// }
public static void sum(int[] x)
{
    System.out.println(x);
}

// we can't declare the Vararge method as following
// var arg method should be the last argument of the declaration otherwise code will give error

// public static void sum2(int ...z,int u)
// {
//     System.out.println("Hello");
// }
public static void sum1(int x,int...y)
{
    int total=0;
for(int x1:y)
{
total = total +x1;
}
total = total +x;
System.out.println("This is valid" + total);
}
public static void main(String[] args)
{
sum(10);
sum(10,20,30);
sum1(100,10,20,30);
//sum2(100);
}


}

