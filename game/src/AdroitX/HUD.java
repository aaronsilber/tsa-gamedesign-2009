package AdroitX;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;

public class HUD extends Component {
private static int fps = 0;
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.drawString(fps + " fps", 10, 20);
    }
	public static void setFps(int fps) {
		HUD.fps = fps;
	}
	public static int getFps() {
		return fps;
	}
}
