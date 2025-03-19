//Merging Multiple Lists
// Description: Merge two ArrayLists into one while ensuring no 
// duplicates are present. Print the merged list sorted by item names.


package org.techub;
import java.util.*;
public class MergeMultipleTwoList {
 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList <String>al=new ArrayList<>();
		ArrayList <String>al1=new ArrayList<>();
		
		System.out.println("Enter the size of First arrayList");
		int size=sc.nextInt();
		System.out.println("Enter the names of Items");
		for(int i=0;i<=size;i++)
		{
			al.add(sc.nextLine());
		}
		System.out.println("Enter the size of second arrayList");
		int size1=sc.nextInt();
		System.out.println("Enter the names of Items");
		for(int i=0;i<=size1;i++)
		{
			al1.add(sc.nextLine());
		}
		System.out.println("AFTER MERGE.......");
		al.addAll(al1);
		HashSet set=new HashSet(al);
		Iterator i=set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
