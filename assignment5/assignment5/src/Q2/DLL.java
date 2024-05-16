package Q2;

//2. Implement Deque using doubly linear linked list with head & tail.

public class DLL
{

	public static void main(String[] args) 
	{
		List l1=new List();
		
		l1.addFirst(10);
		l1.addFirst(20);
		l1.addFirst(30);
		
		l1.addLast(40);
		l1.addLast(50);
		l1.addLast(60);
		
		l1.forwardDisplay();
		
		l1.deleteFirst();
		l1.deleteLast();
		l1.forwardDisplay();
		
	}

}
