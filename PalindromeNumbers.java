
import java.util.Scanner;

public class PalindromeNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int num = 1; num < n; num++) {
            int temp = num;
            int rev = 0;

            while (temp > 0) {
                int digit = temp % 10;
                rev = rev * 10 + digit;
                temp = temp / 10;
            }

            if (num == rev) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}
