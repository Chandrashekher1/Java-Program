// Multiplication of two number

import java.util.Scanner;
public class Fmul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter first number : ");
        int num1 = sc.nextInt();
        System.out.println("ENter second number :");
        int num2 = sc.nextInt();
        mul(num1 ,num2);

    }
    static void mul(int a, int b){
        int multi = a*b;
        System.out.println("Multiplication of two numbers is " +multi);

    }
}
