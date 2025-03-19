//. Finding Common Elements Between Two Lists
// Description: Given two HashSet objects (representing skills of two employees),
// find and print the skills that are common to both.



package org.techub;
import java.util.*;
public class CommonStringEmpSkills {
 public static void main(String[] args) {
		
      HashSet <String>hs=new HashSet<>();
      HashSet <String>set=new HashSet();
      Scanner sc=new Scanner(System.in);
      
      
      System.out.println("Enter the size of hashset");
      int size=sc.nextInt();
      sc.nextLine();
      
      System.out.println("Enter the skills of first EMP");
      for(int i=0;i<size;i++)
      {
    	  hs.add(sc.nextLine());
      }
    		  

      System.out.println("Enter the skills of second EMP");
      for(int i=0;i<size;i++)
      {
    	  set.add(sc.nextLine());
      }
     
//    	  if(hs.equals(set))
//    	  {
//    		  System.out.println(hs);
//    	  }
//    	  else
//    	  {
//    		  System.out.println("sKILLS NOT MATCH");
//    	  }
         HashSet <String>s=new HashSet();
         for(String num:set)
         {
        	 if(hs.contains(num))
        	 {
        		 s.add(num);
        	 }
         }
         System.err.println("Common Skillss are....");
         Iterator itr=s.iterator();
         while(itr.hasNext())
         {
        	 System.out.println(itr.next());
         }

      }
	

}
