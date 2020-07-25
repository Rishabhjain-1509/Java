//Created by Rishabh Jain On 25/07/2020.

class Node
{
	int data;
	Node next;
}

public class Linked_List 
{
	Node head;
	
	public void insert_at_end(int d)
	{
		Node node = new Node();
		node.data = d;
		node.next = null;
				
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
		}	
	}
	
	public void insert_at_begin(int d)
	{
		Node node = new Node();
		
		node.data = d;
		node.next = head;
		head = node;
	}
	
	public void insert_at_anyp(int d,int p)
	{
		Node node = new Node();
		
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
			node.data = d;
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
	
	public static void main(String agrs[])
	{
		Linked_List ll = new Linked_List();
		
		ll.insert_at_end(5);
		ll.insert_at_begin(6);
		ll.insert_at_end(4);
		ll.insert_at_end(3);
		ll.insert_at_end(6);
		ll.insert_at_anyp(9, 0);
		
		
		ll.show();
		
		
	}
}
