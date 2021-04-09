import java.util.*;

public class Hackerrank_day_7 {
	
		 private static final Scanner scanner = new Scanner(System.in);

		 public static void main(String[] args) {
		        int n = scanner.nextInt();
		        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		        String FinalOutput ="";

		        String[] arrItems = scanner.nextLine().split(" ");
		        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		        for (int i = 0; i < n; i++) {
		            
		            FinalOutput = FinalOutput + arrItems[n-i-1] + " ";

		        }
		        System.out.println(FinalOutput);
		        
		        
		        scanner.close();
		    }
	}


