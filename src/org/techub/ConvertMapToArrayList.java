//Converting Map to List and Sorting
// Description: Convert a HashMap (employee name as key and salary as value) 
// into a List of entries and
// sort them by salary in descending order

package org.techub;
import java.util.*;
public class ConvertMapToArrayList {
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       HashMap<String,Integer> hm=new HashMap<>();
       
       System.out.println("Enter the size of Hashmap");
       int size=sc.nextInt();
       
       //System.out.println("Enter the values in hashmap");
       for(int i=0;i<size;i++)
       {  sc.nextLine();
    	   System.out.println("Enter the String key");
    	   String name=sc.nextLine();
    	   System.out.println("Enter the Slary");
    	   int sal=sc.nextInt();
    	   hm.put(name, sal);
       }
       //System.out.println("Before converting  "+hm);
       Set<Map.Entry<String, Integer>>s=hm.entrySet();
       for(Map.Entry<String, Integer>m:s)
       {
    	   System.out.println("Before converting........"+m.getKey()+"\t"+m.getValue());
       }
       ArrayList <Map.Entry<String, Integer>>al=new ArrayList(hm.entrySet());
    		   System.out.println(al);

    		   for(int i=0;i<al.size();i++)
    		   {
    			   for(int j=i+1;j<al.size();j++)
    			   {
    				   if(al.get(i).getValue()<al.get(j).getValue())
    				   {
    					  Map.Entry<String, Integer>temp=al.get(i);
    					   al.set(i, al.get(j));
    					   al.set(j,temp);
    				   }
    			   }
    		   }
    		   Iterator itr=al.iterator();
    		   while(itr.hasNext())
    		   {
    			   System.out.println(itr.next());
    		   }
	}

}
