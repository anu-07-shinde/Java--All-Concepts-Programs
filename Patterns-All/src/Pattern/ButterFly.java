package Pattern;
import java.util.Scanner;

public class ButterFly {
    public static void main(String[] args) {
       
    	
    	int rows = 6;
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (rows - i); k++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= i; m++) {
                System.out.print("*");
            }
            System.out.println();
        }

        
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (rows - i); k++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= i; m++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
