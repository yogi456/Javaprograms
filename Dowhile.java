public class Dowhile {
    public static void main(String[] args) {
        int x=0;
        do{
            x++;
            System.out.println(x);
            if(++x<5)
            continue;
        x++;
        System.out.println(x);
        }
    while(++x<10);
    }
}
// so here the conclusion is that the continue statement will not execute directly x++
// first it will go to While Loop and then it will execute the other code.