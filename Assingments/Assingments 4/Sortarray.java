import java.util.Scanner;
import java.util.Arrays;

class Sortarray {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];

          System.out.println("Enter 5 integers");

        for (int i = 0; i < 5; i++) {
          a[i] = sc.nextInt();
        }

          Arrays.sort(a);
 
        System.out.println("The array in ascending order is");

        for (int x : a) {
           System.out.println(x);
   }
 }
}