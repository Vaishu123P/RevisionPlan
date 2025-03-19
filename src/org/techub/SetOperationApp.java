package org.techub;
import java.util.*;

public class SetOperationApp
{
public static void main(String[] args) 
{
	
   HashSet hs=new HashSet();
   Scanner sc=new Scanner(System.in);
   do 
   {
	    System.out.println("1:add elements to the set.....");
	    System.out.println("2:checking if an element exists...");
	    System.out.println("3:finding the size of the set...");
	    System.out.println("4:exist...");
	    System.err.println("Enter your choice");
	    int choice=sc.nextInt();
	    switch(choice)
	    {
	    case 1:
	    	  System.err.println("enter the size");
	    	  int size=sc.nextInt();
	    	  for(int i=0;i<size;i++)
	    	  {
	    		  hs.add(sc.nextInt());
	    	  }
	    	  System.err.println(hs);
	    	  break;
	    case 2:
	    	  if(hs.isEmpty())
	    	  {
	    		  System.out.println("elemnet not exist");
	    	  }
	    	  else
	    	  {
	    		   System.out.println("Enter the element for check");
	    		   int el=sc.nextInt();
	    		 if( hs.contains(el))
	    		 {
	    			 System.out.println("element is exist.....");
	    		 }
	    		 else
	    		 {
	    			 System.out.println("not exist.......");
	    		 }
	    	  }
	    	  break;
	    case 3:
	    	  System.out.println(" Size of HashSet "+hs.size());
	    	  break;
	    case 4:
	    	System.err.println("Switch case stoped");
	    	  System.exit(choice);
	    	  break;
	    }
	    
   }
   while(true);
}



}
