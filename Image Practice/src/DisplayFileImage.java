import java.awt.*;
import javax.swing.*;

public class DisplayFileImage extends JPanel
	{
	Image image; 
	
	public DisplayFileImage()
		{
		super();
		image = Toolkit.getDefaultToolkit().getImage("McGuirePhoto.jpg");
		//Place your image in the folder the corresponds to your package explorer title.
		//It should be at the same level as your bin and src folders.
		//Be sure to include the extension (e.g. .jpg, .gif, etc...).
		}
	
	public void paintComponent(Graphics g)
		{
		g.drawImage(image,50,10,250,300, this); 
		}
	
	public static void main(String arg[])
		{
		JFrame frame = new JFrame("Image Window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,400);
		
		DisplayFileImage panel = new DisplayFileImage();
		// This DisplayFileImage name must match the name of your class
		
		frame.setContentPane(panel); 
		frame.setVisible(true); 
		}
	}