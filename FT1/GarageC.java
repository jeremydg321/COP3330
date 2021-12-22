package Default;
import java.util.ArrayList;

public  class GarageC extends Garage implements ParkingSpot {
	
	private static int floorInt;
	
	private static double floorArea;
	
	
	private  static GarageC instance = new  GarageC(garageName, floorInt,  floorArea);
	
	private GarageC(String garageName,int floorInt, double floorArea)
	{
		super(garageName);
		
		GarageC.floorInt = floorInt;
		GarageC.floorArea = floorArea;
		
	}
	
	
	
	
	
	public static  GarageC getInstance()
	{
		return instance;
	}
	
	
	
	public int getFloorInt()
	{
		return floorInt;
		
	}
	
	public double getFloorArea()
	{
		return floorArea;
		
	}
	
	@Override
	double calculate(double y)
	{
		double sum = 0;
		int i;
		
		//ArrayList<Double> list = new ArrayList<Double>();
		for( i=0; i<y;i++)
		{
			//sum = (double)list.get(i);
			sum += y;
		}
		
		return sum;
	}
	
	 public String specify(double l, double y)
	 {
		 String type1 = "Small";
		 String type2 = "Medium";
		 String type3 = "Large";
		 
		 if(l<=15) 
		 {
			return type1; 
		 }
		 else if(l>15&&l<=17)
		 {
			return type2; 
		 }
		 else
		 {
			 return type3;
		 }
		 
	 }
	 
	   
	   public double area(double l, double y)
	    {
		   double area = l *y;
		   
		   return area;
	    }


	
}
