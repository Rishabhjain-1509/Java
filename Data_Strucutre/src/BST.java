//Created by Rishabh Jain On 27/07/2020.

class Node1
{
	int data;
	Node1 left ;
	Node1 Right;
	
	Node1(int a)
	{
		data = a;
		left = null;
		Right = null;
	}
}

public class BST 
{
	static Node1 Root = null;
	
	static void Insert(int value)
	{
		Root = _Insert(Root,value);
	}
	
	public static Node1 _Insert (Node1 ptr , int idata)
	{
		if(ptr == null)
		{
			ptr = new Node1(idata);
			return ptr;
		}
		if(idata < ptr.data)
		{
			ptr.left = _Insert(ptr.left,idata);
		}
			
		else if(idata > ptr.data)
		{
				ptr.Right = _Insert(ptr.Right,idata);
		}
		
		return ptr;
	}
	
	public static void show(Node1 ptr)
	{
		if(ptr == null)
		{
			return;
		}
		System.out.println(ptr.data);
		show(ptr.left);
		show(ptr.Right);
	}
	
	public static void main(String agrs[])
	{
		Insert(5);
		Insert(6);
		Insert(8);
		
		show(BST.Root);
	}
}
