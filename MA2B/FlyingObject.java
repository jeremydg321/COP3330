package name;
import java.awt.Image;
import javax.swing.ImageIcon;

public class FlyingObject {
	protected int x;
	protected int y;
	private int width;
	private int height;
	private boolean visible;
	private Image image;
	
	
	
	public  FlyingObject(int x, int y)
	{
		this.x =x;
		this.y = y;
		visible = true;
		
	}
	
	protected void loadImage(String imageName)
	{
	Image icon = new ImageIcon("src/name/fighter.gif").getImage();
	image = icon;
	}
	
	protected void extractImageDimension(Image icon)
	{
	
		height = icon.getHeight(null);
		width = icon.getWidth(null);
	}

	public Image getImage()
	{
		return image;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public boolean isVisible()
	{
		
		if(visible ==true)
		{
		return visible;
		}
		
		else
		{
			return false;
		}
	}
	
	public boolean setVisible(boolean visible)
	{
		this.visible = visible;
		return visible;
	
	}
}
