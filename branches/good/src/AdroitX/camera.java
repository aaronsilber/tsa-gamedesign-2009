package AdroitX;

import java.awt.Point;

public class camera {
private static Point cameraPosition = new Point(0,0);
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8226309802869009512L;

	public static void optimize()
	{
		//hide sprites off screen
	}

	public static void setCameraPosition(Point cameraPosition) {
		camera.cameraPosition = cameraPosition;
	}

	public static Point getCameraPosition() {
		return cameraPosition;
	}
}
