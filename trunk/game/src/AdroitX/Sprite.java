/**
 * 
 */
package AdroitX;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import sun.security.util.Debug;

/**
 * @author aj
 *
 */
public class Sprite extends Component {

	/**
	 * 
	 */
	private BufferedImage image;
	private Point currentPosition = new Point(0,0);
	private Boolean anchored = false;
	private static final long serialVersionUID = -8777748656612457715L;
    
	public Sprite(String graphicFile, Point initialPosition, Boolean isAnchored)
	{
		try
		{
			File file = new File(graphicFile);
			image = ImageIO.read(file);
			currentPosition = initialPosition;
			anchored = isAnchored;
			this.repaint();
		}
		catch (Exception ex)
		{
			
		}
	}
	public Sprite(BufferedImage image, Point initialPosition, Boolean isAnchored)
	{
		try
		{
			image = this.image;
			currentPosition = initialPosition;
			anchored = isAnchored;
			this.repaint();
		}
		catch (Exception ex)
		{
			
		}
	}
	public void paint(Graphics g) {
		System.out.println("I was redrawn!");
        g.drawImage(image, currentPosition.x, currentPosition.y, null); // see javadoc for more info on the parameters
    }
}
