package en;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Animation extends JPanel implements Runnable {

	private static final long serialVersionUID = 1L;
	
	private int a, b, x, y;
	
	
	
	public void paint(Graphics g, int x, int y) {
		
		Graphics2D g2 = (Graphics2D) g;
		Graphics2D g3 = (Graphics2D) g;

		g2.setColor(Color.red);		
		g2.drawLine(x, y, x, y);
		
		g3.setColor(Color.black);
		g3.drawLine(240, 240, 240, 240);
	}
	
	public void drawFunction() {
		try {
			int x1,y1,i = 400;

			a = Integer.parseInt(Frame.aField.getText());
	    	b = Integer.parseInt(Frame.bField.getText());
	    	x = Integer.parseInt(Frame.xField.getText());
	    	b *=40;
	    	b*=-1;
	    	x=0;
	    	y=0;
	    			while (i >= 0) {
	    				y = a * i + b;
	    			//	paint(Graphics2D, x, y);
	    				x++;
	    				i--;
	    			}
	    	

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Only number");
		}
		
	}

	@Override
	public void run() {
		
		try {
			int x1,y1,i = 400;

			a = Integer.parseInt(Frame.aField.getText());
	    	b = Integer.parseInt(Frame.bField.getText());
	    	x = Integer.parseInt(Frame.xField.getText());
	    	b *=40;
	    	b*=-1;
	    	x=0;
	    	y=0;
	    			while (i >= 0) {
	    				y = a * i + b;
	    			//	paint(Graphics2D, x, y);
	    				x++;
	    				i--;
	    			}
	    	

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Only number");
		}
		
	}
	

	}


