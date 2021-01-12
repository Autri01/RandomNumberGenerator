import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the max number upto which you want to generate random numbers");
        int n=scn.nextInt();
        Random r=new Random();
        System.out.println(String.valueOf(r.nextInt(n)));

    }
}
