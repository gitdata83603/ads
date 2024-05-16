package Q2;



public class List
{
	static class Node			
	{
		private int data;
		private Node next;
		private Node prev;
	
		
		public Node(int value)
		{
			data = value;
			next = null;
			prev = null;
		}
	}
	
	private Node head;
	private Node tail;//keeping address of last node
	
	public List()
	{
		head = null;
		tail = null;
	}
	
	public boolean isEmpty() 
	{
		return head == null && tail == null;
	}
	
	public void addFirst(int value)
	{
		//1. create newnode
		Node newnode = new Node(value);
		//2. if list is empty
		if(isEmpty())
			// add newnode into head and tail
			head = tail = newnode;
		//3. if list is not empty
		else 
		{
			//a. add first node into next of newnode
			newnode.next = head;
			//b. add newnode into prev of first node
			head.prev = newnode;
			//c. move head on newnode
			head = newnode;
		}
	}
	
	public void addLast(int value)
	{
		//1. create newnode
		Node newnode = new  Node(value);
		//2. if list is empty
		if(isEmpty())
			// add newnode into head and tail
			head = tail = newnode;
		//3. if list is not empty
		else
		{
			//a. add last node into prev of newnode
			newnode.prev = tail;
			//b. add newnode into next of last node
			tail.next = newnode;
			//c. move tail on newnode
			tail = newnode;
		}
	}
	
	
	
	public void deleteFirst() 
	{
		//1. if list is empty
		if(isEmpty())
			return;
		//2. if list has single node
		else if(head == tail)
			head = tail = null;
		//3. if list has multiple nodes
		else 
		{
			//a. add null into prev of second node
			head.next.prev = null;
			//c. move head on second node
			head = head.next;
		}
	}
	
	public void deleteLast()
	{
		//1. if list is empty
		if(isEmpty())
			return;
		//2. if list has single node
		else if(head == tail)
			head = tail = null;
		//3. if list has multiple nodes
		else 
		{
			//a. add null into next of second last node
			tail.prev.next = null;
			//c. move tail on second last node
			tail = tail.prev;
		}
	}
	
	
	
	public void forwardDisplay()
	{
		// forward list
		//1. create a trav pointer and start at head
		Node trav = head;
		System.out.print("forward list ::");
		while(trav != null) 
		{
			//2. print current node
			System.out.print(" " + trav.data);
			//3. go on next node
			trav = trav.next;
		}//4. repeat step 2 and 3 till last node
		System.out.println("");
	}
	
	
	
	public void deleteAll() 
	{
		head = tail = null;
	}
}