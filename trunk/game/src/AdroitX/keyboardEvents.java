package AdroitX;

import java.awt.event.KeyEvent;

public class keyboardEvents implements java.awt.KeyEventDispatcher {
	private static long lastHit = 0;
	@Override
	public boolean dispatchKeyEvent(KeyEvent event) {
		// TODO Auto-generated method stub
		System.out.println("keyboard event fired:");
		System.out.println(event.getKeyCode()); //68 is "d"
		if (System.currentTimeMillis() - lastHit > 300)
		{
		if (event.isControlDown() && event.isShiftDown() && event.getKeyCode() == 68)
		{
			paintSurface.hud.setdevMode(!paintSurface.hud.getdevMode()); //flip it, man!
		}
		if (paintSurface.hud.getdevMode())
		{
			if (event.isControlDown())
			{
				if (event.getKeyCode() == 67)
				{
					physics.setCollisionsEnabled(!physics.getCollisionsEnabled());
				}
				if (event.getKeyCode() == 80)
				{
					physics.setEnabled(!physics.getEnabled());
					System.out.println(physics.getEnabled());
				}
				if (event.getKeyCode() == 71)
				{
					physics.setGravityEnabled(!physics.getGravityEnabled());
				}
			}
		}
		}
		if (event.getKeyCode() > 20)
		{
			lastHit = System.currentTimeMillis();
		}
		return true;
	}
}
