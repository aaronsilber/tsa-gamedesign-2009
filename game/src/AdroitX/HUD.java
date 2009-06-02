package AdroitX;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;

public class HUD extends Component {
private static int fps = 0;
private static Boolean devMode = false;
private Font huge = new Font("sans-serif", 24, Font.PLAIN);
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.drawString(fps + " fps", 10, 20);
		if (devMode == true)
		{
			g.drawString("devMode enabled! stats:", 10, 35);
			g.drawString("[ctrl]+[g] gravity: " + physics.getGravityEnabled() + ", " + physics.getGravityForce() + " g" , 10, 50);
			g.drawString("[ctrl]+[c] collisions: " + physics.getCollisionsEnabled(), 10, 65);
			g.drawString("total sprite count: " + paintSurface.window.getComponentCount(), 10, 80);
			g.drawString("camera position: " + camera.getCameraPosition().toString(), 10, 95);
			g.drawString("uptime: " + Long.toString(System.currentTimeMillis() - paintSurface.startTime ), 10, 110);
			g.drawString("[ctrl]+[p] physics enabled: " + physics.getEnabled(), 10, 125);
			g.drawString("Problems? call 315-849-3324", 10, 140);
		}
    }
	public static void setFps(int fps) {
		HUD.fps = fps;
	}
	public static int getFps() {
		return fps;
	}
	public void setdevMode(Boolean devMode) {
		HUD.devMode = devMode;
		
	}
	public Boolean getdevMode() {
		return devMode;
	}
}
