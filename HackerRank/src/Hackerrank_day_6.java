import java.util.*;

public class Hackerrank_day_6 {

	public static void main ( String[] agrs)
	{
		Scanner scan = new Scanner( System.in );
		int TestCase = scan.nextInt();
		
		for( int i=0 ; i<TestCase ; i++)
		{
			String InputS = scan.next();
			char[] ch = InputS.toCharArray();
			String EvenS="" , OddS="";
			
			
			for( int j=0 ; j < ch.length ; j++ )
			{
				if( j%2 == 0)
				{
					EvenS = EvenS + ch[j];
				}
				else
				{
					OddS = OddS + ch[j];
				}
			}
			
			System.out.println(EvenS+" "+OddS);
		}
		
		scan.close();
	}
}
