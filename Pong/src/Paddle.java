import java.awt.Color;

public class Paddle extends Sprite
{
	private static final int Paddle_Width = 10, Paddle_Height = 100;
	private static final Color Paddle_Colour = Color.white;
	private static final int Distance_From_Edge = 40;
	
	public Paddle (Player player, int panelWidth, int panelHeight)
	{
		//set constructors
		setWidth(Paddle_Width);
		setHeight(Paddle_Height);
		setColour(Paddle_Colour);
		int xPos;
		
		//Methods
		if(player == Player.One)
		{
			xPos = Distance_From_Edge;
		}
		else
		{
			xPos = panelWidth - Distance_From_Edge - getWidth();
		}
		setInitialPosition(xPos, panelHeight/2 - (getHeight()/2));
		resetToInitialPosition();
	}
}