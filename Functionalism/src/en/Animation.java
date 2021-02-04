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
	final int scale = 4;
	int OX;
	int OY;
	int linex = 100, liney = 150;
	boolean pause = false;
	public int refreshRate = 10;
	Thread animThread;
	
	public Animation() {
		setBackground(Color.white);
		setDoubleBuffered(true);
		
		
		animThread = new Thread(this);
		animThread.start();
	}
	
	public void paint(Graphics g) {
		super.paint(g);

		int OX = this.getWidth() / 2;
		int OY = this.getHeight() / 2;
	

		Graphics2D g1 = (Graphics2D) g;

		g1.setStroke(new BasicStroke(2));
		g1.setColor(Color.black);
		g1.drawLine(0, OY, OX * 2, OY);
		g1.drawLine(OX, 0, OX, OY * 2);
		g1.drawString("0", OX - 7, OY + 13);
	

		
	}

	public void movement() {

		if(pause== false) {
		for (int i = 0; i < 100; i++) {
			linex +=1;
			liney +=30;

			Graphics2D g2 = null; 
			Graphics2D p = null;

			g2.setColor(Color.red);
			g2.drawLine(this.getWidth()/2, this.getHeight()/2,0,liney);
			
			p.setColor(Color.yellow);
			p.fillOval(linex, liney,15,15);	
		}
		repaint();
	}
	}		
	@Override
	public void run() {
		
		movement();
	
	}

	
}
