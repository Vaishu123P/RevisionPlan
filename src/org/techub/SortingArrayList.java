package org.techub;
import java.util.*;
class Employee implements Comparable
{
  private int id;
  private String name;
  private int sal;
  
  public Employee()
  {
	  
  }
  public Employee(int id,String name,int sal)
  {
	  this.id=id;
	  this.name=name;
	  this.sal=sal;
  }
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
@Override

	public int compareTo(Object o)
      {
		Employee e = (Employee) o;
		if (this.id > e.id) {
			return 1;
		} else if (this.id < e.id) {
			return -1;
		} else {
			return 0;
		}
	}
}
public class SortingArrayList 
{
 public static void main(String[] args) 
  {
   Scanner sc=new Scanner(System.in);
	ArrayList<Employee> al = new ArrayList<Employee>();
	
	System.out.println("Enter the size");
	int size=sc.nextInt();
	int a[]=new int[size];
	for(int i=0;i<a.length;i++)
	{
		System.out.println("Enter the id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name");
		String name=sc.nextLine();
		System.out.println("Enter the Sal");
		int sal=sc.nextInt();
		Employee s=new Employee(id,name,sal);
		al.add(s);
	}
	   System.out.println("Display the record without sort");
	   for(Employee e:al)
	   {
		   System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
	   }
	   System.out.println("Display the record without sort");
	
	   Collections.sort(al);
	 for(Employee s1 : al)
	 {
		 System.out.println(s1.getId()+"\t"+s1.getName()+"\t"+s1.getSal());
	 }
	}
}
