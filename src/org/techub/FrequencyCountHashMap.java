package org.techub;
import java.util.Map.Entry;
import java.util.*;
public class FrequencyCountHashMap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the value in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();//10 20 30 10 20 40
		}
	 HashMap <Integer,Integer>m=new HashMap<Integer,Integer>();
	 for(int i=0;i<a.length;i++)
	 {
		 if(m.containsKey(a[i]))
		 {
			 m.put(a[i],m.get(a[i])+1);
		 }
		 else
		 {
			 m.put(a[i], 1);
		 }
	 }
	 System.out.println(m);
	 Set<Entry<Integer, Integer>>s=m.entrySet();
	 for(Map.Entry<Integer, Integer>m1:s)
	 {
		 System.out.println(m1.getKey()+"\t"+m1.getValue());
	 }
	}

}
