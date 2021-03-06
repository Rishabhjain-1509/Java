//Created by Rishabh Jain On 25/07/2020.

public class Thread_Sleep extends Thread
{
	public void run()
	{
		for ( int i=0 ; i<5 ; i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			
			System.out.println(i);
			System.out.println(Thread.currentThread().getName());
		}
	}
	
	
	public static void main(String agrs[])
	{
		Thread_Sleep ts1 = new Thread_Sleep(), ts2 = new Thread_Sleep();
		
		 System.out.println("Name of t1:"+ts1.getName());  
		 System.out.println("Name of t2:"+ts2.getName());  
		 System.out.println("id of t1:"+ts1.getId());  
		 System.out.println("id of t1:"+ts2.getId()); 
		
		ts1.start();
		
		try
		{	//Join method use to Die the thread ts1
			ts1.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		ts2.start();
		
	}

}
