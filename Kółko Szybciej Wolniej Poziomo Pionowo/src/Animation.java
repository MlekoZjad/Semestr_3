import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Animation extends JPanel implements Runnable {
	

	private static final long serialVersionUID = 1L;
	
	private boolean isPaused = false;
	private Thread animacja;
	public int refreshRate = 10;
	
	public boolean czyPrawo = true;
	public boolean poziomoo=true;
	

	
	public Animation() {
	
		setBackground(Color.WHITE);
		setDoubleBuffered(true);
	
		animacja = new Thread(this);
		animacja.start();
		
		
	}

	
	int x=50;
	int y=50;




	public void paint(Graphics g) {
	super.paint(g);
	Graphics2D g2 = (Graphics2D)g;
	
	g2.drawOval(x,y, 50,50);
	}
	
	

	

	public void movement() {
		if(poziomoo==true) {
			if(x==getWidth()) {
				czyPrawo=!czyPrawo;
			}
			if(x==0) {
				czyPrawo=!czyPrawo;
			}
			if (czyPrawo==true) {

				x+=1;
			}
			if(czyPrawo==false){
				x-=1;
			}
		}
		
		if(poziomoo==false) {
			if(y==getWidth()+50) {
				czyPrawo=!czyPrawo;
			}
			if(y==0) {
				czyPrawo=!czyPrawo;
			}
			if (czyPrawo==true) {	
				y+=1;
			}
			if(czyPrawo==false){
				y-=1;
			}
		}
	}


	@Override
	public void run() {
		while (true) {
			if (!isPaused)
			{
				movement();
				repaint();
			}
			try {
				Thread.sleep(refreshRate);
				
			}catch (InterruptedException e) {
				System.out.println("interrupted");
				
			}
			
		}
		
	}
	
	
	
}
