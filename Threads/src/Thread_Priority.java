//Created by Rishabh Jain On 25/07/2020.

public class Thread_Priority extends Thread 
{
	public void run()
	{
		System.out.println("running thread name is:"+Thread.currentThread().getName());  
		System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
	}

	public static void main(String agrs[])
	{
		Thread_Priority tp1 = new Thread_Priority(), tp2 = new Thread_Priority();
		
		tp1.setPriority(Thread.MIN_PRIORITY);  
		tp2.setPriority(Thread.MAX_PRIORITY); 
		  
		tp1.start();
		tp2.start();
	}
}
