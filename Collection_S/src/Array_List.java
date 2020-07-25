//Created By Rishabh Jain On 25/07/2020.

//Import java package to use in it.
import java.util.*;
import java.io.*;

public class Array_List 
{
	public static void main(String agrs[])
	{
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Rishabh");
		list.add("Jain");
		
		System.out.println(list);
		
		//Iterating ArrayList using Iterator
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//Iterating ArrayList using For-each loop
		for(String a : list)
		{
			System.out.println(a);
		}
		
		  Collections.sort(list); 
		  
		  System.out.println(list);
		  
		  try  
          {  
              //Serialization  
              FileOutputStream fos=new FileOutputStream("file.txt");  
              ObjectOutputStream oos=new ObjectOutputStream(fos);  
              oos.writeObject(list);  
              fos.close();  
              oos.close();  
              //Deserialization  
              FileInputStream fis=new FileInputStream("file");  
              ObjectInputStream ois=new ObjectInputStream(fis);  
            ArrayList  list2=(ArrayList)ois.readObject();  
            System.out.println(list2);    
          }catch(Exception e)  
          {  
              System.out.println(e);  
          }  
	}
	

}
