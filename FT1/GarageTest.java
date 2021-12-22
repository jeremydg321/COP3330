package Default;

import java.io.*;
import java.util.Scanner;
import  java.util.ArrayList;

public class GarageTest {
	
	private static PrintWriter output;
	
	private static void openFile(String filename)
	{
		try
		{
			output = new PrintWriter(filename);
		}
		catch(FileNotFoundException exp)
		{
			System.out.println("File not found");
		}
	}
	
	private static void closeFile()
	{
		if(output!=null)
		{
			output.flush();
			output.close();
			
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		int fn ;
		double fa;
		String filename;
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of floors: ");
		fn = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Enter area of each floor: ");
		fa = scan.nextDouble();
		scan.nextLine();
		
		System.out.println("Enter file name: ");
		filename = scan.nextLine();
		
		openFile(filename);
		
		File file =  new File("newfile.txt");
		if (file.createNewFile())
		{
		    System.out.println("File is created");
		} else {
		    System.out.println("File exists.");
		}
		
		FileWriter write = new FileWriter(file);
		
		GarageC input =  GarageC.getInstance();
		write.write("Number of Floors: " + fn);
		write.write("Area of each floor: " + fa);
		write.write("Name of file: " + filename);
		
		
		
		ArrayList<Double> length = new ArrayList<Double>();
		ArrayList<Double> width = new ArrayList<Double>();
		ArrayList<String> type = new ArrayList<String>();
		ArrayList<Double> area = new ArrayList<Double>();
		
		
		
		
		try
		{
			
			Scanner filescan = new Scanner(new FileInputStream("cars.txt"));
			while(filescan.hasNext())
			{
			
				type.add(filescan.next());
				length.add(filescan.nextDouble());
				width.add(filescan.nextDouble());
				
				
				
				
			}
			filescan.close();
		}
		catch(FileNotFoundException exp)
		{
			System.out.println("File does not exist");
		}
		
		
		
		write.write("CarName\tCarType\tArea\n");
		
		
		
		
		int count = 0;
		double var = 0;
		while(count<length.size()&&count<width.size())	
		{
			write.write(type.get(count) + "\t");
			System.out.println(type.get(count)+ "\t");
			
			write.write(input.specify(length.get(count),width.get(count))+"\t");
			System.out.println(input.specify(length.get(count),width.get(count))+"\t");
			var=input.area(length.get(count),width.get(count));
			write.write(var+"\n");
			System.out.println(var+"\n");
			area.add(var);
			//input.calculate()
			
			
		}
		while(area.get((int)var)<=area.size())
		{
			input.calculate(area.get((int)var));
		}
		
		write.write("Total Area of Parking Space" +input.calculate(area.size())+"\n");
		
		if(area.get((int)var)>=(fn*fa))
		{
			write.write("Garage is Full\n");
		
		}
		else if(area.get((int)var)<(fn*fa)&&area.get((int)var)!=0)
		{
			write.write("Garage is not full\n");
		}
		else 
		{
			write.write("Garage is empty\n");
		}
		
	
		
		
		
		
		

	
		
		scan.close();
		closeFile();
		write.close();
	}

}
