package AdroitX;

import java.awt.Component;
import java.awt.Point;

public class gravity extends Component {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7318788957739210667L;

	void testGravity()
	{
		Sprite[] sprites = AdroitX.paintSurface.getSprites();
		for (int i=0;i<sprites.length;i++)
		{ //enumerate sprites
			if (sprites[i].getAnchored() == false) //make sure it can move
			{
				if(paintSurface.window.getComponentAt(new Point((int) (sprites[i].getSize().getWidth() / 2 + sprites[i].getLocation().x), sprites[i].getLocation().y + sprites[i].getSize().height)) != null)
				{
					applyGravity(sprites[i]);
				}
			}
		}
	}
	void applyGravity(Sprite sprite)
	{
		//add acceleration and change location
	}
}
