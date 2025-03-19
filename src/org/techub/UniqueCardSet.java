//Question4:  Unique Items Shopping Cart Using Set
//Description: Use a HashSet to manage a shopping cart
//where no duplicate items are allowed. Add items, remove an item,
//and check if a specific item is already in the cart.


package org.techub;
import java.util.*;
public class UniqueCardSet 
{
	public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);
	  boolean flag=false;
	  HashSet <String>s=new HashSet<String>();
	  do 
	  {
		   System.out.println("1:ADD Cart...🤘🤘");
		   System.out.println("2:Display the Cart...👀👀");
		   System.out.println("3:Remove item...✂️✂️✂️");
		   System.out.println("4:Check specific Item present or not");
		   System.out.println("5:Exist..👩‍🎓👩‍🎓👩‍🎓");
		   System.out.println("Enter the choice");
		   int choice=sc.nextInt();
		   switch(choice)
		   {
		   case 1:
			   sc.nextLine();
			   System.out.println("Enter the size");
			   int size=sc.nextInt();
			   sc.nextLine();
			   for(int i=0;i<size;i++)
			   {
			     System.out.println("Enter the Items in cart");
			     s.add(sc.nextLine());
			   }
			     System.err.println("Items added succesfully");
			     break;
		   case 2:
			    Iterator i=s.iterator();
			    while(i.hasNext())
			    {
			    	System.out.println(i.next());
			    }
			     break;
		   case 3:
			   sc.nextLine();
			   System.out.println("Enter the Remove Product name..");
			   String index=sc.nextLine();
//			   s.remove(index);
			   for(String s1 :s)
			   {
				   if(s1.equals(index)) {
					   s.remove(s1);
					   System.out.println("Rmoved Success...");
					   break;
				   }
			   }			   
			     break;
		   case 4:
			   sc.nextLine();
			     System.out.println("Enter the Items..");
			     String itm=sc.nextLine();
			     for(String s3:s) {
			     if(s3.equals(itm))
			     {
			    	 
			    	 System.out.println("Item is present");
			    	 flag=true;
			    	 break;
			     }
			     }
			     if(!flag)
			     {
			    	 System.out.println("Items not present");
			     }
			      break;
			 
		   }
	  }
	  while(true);
    }

}
