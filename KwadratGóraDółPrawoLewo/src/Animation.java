import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

// Stwórz GUI z 4 przyciskami - góra, dó³, prawo, lewo.
//Narysuj kwadrat (Graphics g), niech przy uruchomieniu programu nie porusza siê. 
//Po naciœniêciu danego przycisku niech porusza siê w dan¹ stronê. 
//Kiedy dojedzie do krawêdzi ramki zatrzymuje siê. 
public class Animation extends JPanel implements Runnable {
	
	
	private boolean isPaused = true;
	private Thread animacja;
	private int refreshRate = 10;
	
	public Animation() {
		
		animacja = new Thread(this);
		animacja.start();
		
	}
	
	int x=50;
	int y=50;

	
	
public void paint(Graphics g) {
	super.paint(g);
	Graphics2D g2 = (Graphics2D)g;
	
	g2.fillRect(x, y, 50,50);
}

int k;
int j;

public void movement() {
	
	
	x+=k;
	y+=j;
	
	if (x>=this.getWidth()-50||x==0||y>=this.getWidth()+10||y==0) {
		isPaused = !isPaused;
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


public void ruchGora() {
	isPaused = !isPaused;
	k=0;
	j=-1;
}

public void ruchDol() {
	isPaused = !isPaused;
	k = 0;
	j = 1;
	
}
public void ruchLewo() {
	isPaused = !isPaused;
	k=-1;
	j=0;
}
public void ruchPrawo() {
	isPaused = !isPaused;
	k=1;
	j=0;
}
}
