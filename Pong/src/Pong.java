import javax.swing.JFrame;

public class Pong extends JFrame 
{
	private final static String window_title = "Pong Game";
	private final static int window_width = 800;
	private final static int window_height = 600;
	
	public Pong() 
	{		
    	setTitle(window_title);
    	setSize(window_width,window_height);
    	setResizable(true);
    	add (new PongPanel()); setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) 
	{
		javax.swing.SwingUtilities.invokeLater (new Runnable()
		{
			public void run()
			{
				new Pong();
			}
		});
	}
}