//Queue for Print Job Management
 //Description: Use a Queue to manage print jobs in a printing system. 
//When a user submits a print job, it’s added to the queue, and jobs are processed 
//(printed) in the order they are added.

package org.techub;
import java.util.*;
public class JobManagementQueue 
{
 public static void main(String[] args) 
 {
         Scanner Sc = new Scanner(System.in); 
		Queue <String>q =new LinkedList<String>();
		do
		{
			System.out.println("1:ADD PRINT JOB..");
			System.out.println("2:DISPLAY THE JOBS..");
			System.out.println("3:PROCESS JOB");
			System.out.println("4:Exist");
			System.out.println("ENTER THE CHOICE");
			int choice=Sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the size");
				int size=Sc.nextInt();
				Sc.nextLine();
				System.out.println("Enter the Job Title");
				for(int i=0;i<size;i++) 
				{
				  q.add(Sc.nextLine());
				}
				break;
			case 2:
				  Iterator<String> i=q.iterator();
				  while(i.hasNext())
				  {
					  System.out.println(i.next());
				  }
			    break;
			case 3:
				 if (q.isEmpty()) {
		             System.out.println("No jobs to process.");
		         } else {
		             System.out.println("Processing job: " + q.poll());
		         }
				
				break;
			case 4:
				System.exit(choice);
				break;
			}
		}
		while(true);
	}
    
 }


