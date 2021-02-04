import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Animation extends JPanel implements Runnable{
	
	private Thread animacja;
//	AppFrame d = new AppFrame();
	int x = 500;
	int y = 500;
	
	public Animation(){
		

		setBackground(Color.WHITE);
		setDoubleBuffered(true);
	
		animacja = new Thread(this);
		animacja.start();
		
		
		
		
		
	}
	
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D)g;
		
		g2.fillOval(x,y, 50,50);
		}


	@Override
	public void run() {
		
		
	}
	
	

}
