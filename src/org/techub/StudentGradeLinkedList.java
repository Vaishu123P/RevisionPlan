package org.techub;
import java.util.*;
class Student
{
   private String name;
   private float grade;
   public Student() {  
   }
   public Student(String name,float grade)
   {
	   this.name=name;
	   this.grade=grade;
   }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getGrade() {
	return grade;
}
public void setGrade(float grade) {
	this.grade = grade;
}
   
}
public class StudentGradeLinkedList
{
  public static void main(String[] args)
  {
		LinkedList <Student>list=new LinkedList<Student>();
		Scanner sc=new Scanner(System.in);
		do 
		{
		   System.out.println("1:ADD STUDENT.....");
		   System.out.println("2:DISPLAY ALL STUDENT...");
		   System.out.println("3:DISPLAY STUDENT WHOS GRADE IS GREATER THAN 50..");
		   System.out.println("4: FAILED STUDENTS.....");
		   System.out.println("5:EXIST...");
		   System.out.println("Enter your choice..");
		   int choice=sc.nextInt();
		   switch(choice)
		   {
		   case 1:
			   System.out.println("Enter the size...");
				int size=sc.nextInt();
                for(int i=0;i<size;i++)
				{   sc.nextLine();
					System.out.println("Enter Student Name and their Grade....");
					String Name=sc.nextLine();
					float grade=sc.nextFloat();
					Student s=new Student(Name,grade);
			        list.add(s);			
				}

			     break;
		   case 2:
			      System.out.println("DISPLAY ALL STUDENT...");
			      for(Student s:list)
					{	 
					   System.out.println(s.getName()+"\t"+s.getGrade());
					}
			      break;
		   case 3:
			   System.out.println("PASSED  STUDENT....");
			   for(Student s:list)
				{
					 if(s.getGrade()>50)
					 {
						 System.out.println(s.getName()+"\t"+s.getGrade());
					 }
				
				}
			      break;
		   case 4:
			   System.out.println(" FAILED STUDENTS.....");
			   for(Student s:list)
				{
					 if(s.getGrade()<50)
					 {
						 System.out.println(s.getName()+"\t"+s.getGrade());
					 }
				
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
