//Q7. List Reversal Using LinkedList
//Write a program that reverses the order of elements in 
//a LinkedList using an iterator.

package org.techub;
import java.util.*;
public class ReverseLinkedList 
  {
    public static void main(String[] args)
     {
	 Scanner sc=new Scanner(System.in);
	 LinkedList<Integer> al=new LinkedList<Integer>();
	 System.out.println("Enter the size");
	 int size=sc.nextInt();
	 System.out.println("enter valus in arraylist");
	 for(int i=0;i<size;i++)
	 {
		al.add(sc.nextInt()); 
	 }
	 System.out.println("Before Reverse..."+al);
	 System.out.println("after reverse..");
	 ListIterator it=al.listIterator(al.size());
	 while(it.hasPrevious())
	 {
		 System.out.println(it.previous());
	 }
     }
 
}
