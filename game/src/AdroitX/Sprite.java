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
import java.io.FileNotFoundException;

import javax.imageio.ImageIO;


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
    
	public void setAnchored(Boolean anchored) {
		this.anchored = anchored;
	}
	public Boolean getAnchored() {
		return anchored;
	}
	public Sprite(String graphicFile, Point initialPosition, Boolean isAnchored) throws FileNotFoundException
	{
		try
		{
			File file = new File(graphicFile);
			image = ImageIO.read(file);
			currentPosition = initialPosition;
			setAnchored(isAnchored);
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
			setAnchored(isAnchored);
			this.repaint();
		}
		catch (Exception ex)
		{
			
		}
	}

}
