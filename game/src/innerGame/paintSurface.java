/**
 * 
 */
package innerGame;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Point;

import javax.swing.*;
/**
 * @author aj
 *
 */
public class paintSurface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame("DeWitt Awesome Game");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(800, 600);
		window.getContentPane().setBackground(Color.white);
		window.add(new Sprite("C:\\Users\\aj\\Documents\\Downloads\\donuts.jpg", new Point(0,0), true));
		window.setVisible(true);
		window.repaint();
	}

}
