// Merging Two Lists
//Merge two ArrayList objects into one, making sure that the merged list
//does not contain duplicates

package org.techub;
import java.util.*;
public class MergeTwoArrayList 
{
   public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<Integer>();
		ArrayList<Integer> al1=new ArrayList<Integer>();
		
		System.out.println("Enter the size");
		int size1=sc.nextInt();
		System.out.println("Enter the value ArrayList One");
		for(int i=0;i<size1;i++)
		{
			al.add(sc.nextInt());
		}
		System.out.println("Enter the size");
		int size2=sc.nextInt();
		System.out.println("Enter the value ArrayList One");
		for(int i=0;i<size2;i++)
		{
			al1.add(sc.nextInt());
			
		}
		al.addAll(al1);
		HashSet <Integer> hs = new HashSet<Integer>(al);
		ArrayList<Integer> mergedList = new ArrayList<>(hs);
		System.out.println("Merge arrayList without duplication"+mergedList);
		
	}

}
