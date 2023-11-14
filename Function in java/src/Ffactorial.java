// Find factorial of a number

import java.util.Scanner;
public class Ffactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // General method using while loop
//        int fact= 1;
//        System.out.println("Enter number : ");
//        int num1 = sc.nextInt();
//        while(num1!=1){
//            fact= fact*num1;
//            num1--;
//        }
//        System.out.println(fact);

        // Function method
        fact1();
    }
    static void fact1(){
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num1 = sc.nextInt();
        if(num1<0){               // for invalid case
            System.out.println("Invalid number");
            return;
        }
        while(num1!=1){             // for repeatation
            fact = fact*num1;
            num1--;

        }
        System.out.println(fact);

    }

}
