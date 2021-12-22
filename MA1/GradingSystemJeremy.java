/* University of Central FLorida
 * COP 3330 Spring 2019
 * Assignment #1
 * Author: Jeremy Galvan
 */


package GradingSystem; 
import java.util.Scanner;


public class GradingSystemJeremy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  
	      //first three variables initialized to zero to be assigned formulas
	      int i = 0;
	      int sum = 0;
	      int avg = 0;
	      int j;
	      int m;
	      String finalGrade;
	      String student;
	      
	      
	      
	      
	
		System.out.println("Please Enter than name of the student:");
		student = input.nextLine();//prompt name
		 
		System.out.println("Please Enter the number of the subjects for the student:");
		i = input.nextInt();//prompt number
		
		
		//Array element assigned to user input
		String[] subjects = new String[i];
	    String[] letter = new String[i];
	    int grade[] = new int[i];
		
		
		System.out.printf("Enter %d subjects and their corresponding grades (out of 100)\n", i);
		
			for(j=0;j<i;j++)
				{
					System.out.printf("Enter the name of Subject %d\n",j+1);//1 adds to j to correct number of subject
					
					
					input.nextLine();//resets scan to input string
					subjects[j] = input.nextLine();
		
					System.out.printf("Enter the grade of Subject %d Out of (100):\n", j+1);
		
					grade[j] = input.nextInt();
					
		
					if(grade[j]<=100 && grade[j]>=90)
						{
							letter[j]= "A";
						}
					else if(grade[j]<=89 && grade[j]>=80)
						{
							letter[j]= "B";
						}
					else if(grade[j]<=79 && grade[j]>=70)
						{
							letter[j]= "C";
						}
					else if(grade[j]<=69 && grade[j]>=60)
						{
							letter[j]= "D";
						}
					else 
						{
							letter[j]= "F";
						}
					
				}
		
		System.out.printf("Showing all grades for %s\n", student);
		
		
		
		
		System.out.println("Subjects\tNumber Grades\tLetter Grades");
		System.out.println("----------------------------------------------");
		
		for(j=0;j<i;++j)
				{
					System.out.printf("%s\t\t%d\t\t%s\n", subjects[j], grade[j], letter[j]);
					sum+=grade[j];//calculates total score out of 300, adds grades from previous if-else statement
				}
		System.out.printf("Total grades of %s out of 300 is %d\n\n", student, sum);
			
			
		avg = sum/i;//calculates sum - divides sum by number of subjects 
		
		System.out.printf("Average number grade of %s of is %d\n\n", student, avg);	
		
		
		
		
		//calculates highest number- each time j is less than i, it'll read that m is less than grade until it is no longer
		m = grade[0];
			for(j=0;j<i;++j)
				{
				 if (m<grade[j])
					{
						m=grade[j];
					}	
				}
		System.out.printf("Highest grade of %s out of %d subjects is %d\n\n", student, i, m);
			
			//the use of the formula inside the switch statement allows for the int variable of the avg to round to the nearest 10s digit.
			switch(avg/10)
			{
			case 9:
			case 10:
				finalGrade= "A";
			break;
			case 8:
				finalGrade= "B";
			break;
			case 7:
				finalGrade= "C";
			break;
			case 6:
				finalGrade= "D";
			break;
			
			default:
				finalGrade= "F";
			break;
			}
		
		System.out.printf("Final letter grade of %s of is %s\n\n", student, finalGrade);
	
		
		
		
		
	
	input.close();//closes scanner
	System.out.print("End of Program....");
	}

	

}
