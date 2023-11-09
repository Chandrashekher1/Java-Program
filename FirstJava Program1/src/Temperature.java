import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter temp in C :");
        float temp = sc.nextFloat();
        float tempf = (temp* 9/5) + 32;

        System.out.println("Temperature in Fahrenheit is :"+ tempf);


    }
}
