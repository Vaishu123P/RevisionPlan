// Remove Duplicate Names Using Set
 //Description: Given a list of names that may contain duplicates, 
//use a HashSet to remove duplicate names and print the cleaned-up list.

package org.techub;
import java.util.*;
public class RemoveDuplicateStringHashSet {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ArrayList al=new ArrayList();
		System.out.println("Enter the size of arrayList");
		int size=sc.nextInt();
		System.out.println("Enter the value in arrayList");
		for(int i=0;i<=size;i++)
		{
			al.add(sc.nextLine());
		}
		HashSet hs=new HashSet(al);
		Iterator i=hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
