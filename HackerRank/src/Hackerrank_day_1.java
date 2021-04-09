import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Hackerrank_day_1   {
	
	public static void main( String agrs[]) throws IOException
	{
		int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        
        int j = scan.nextInt();
        double k = scan.nextDouble();
        String s2 = reader.readLine();
        
        System.out.println(i+j);
        System.out.println(d+k);
        System.out.println(s+s2);
		
		scan.close();
	}

}
