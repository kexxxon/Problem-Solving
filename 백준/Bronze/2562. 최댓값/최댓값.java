import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt(),
                     sc.nextInt(), sc.nextInt(), sc.nextInt(),
                     sc.nextInt(), sc.nextInt(), sc.nextInt()};
        sc.close();

        int count = 0, max = 0, index = 0;

        for(int value : arr) {
            count++;

            if(value > max) {
                max = value;
                index = count;
            }
        }
        System.out.print(max + "\n" + index);
    }
}