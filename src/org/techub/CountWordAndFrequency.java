//Word Frequency Counter Using HashMap
// Description: Given a paragraph of text, 
// use a HashMap to count the frequency of each word in 
// the text. Display each word and its frequency.
package org.techub;
import java.util.*;
import java.util.Map.Entry;
public class CountWordAndFrequency {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String,Integer>map=new HashMap<String,Integer>();
		
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String a[]=new String[s.length()];
		a=s.toLowerCase().split("\\s");
		for(int i=0;i<a.length;i++)
		{
			if(map.containsKey(a[i]))
			{
				map.put(a[i], map.get(a[i])+1);
				
			}
			else
			{
				map.put(a[i],1);
			}
		}
		System.out.println("Frequency COUNT Is :");
		Set<Entry <String,Integer>>set=map.entrySet();
		for(Map.Entry<String, Integer>m:set)
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
	}

}
