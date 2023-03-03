package methods;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        twoInputParams(sc.nextInt(), sc.nextInt());
//        hasNotInputParams();
//        helloWorld(sc.hasNext());
//        thisInputParam('a');
//        returnOneOfThem(sc.nextFloat(), sc.nextFloat());
//        recursion();
    }


    // 1. Write a method which  .has two input parameters  type  int and return 0.

    public static int twoInputParams(int a, int b) {
        return 0;
    }

    // 2. Write a method which has not input parameters and returns nothing.

    public static void hasNotInputParams() {

    }


    // 3. Write a method which .has a boolean input parameters  and print “Hello World”.

    public static void helloWorld(boolean b) {
        System.out.println("Hello World");
    }


    // 4. Write a method which  .has a char input parameter  and return this  input parameter.

    public static char thisInputParam(char c) {
        return c;
    }

    // 5. Write a method which  .has  two float input parameters  and return  one of them.

    public static float returnOneOfThem(float a, float b) {
        return a;
    }

    // 6. Write a method which .has call itself inside body(recursion)

    public static void recursion() {
        recursion();
    }
}
