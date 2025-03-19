package org.techub;
import java.util.*;
public class ArrayListOperation 
{
 public static void main(String[] args) 
 {
    Scanner sc=new Scanner(System.in);
    ArrayList<Integer> al=new ArrayList<Integer>();
    do
    {
    	System.out.println("1:Add element");
    	System.out.println("2:Print the List");
    	System.out.println("3:Remove element on specific element");
    	System.out.println("Entre your choice");
    	int choice=sc.nextInt();
    	switch(choice)
    	{
    	case 1:
    		System.out.println("Enter the size");
    		int size=sc.nextInt();
    		for(int i=0;i<size;i++)
    		{
    		al.add(sc.nextInt());
    		}
    		break;
    	case 2:
    		//System.out.println(al);
    		Iterator i=al.iterator();
    		    while(i.hasNext())
    		    {
    		    	System.out.println(i.next());
    		    }
    		break;
    	case 3:
    		System.out.println("Enter the index for delete value");
    		int index=sc.nextInt();//2
    		//al.remove(index);
    		Iterator i1=al.iterator();
    		boolean flag=false;
    		while(i1.hasNext())
    		{
    			if((int)i1.next()==index)
    			{
    				i1.remove();
    				flag=true;
    				System.out.println("remove successfully......");
    				break;
    			}
    			
    		}
    		if(!flag)
    		{
    			System.out.println("Element not found");
    		}
    		break;
    	
    	}
    	
    }while(true);
    
 }

}
