/**
 * 
 */
package AdroitX;
import java.awt.Color;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
/**
 * @author aj
 *
 */
public class paintSurface {
public Sprite[] sprites; //array of sprites to appear on the screen
public BufferedImage[] resources; //array of images - great for preloading

	/**
	 * @param args
	 */
	void loadMap(String mapFile)
	{
		//load elements
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame("DeWitt Awesome Game"); //initialize window with title
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set to exit when closed
		window.setSize(800, 600); //window size 800 x 600
		window.getContentPane().setBackground(Color.white); //white background
		window.add(new Sprite("S:\\game\\images\\cat.gif", new Point(20,20), true)); //temporary hard-coded sprite test
		window.setVisible(true); //show to user
		window.repaint(); //request that components be redrawn
		for(;;)
		{
			//do everything necessary - infinite game loop.
			window.repaint();
		}
	}

}
