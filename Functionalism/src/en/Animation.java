package en;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Animation extends JPanel implements Runnable {

	private static final long serialVersionUID = 1L;

	// private int a, b, x, y;
	final double scale = 3.0;
	
	public void paint(Graphics g) {
		
	/*	try {

			
			int x = Integer.parseInt(Frame.xField.getText());
			int a = Integer.parseInt(Frame.aField.getText());
			int b = Integer.parseInt(Frame.bField.getText());

			int y = x * a + b;
			//int OA = (y - b) / a;
			//int OB = y;
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Only number");
		}
		*/
		super.paint(g);

		int OX = this.getWidth() / 2;
		int OY = this.getHeight() / 2;
		/*
		int valueF = Integer.parseInt(Frame.yField.getText());
		int valueA = Integer.parseInt(Frame.aField.getText());
		int valueB = Integer.parseInt(Frame.bField.getText());
		int valueX = Integer.parseInt(Frame.xField.getText());
*/

		Graphics2D g1 = (Graphics2D) g;
		Graphics2D g2 = (Graphics2D) g;
		Graphics2D p = (Graphics2D) g;

		g1.setStroke(new BasicStroke(2));
		g1.setColor(Color.black);
		g1.drawLine(0, OY, OX * 2, OY);
		g1.drawLine(OX, 0, OX, OY * 2);
		g1.drawString("0", OX - 7, OY + 13);

		
		
		g2.setColor(Color.red);
		//g2.drawLine(valueX, valueF-valueB/2, OX, valueA);

	//	p.drawOval(y-20, x+20, 10, 10);
		p.setColor(Color.yellow);
		
		
	}

	@Override
	public void run() {
			// TODO Auto-generated method stub
	
	}


		

}
