package AdroitX;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyboardEvents extends Component implements KeyListener, ActionListener {
	private Boolean ctrlDown = false;
	private Boolean shiftDown = false;
	private Boolean dDown = false;
	
	public void keyboardEvents()
	{
		
	}

	@Override
	public void keyPressed(KeyEvent event) {
		// TODO Auto-generated method stub
		ctrlDown = event.isControlDown();
		shiftDown = event.isShiftDown();
		System.out.println(event.getKeyCode());
		//HUD.setdevMode(true);
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
