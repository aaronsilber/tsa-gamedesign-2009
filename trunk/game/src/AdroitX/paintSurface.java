/**
 * 
 */
package AdroitX;
import java.awt.Color;
import java.awt.Image;
import java.awt.KeyboardFocusManager;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.util.Date;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 * @author aj
 *
 */
public class paintSurface {
public static Sprite[] sprites = new Sprite[100]; //array of sprites to appear on the screen
public BufferedImage[] resources; //array of images - great for preloading
private Boolean devMode = true;
public static long startTime = System.currentTimeMillis();
public static HUD hud = new HUD();
public static JFrame window = new JFrame("DeWitt's Awesome Game"); //initialize window with title
	/**
	 * @param args
	 */
	void addSprite(Sprite sprite)
	{
		sprites[sprites.length+1] = sprite;
		window.add(sprite);
	}
	static public Sprite[] getSprites()
	{
		return sprites;
	}
	void loadMap(String mapFile)
	{
		//load elements
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set to exit when closed
		window.setSize(800, 600); //window size 800 x 600
		window.getContentPane().setBackground(Color.white); //blue background
		window.setResizable(false);
		keyboardEvents events = new keyboardEvents();
		window.add(paintSurface.hud); //temporary hard-coded sprite test
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(events);
		window.setVisible(true); //show to user
		window.repaint(); //request that components be redrawn
		for(;;)
		{
			//do everything necessary - infinite game loop.
			window.repaint();
		}
		}
		catch (Exception ex)
		{
			if (hud.getdevMode())
			{
				JOptionPane.showMessageDialog(window, "Booom! An exception has occurred! Information to relay to Aaron next:");
				JOptionPane.showMessageDialog(window, ex.getMessage() + " ||| " + ex.getStackTrace());
			}
		}
	}
	public void setDevMode(Boolean devMode) {
		this.devMode = devMode;
		hud.setdevMode(devMode);
	}
	public Boolean getDevMode() {
		return devMode;
	}

}
