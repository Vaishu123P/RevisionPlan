package org.techub;
import java.util.*;
public class StackOperation
{
   public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  Stack s=new Stack();
	  do
	  {
		  System.out.println("1: push the value in stack....");
		  System.out.println("2: pop the value from stack...");
		  System.out.println("3: peek operations the value from stack...");
		  System.out.println("4:display stack value using last in first out...");
		  System.out.println("5:exist");
		  System.out.println("Enter Your Choice");
		  int choice=sc.nextInt();
		  switch(choice)
		  {
		  case 1:
			  System.out.println("Enter the size");
			  int size=sc.nextInt();
			  for(int i=0;i<size;i++)
			  {
				  s.push(sc.nextInt());
				 
			  }
			  System.out.println("Element Added......");
			    break;
		  case 2:
			  Iterator i=s.iterator();
			  while(i.hasNext())
			  {
				  System.out.println(i.next());
				  
			  }
			  
			    //System.out.println(s);
			    break;
		  case 3:
			    boolean b=s.empty();
			    if(b)
			    {
			    	System.err.println("Stack in underflow");
			    }
			    else
			    {
			    	Object obj=s.peek();
			    	System.err.println("Last element from stack is: "+obj);
			    }
			    
			    break;
		  case 4:
			  		ListIterator li = s.listIterator(s.size());
			  		while(li.hasPrevious())
			  		{
					Object obj = li.previous();
					System.out.println(obj);
				    }

			    break;
		  case 5:
			    System.exit(choice);
			    System.err.println("Switch case complete");
			    break;
		  }
	  }
	  while(true);

	}

}

