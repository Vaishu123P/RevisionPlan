//Sorting a List of Products by Price Using Comparator
//Description: Create a list of Product objects with name and price fields.
//Sort the list of products by price in ascending order using a Comparator.
package org.techub;
import java.util.*;
class Product 
{
	  private String pname;
      private int price;
      
      Product()
      {
    	  
      }
      Product(String pname,int price)
      {
    	  this.pname=pname;
    	  this.price=price;
      }
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
class PriceAsceding implements Comparator
{


	public int compare(Object o1, Object o2) 
	{
		Product p=(Product)o1;
		Product p2=(Product)o2;
		if(p.getPrice()>p2.getPrice())
		{
			return 1;
		}
		else if(p.getPrice()<p2.getPrice())
		{
			return -1;
		}
		else {
		return 0;
		}
	}
}
public class SortListProductUsingComparitor{
	public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size");
      int size=sc.nextInt();
     
      ArrayList<Product> al=new ArrayList<>();
      for(int i=0;i<size;i++)
      {sc.nextLine();
    	System.out.println("Enter the name");
    	String name=sc.nextLine();
    	System.out.println("eNTER THE PRICE");
    	int price=sc.nextInt();
    	al.add(new Product (name,price));
      }
     Comparator c=new PriceAsceding();
      Collections.sort(al,c);
      System.out.println("after sort");
      for(Product p:al)
      {
    	  System.out.println(p.getPname()+"\t"+p.getPrice());
      }
	}

}
