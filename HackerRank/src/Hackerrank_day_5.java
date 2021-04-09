import java.util.Scanner;

public class Hackerrank_day_5 {

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int i = 0;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        for ( i = 1; i < 11 ; i++)
        {
            System.out.println(n + " x " + i + " = " + n*i);
        }

        scanner.close();
    }
}
