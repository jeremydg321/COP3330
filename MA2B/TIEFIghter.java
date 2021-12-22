package name;
import java.awt.Image;
import javax.swing.ImageIcon;

public class TIEFIghter extends FlyingObject {
	final int INITIAL_X = 500;
	
	 public void initFighter(String imageName)
	{
		 
		
		loadImage(imageName);
		
		Image icon = new ImageIcon("src/name/fighter.gif").getImage();
		extractImageDimension(icon);
	}
	public TIEFIghter(int x, int y) 
	{
		super(x,y);
		initFighter("fighter.gif");
		
		
	}
	
	 public void move()
	{
		if(x<0)
		{
			x = INITIAL_X;
			
		}
		else
		{
		x--;
		}
	}
	
	
}
