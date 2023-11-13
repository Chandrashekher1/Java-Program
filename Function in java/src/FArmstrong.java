import java.sql.SQLOutput;
import java.util.*;
public class FArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double sum = 0;    //General Method
        while(a>0){
            double rem = a%10;
            a = a/10;
            double cube = rem*rem*rem;
            sum = sum +cube;
        }
        System.out.println(sum);
    }
}
