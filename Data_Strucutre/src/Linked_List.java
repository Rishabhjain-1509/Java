//Created by Rishabh Jain On 25/07/2020.

class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		
	}
}

public class Linked_List extends Node
{
	Node head;
	
	public void insert_at_end(int d)
	{
		Node node = new Node(d);
				
		if(head == null )
		{
			head = node;
		}
		else
		{
			Node n = head;
			
			while(n.next != null)
			{
				n = n.next;
			}
			
			n.next = node;
			node.next = null;
		}	
	}
	
	public void insert_at_begin(int d)
	{
		Node node = new Node(d);
		
		
		node.next = head;
		head = node;
	}
	
	public void insert_at_anyp(int d,int p)
	{
		Node node = new Node(d);
		
		if( p == 0)
		{
			insert_at_begin(d);
		}
		else
		{
			int count = 0;
			Node n = head;
			
			while(count < p-1)
			{
				n = n.next;
				count++;
			}
			
			node.next = n.next;
			n.next = node;
		}
	}
	
	public void show()
	{
		Node node=head;
	    
	    while(node.next!=null)
	    {
	      System.out.print(node.data);
	      node=node.next;
	    }
	    
	    System.out.println(node.data);
	}
	
	public void delete(int p)
	{
		Node n = head;
		
		if(p == 0)
		{
			head = head.next;
		}
		else
		{
			Node r = null;
		     
			for(int i=0;i<p-1;i++)
		    {
		        n=n.next;
		    }
				
			r = n.next;
			n.next = r.next;
		}
	}
	
	public static void main(String agrs[])
	{
		Linked_List ll = new Linked_List();
		
		ll.insert_at_end(5);
		ll.insert_at_begin(6);
		ll.insert_at_end(4);
		ll.insert_at_end(3);
		ll.insert_at_end(6);
		ll.insert_at_anyp(9, 1);
		ll.delete(0);
		
		
		ll.show();
		
		
	}
}
