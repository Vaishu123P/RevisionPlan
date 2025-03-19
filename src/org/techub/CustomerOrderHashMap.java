//Question5:  Track Customer Orders Using HashMap
// Description: Create a HashMap to store customer names (keys) 
// and their list of ordered items (values). Add, remove, and modify orders,
// and display all orders for a specific customer.


package org.techub;
import java.util.*;
import java.util.Map.Entry;
public class CustomerOrderHashMap 
{
 public static void main(String[] args) 
    {
		HashMap <String,ArrayList>hs=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		
		do
		{
			System.out.println("1:ADD the Customer Names and order");
			System.out.println("2:DISPLAY the Customer Names and order");
			System.out.println("3:REMOVE the Customer Names and order");
			System.out.println("4:MODIFY the Customer Names and order");
			System.out.println("5:EXIT...");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				sc.nextLine();
				System.out.println("Enter the name of customer");
				String name=sc.nextLine();
				System.out.println("enter the size");
				int size=sc.nextInt();
				ArrayList <String>al=new ArrayList<>();
				System.out.println("Enter the list of order");
				for(int i=0;i<=size;i++)
				{
					al.add(sc.nextLine());
					
				}
				
				  hs.put(name,al);
				  
			    //System.out.println(hs);	
			    break;
			case 2:
				
				Set<Entry<String, ArrayList>>set=hs.entrySet();
	 		     for(Map.Entry m:set)
	 		     {
	 		    	 System.out.println(m.getKey()+"\t"+m.getValue());
	 		    	System.out.println("HASHMAP WITH CUSTOMER NAME AND THERE ORDER");
	 		     }
	 		     break;
			case 3:
				
				sc.nextLine();
				System.out.println("Enter the Customer name  for remove");
				String cname=sc.nextLine();
				
				   for(int i=0;i<hs.size();i++)
				   {
					   hs.remove(cname);
				   }
					   System.err.println("customer remove successfuly....");
				  break;
			case 4:
				
				sc.nextLine();
				  System.out.println("Enter the name of customer for modify there name and order");
				  String cusname=sc.nextLine();
				  
					  if(hs.containsKey(cusname))
					  {   ArrayList <String>al1=new ArrayList<>();
						  System.out.println("Enter new name");
						  String n=sc.nextLine();
						  System.out.println("enter size of new order ");
						  int newsize=sc.nextInt();
						  sc.nextLine();
						  System.out.println("Enter the new list of order");
						  for(int i=0;i<=newsize;i++)
						   {
							 al1.add(sc.nextLine()); 
						   }
						  hs.remove(cusname);
						  hs.put(n, al1);
						  System.out.println("Custmor and order are modified");
						  System.out.println(hs);
						 }
					  else
					  {
						  System.out.println("Customer not found");
					  }
				  
				  break;
			case 5:
				System.exit(choice);
				  break;
				
			}
		}
		while(true);

	}

}
