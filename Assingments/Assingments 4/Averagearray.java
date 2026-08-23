import java.util.Scanner;

class Averagearray {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];

        System.out.println("Enter 5 integers");

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        int sum = 0;

        for (int x : a) {
            sum = sum + x;
        }

        float average = (float) sum / 5;

        System.out.println("The average of the numbers is " + average);
    }
}