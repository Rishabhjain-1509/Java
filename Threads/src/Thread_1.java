//Created by Rishabh Jain 0n 25/07/2020.

public class Thread_1 extends Thread
{
	public void run()
	{
		System.out.println("Thread is running");
	}
	
	
	public static void main(String agrs[])
	{
		Thread_1 t1 = new  Thread_1();
		t1.run();
	}

}
