package org.techub;
import java.util.*;
public class LinkedListOperation 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		LinkedList<String> l=new LinkedList<String>();
		do
		{
			System.out.println("1:Add String element in linkedList");
			System.out.println("2:View the list from linkedlist");
			System.out.println("3:Remove the element from LinkedList");
			System.out.println("4:Exist....");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the size");
				int size=sc.nextInt();
				for(int i=0;i<=size;i++)
				{
					l.add(sc.nextLine());
				}
				break;
			case 2:
				Iterator i=l.iterator();
				while(i.hasNext())
				{
					System.out.println(i.next());
				}
				break;
			case 3:
				sc.nextLine();
				System.out.println("Enter element for remove");
				String el=sc.nextLine();
				Iterator i1=l.iterator();
				boolean flag=false;
				while(i1.hasNext())
				{
					if(i1.next().equals(el)) {
						i1.remove();
						flag=true;
						System.out.println("Remove successfully");
						break;
					}
				}
				if(!flag)
				{
					System.out.println("Element not found");
				}
				   break;
			case 4:
				System.exit(choice);
			}
		}
		while(true);

	}

}
