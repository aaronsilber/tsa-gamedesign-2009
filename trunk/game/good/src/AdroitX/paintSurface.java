/**
 * 
 */
package AdroitX;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.KeyboardFocusManager;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 * @author aj
 *
 */
public class paintSurface {
public static int wantedFPS = 30;
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
	static void loadMap(String mapFile)
	{
		//load elements
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set to exit when closed
		window.setSize(800, 600); //window size 800 x 600
		window.getContentPane().setBackground(Color.white); //blue background
		window.setResizable(false);
		keyboardEvents events = new keyboardEvents();
		window.add(paintSurface.hud); //temporary hard-coded sprite test
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(events);
		window.setVisible(true); //show to user
		window.repaint(); //request that components be redrawn
		loadMap("level1.axmap");
		for(;;)
		{
			long stopTime = 0;
			long startTime = System.currentTimeMillis();
			stopTime = System.currentTimeMillis();
			long usedTime = stopTime - startTime;
			try {
				physics.refreshPhysics();
				gravity.refreshGravity();
				camera.optimize();
				window.repaint();
				long waitTime = 1000 / wantedFPS - usedTime;
				if (waitTime > 0)
				{
					Thread.sleep(1000 / wantedFPS - usedTime);
				}
				else
				{
					System.out.println("used too much time so i didn't wait...");
				}
			}
			catch (Exception ex)
			{
				if (hud.getdevMode())
				{
					JOptionPane.showMessageDialog(window, "Booom! An exception has occurred! Calling Aaron. Information to relay to him coming next:");
					callAaron();
					JOptionPane.showMessageDialog(window, ex.getMessage() + " ||| " + ex.getStackTrace());
				}
			}
		}
	}
	public static void callAaron()
	{
		try {
			Desktop.getDesktop().browse(new URI("callto://someoneelsebutmyself"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
