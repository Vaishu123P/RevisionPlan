
//Q4. Finding Common Elements Between Two Sets
//Write a program that takes two HashSet objects and prints the elements that are common to both
package org.techub;
import java.util.*;
public class CommonElementBetweenTwoSet 
{
 public static void main(String[] args) 
 {
	Scanner sc=new Scanner(System.in);
	HashSet <Integer> hs=new HashSet<Integer>();
	HashSet<Integer> hs1=new HashSet<Integer>();
	
	System.out.println("Enter the size");
	int size=sc.nextInt();
	System.out.println("Enter tthe values in First HASHSET");
	for(int i=0;i<size;i++)
	{
		 hs.add(sc.nextInt());
	}
	System.out.println("Enter the size");
	int size1=sc.nextInt();
	System.out.println("Enter tthe values in First HASHSET");
	for(int i=0;i<size1;i++)
	{
		hs1.add(sc.nextInt());
	}
	
     System.out.println("First HashSet..."+ hs);
     System.out.println("Second HashSet..."+hs1);
     
     HashSet <Integer>hs2=new HashSet<Integer>();
     for(int no : hs)
     {
    	 if(hs1.contains(no))
    	 {
    		 hs2.add(no);
    	 }
     }
     System.err.println("Common Elements from Set......"+hs2);
  }

}
