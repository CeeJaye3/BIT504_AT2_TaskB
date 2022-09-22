import java.awt.Color;

public class Ball extends Sprite 
{
	//Variables that don't change
	private static final int Ball_Width = 25, Ball_Height = 25;
	private static final Color Ball_Colour = Color.black;
	
	public Ball (int panelWidth, int panelHeight)
	{	
		//Set constructors
		setWidth(Ball_Width);
		setHeight(Ball_Height);
		setColour(Ball_Colour);
		
		//Methods
		setInitialPosition(panelWidth/2 - (getWidth()/2), panelHeight/2 - getHeight()/2);	
		resetToInitialPosition();
	}
}