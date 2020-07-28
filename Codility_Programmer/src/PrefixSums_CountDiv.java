//Created by Rishabh Jain On 25/07/2020

public class PrefixSums_CountDiv 
{
	public int solution(int A, int B, int K)
	{
		return ((A + K -1) / K);
		
	}
	
	
	public static void main(String agrs[])
	{
	
		PrefixSums_CountDiv cd = new PrefixSums_CountDiv();
		
		int Result = cd.solution(6,11,2);
		
		System.out.println(Result);
		
	}
}
