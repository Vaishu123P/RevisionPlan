//Question2: . Library Book Management Using Stack
//Implement a Stack to keep track of books being borrowed and returned in the library. 
//Each time a book is borrowed, it’s pushed onto the stack, 
//and when returned, it’s popped off.

package org.techub;
import java.util.*;
public class LibraryManagementStack 
{
 public static void main(String[] args) 
 {
       Stack<String> s=new Stack<String>();
       Scanner sc=new Scanner(System.in);
       do
       {
    	   System.out.println("1:Add Bookss...");
    	   System.out.println("2:Displays Book...");
    	   System.out.println("3:Push IF The Borrowed Books..");
    	   System.out.println("4:Pop If return bOoK...");
    	   System.out.println("ENTER YOUR CHOICE......");
    	   int choice=sc.nextInt();
    	   switch(choice)
    	   {
    	   case 1:
    		      System.out.println("Enter the book COUNT");
    		      int count=sc.nextInt();
    		      sc.nextLine();
    		      for(int i=0;i<count;i++)
    		      {   
    		    	System.out.println("Enter the name of book");
    		    	s.push(sc.nextLine());
    		      }
    		      break;
    	   case 2:
    		      for(String book :s)
    		      {
    		    	  System.out.println(book);
    		      }
    	   case 3:
    		     String retBook=s.pop();
    		     System.out.println("Book Returned to the Library:"+s.push(retBook));
    		      break;
    	   
    	   case 4:
    		   System.exit(choice); 
    			break;
    	   }
       }
       while(true);
       
 }
 
}
