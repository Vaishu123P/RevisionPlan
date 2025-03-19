package org.techub;
import java.util.*;
import java.util.Map.Entry;
public class HashMapOperation 
{
	public static void main(String[] args)
	{
      Scanner sc=new Scanner(System.in);
      HashMap<Integer,String> hm=new HashMap<Integer,String>();
      do
      {
    	  System.out.println("1:Insert Record IN HashMap");
    	  System.out.println("2:Dispaly records In HashMap");
     	  System.out.println("3:delete Record IN HashMap");
     	  System.out.println("Enter Your Choice");
     	  int choice=sc.nextInt();
     	  switch(choice)
     	  {
     	  case 1:
     		    System.out.println("Enter the size");
     		    int size=sc.nextInt();
     		    for(int i=0;i<size;i++)
     		    {
     		    	System.out.println("Enter the key ");
     		    	int key=sc.nextInt();
     		    	sc.nextLine();
     		    	System.out.println("Enter the value");
     		    	String value=sc.nextLine();
     		    	hm.put(key, value);
     		     }
     		     
     		    break;
     	  case 2:
     		 Set<Entry<Integer, String>>set=hm.entrySet();
 		     for(Map.Entry m:set)
 		     {
 		    	 System.out.println(m.getKey()+"\t"+m.getValue());
 		     }
     		  break;
     	  case 3:
     		 System.out.println("Enter the index");
 		     int index=sc.nextInt();
 		     hm.remove(index);
     		    break;
     	  case 4:
     		  System.exit(choice);
     		    break;
     	  }
      }
      while(true);
	}

}
