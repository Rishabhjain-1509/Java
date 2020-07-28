
import java.util.*;

public class BinaryGap 
{
	public static void main(String agr[])
	{
		
		int N = 1041, count = 0;
		
	    String A = Integer.toBinaryString(N);
	    
	    char[] ch = A.toCharArray();
	    
	    System.out.println(ch);
	    
	    ArrayList<Integer> ar = new ArrayList<Integer>();
	   
	    
	    for(int i=0 ; i< ch.length; i++)
	    {
	    	aa:
	        if( ch[i] == '1')
	        {
	            for(int j = i+1 ; j< ch.length ; j++)
	            {
	                if( ch[j] == '0')
	                {
	                	count++;
	                }
	                else if(ch[j] == '1')
	                {
	                    i = j-1;
	                    ar.add(count);
	                    count = 0;
	                    break aa;
	                }
	                System.out.println("Rishabh Jain");
	            }
	        }
	        
	        System.out.println("Jain");
		}
	    
	    
	    int max = 0 ;
	    for (int a : ar)
	    {
	    	if(max < a)
	    	{
	    		int temp;
	    		temp = a;
	    		a = max;
	    		max = temp;
	    	}
	    		
	    }
	    System.out.println(max);
	}
}
