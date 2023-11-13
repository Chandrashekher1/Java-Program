import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.next();
        PrintMyName(name);
    }
    static void PrintMyName(String name){ // Function name
        System.out.println(name);
        return;
    }

}

// Shadowing in Java

public class Basic {
    static int x =90; // Global Scope (it means you can use this x in anywhere(outside)  the function)
   public static void main(String[] args) {
       System.out.println(x);
       int x = 40;  // local Scope (It means you can use this x inside the function)
       System.out.println(x); // Scope will begin when value is initialised
       fun();
   }
   static void fun(){
       System.out.println(x);
   }
}

// Variable Arguments(varargs)

import java.util.*;  // * is used for all library in java
    public static void main(String[] args) {
        fun("Bhupendra Jogi");
public class Basic{

    }
    static void fun(String...v){
        System.out.println(Arrays.toString(v));
    }
}

// Method overloading

public class Basic {
    public static void main(String[] args) {

        sum(8,45);

    }

    static void sum(int e, int b){
        return e+b;

    }
    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
        }
}

