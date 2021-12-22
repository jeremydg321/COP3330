package Default;

import java.util.ArrayList;

public abstract class Garage {

	
	protected static String  garageName;
	
	 public   Garage(String garageName)
	 {
		 Garage.garageName = garageName;
	 }
	 
	 
	
	 public String getName()
	 {
		 return garageName;
	 }
	 
	 abstract double calculate(double a);
	
}
