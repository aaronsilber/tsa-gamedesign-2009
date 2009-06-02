package AdroitX;

import java.awt.Component;
import java.awt.Point;

public class camera extends Component {
private static Point cameraPosition = new Point(0,0);
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8226309802869009512L;

	void optimize()
	{
		
	}

	public static void setCameraPosition(Point cameraPosition) {
		camera.cameraPosition = cameraPosition;
	}

	public static Point getCameraPosition() {
		return cameraPosition;
	}
}
