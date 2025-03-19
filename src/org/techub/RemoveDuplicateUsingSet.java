package org.techub;
import java.util.*;
public class RemoveDuplicateUsingSet 
{
	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  ArrayList al=new ArrayList();
	  System.out.println("Enter the size");
	  int size=sc.nextInt();
	  System.out.println("Enter the Value in ArrayList");
	  for(int i=0;i<size;i++)
	  {
		  al.add(sc.nextInt());
	  }
	  System.out.println("List: "+al);
   
	    HashSet <Integer>hs=new HashSet<Integer>(al);
	   
//	     for(int i=0;i<al.size();i++)
//	     {
//	    	 hs.add(al.get(i));
//	     }
	   System.out.println("hashSet: "+hs);
	    

	}

}
