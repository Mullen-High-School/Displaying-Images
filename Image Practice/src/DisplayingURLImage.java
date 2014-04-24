import java.awt.BorderLayout;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DisplayingURLImage
	{
	public static void main(String[] args) 
		{
		Image image = null;
		
		try
			{
			URL url = new URL("http://4.bp.blogspot.com/-bmwV3ed_fsY/UNdSZTSRwMI/AAAAAAAABl4/hy-CuVdk99k/s400/12.08.30-Java.jpg");
			image = ImageIO.read(url);
			}
		catch (IOException e)
			{
			}
		
		JFrame frame = new JFrame();
		JLabel lblimage = new JLabel(new ImageIcon(image));
		frame.getContentPane().add(lblimage, BorderLayout.CENTER);
		frame.setSize(500, 400);
		frame.setVisible(true);
		}
	}
