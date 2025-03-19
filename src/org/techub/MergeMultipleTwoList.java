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
		sc.nextLine();
		System.out.println("Enter the names of Items");
		for(int i=0;i<size;i++)
		{
			al.add(sc.nextLine());
		}
		System.out.println("Enter the second names of Items");
		for(int i=0;i<size;i++)
		{
			al1.add(sc.nextLine());
		}
		System.out.println("AFTER MERGE.......");
		al.addAll(al1);
		HashSet<String> set=new HashSet<>(al);
		System.out.println("Remove duplicate String: ");
		for (String item : set) {
            System.out.println(item);
        }
      ArrayList<String> result = new ArrayList<>(set);
      System.out.println("Display Ascending order: ");
	  for( int i=0;i<result.size();i++)
	  {
		  for(int j=i+1;j<result.size();j++)
		  {
			  if(result.get(i).compareToIgnoreCase(result.get(j))>0)
			  {
				 String temp=result.get(i);
				 result.set(i,result.get(j));
				 result.set(j, temp);
			  }
		  }
	  }
	  System.out.println(result);

	}

}
