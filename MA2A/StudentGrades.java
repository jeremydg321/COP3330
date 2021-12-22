/**
 * 
 */
package GradingSystem;
//import java.io.PrintStream;
//import java.lang.*;



public class StudentGrades {
	
private static int  studentCounter = 0;
private String studentName;
private double[] scores;
private String[][] courseLetterGrade;


//returns score by if else
public static String getLetterGrade(double score)
{
	 if (score >= 90) {
         return "A";
     } else if (score >= 80) {
         return "B";
     } else if (score >= 70) {
         return "C";
     } else if (score >= 60) {
         return "D";
     } else {
         return "F";
     }
}

//constructor to assign name
public StudentGrades(String Name) 
{
	studentName=Name;
	studentCounter++;
	courseLetterGrade = new String[2][2];
}

//constructor to assign name, score and course letter grade
public StudentGrades(String studentName,double scores[], String[] courseLG ) 
{
	this.studentName=studentName;
	this.scores=scores;
	courseLetterGrade = new String[scores.length][2];
	for (int i = 0; i < courseLG.length; i++) {
      courseLetterGrade[i][0] = courseLG[i];
      courseLetterGrade[i][1] = getLetterGrade(scores[i]);
    }
	
	studentCounter++;
}

//getter for name
public String getName() 
{
	return studentName;
}

//calculates average
public double getAverageScore()
{
	double avg = 0;
	for(int i = 0; i<scores.length;i++)
	{
		avg += scores[i];
	}
	return avg/scores.length;
}

//prints display
public void displayGrades()
{
	System.out.println("-----------------------------------------");
	System.out.printf("Student Name: %s\n", studentName);
	System.out.printf("%-25s%20s%10s\n", "Course Name", "LetterGrade", "Score");
	System.out.println("");
	for(int count = 0;count<scores.length;count++)
	{
		System.out.println(String.format("%-25s%16s%14.2f",courseLetterGrade[count][0], courseLetterGrade[count][1],scores[count]));
		
	}
	
	System.out.println("-----------------------------------------");
}

public static int getStudentCounter()
{
	return studentCounter;
}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
package GradingSystem;
import java.security.SecureRandom;

/**
 * @author jerem
 *
 */
public class StudentGradesTest {

	/**
	 * @param args
	 * @return 
	 */
	//method to find maximum
	public static double  maxe( double score)
	{
		double max = 0;
		double temp = 0;
		
        if(max<temp)
        	{
        		max = temp;
        		return max;
        	}
        else
        {
        	max = score;
        	return score;
        }
	}
	
	public static void main(String[] args) {
		
		
		String studentNames[] = {"Adam Smith", "Nusair Ahmed", "Muhammad Mustafa", "Christian Thomsen", "Debashish Roy"};
		
		String courseNames[] = {"Java programming", "Data Science", "Database Systems", "Computer Organization" , "Data Structure"};
		
		double maximum =0;
		
		
		for (int i = 0; i<studentNames.length;i++)
		{
			
			
			double[]  nc = new double[5];
			SecureRandom rand = new SecureRandom();
			nc[0] = rand.nextInt(50)+50;
			nc[1] = rand.nextInt(50)+50;
			nc[2] = rand.nextInt(50)+50;
			nc[3] = rand.nextInt(50)+50;
			nc[4] = rand.nextInt(50)+50;
			
			
			//object created 
			StudentGrades SG = new StudentGrades(studentNames[i],nc,courseNames);
			
			SG.displayGrades();
			
			System.out.println();
            
            
            System.out.printf("Average grade of %s: %.2f\n",SG.getName(), SG.getAverageScore());
            
            
          maximum = maxe(SG.getAverageScore());
			}
		
		
		System.out.printf("\nHighest Average grade: %.2f\n",maximum);
		
		}
		
		
		
		
		
	}


