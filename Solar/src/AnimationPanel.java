import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AnimationPanel extends JPanel implements Runnable {

	private static final long serialVersionUID = 1L;

	private Image slonce, ziemia, mars, jowisz, neptun, ksiezyc, tlo;
	private Thread animThreat;
	private int x1 = 620, x2, x3, x4, x5, x6, x7, y1 = 300, y2, y3, y4, y5, y6, y7;
	private double p1 = 0.5, p2 = 0.4, p3 = 0.3, p4 = 0.2, p5 = 0.0, p6 = 0.1;

	private final int refreshRate = 20;
	private boolean isPaused = false, orbits = true;

	public AnimationPanel() throws IOException {

		setDoubleBuffered(true);
		setBackground(Color.BLACK);

		try {

			// circle0 = ImageIO.read(this.getClass().getResource("smiley.png"));
			slonce = ImageIO.read(this.getClass().getResource("slonce.png"));
			ziemia = ImageIO.read(this.getClass().getResource("ziemia.png"));
			mars = ImageIO.read(this.getClass().getResource("mars.png"));
			jowisz = ImageIO.read(this.getClass().getResource("jowisz.png"));
			neptun = ImageIO.read(this.getClass().getResource("neptune.png"));
			ksiezyc = ImageIO.read(this.getClass().getResource("ksiezyc.png"));
			tlo = ImageIO.read(this.getClass().getResource("sw.png"));
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		// x = 40;
		// y = 40;

		// w¹tek przeznaczony na animacjê
		// przekazujemy jakiœ obiekt (implementuj¹cy runnable) i za
		// pomoc¹ animThreat tworzymy i wywo³ujemy
		animThreat = new Thread(this);
		animThreat.start();
	}

	public void paint(Graphics g) {
		super.paint(g);

		Graphics2D g2 = (Graphics2D) g;
		g2.drawImage(tlo, x7, y7, this);
		g2.drawImage(slonce, x1, y1, this);
		g2.drawImage(ziemia, x2, y2, this);
		g2.drawImage(mars, x3, y3, this);
		g2.drawImage(jowisz, x4, y4, this);
		g2.drawImage(neptun, x5, y5, this);
		g2.drawImage(ksiezyc, x6, y6, this);

		g2.setColor(Color.GRAY);

		if (orbits) {
			g2.drawOval(x1 - 50, y1 - 50, 320, 320);
			g2.drawOval(x1 - 130, y1 - 130, 465, 465);
			g2.drawOval(x1 - 230, y1 - 230, 765, 765);
			g2.drawOval(x1 - 375, y1 - 375, 975, 975);
			g2.drawOval(x2 - 15, y2 - 15, 100, 100);
		}
		g.dispose();
	}

	public void movement() {

		// x = x_srodka + promien*cos();
		// y = y_srodka + promien*sin();

		// x = (this.getWidth() / 2) + 150 * Math.cos(r);
		// y = (this.getWidth() / 3) + 150 * Math.sin(r);

		p1 += 0.1 + p5;

		int x = 80;
		int y = x;

		x2 = (int) (x1 + x + 150 * Math.cos(p1));
		y2 = (int) (y1 + y + 150 * Math.sin(p1));

		p2 += 0.05 + p5;

		x3 = (int) (x1 + x + 220 * Math.cos(p2));
		y3 = (int) (y1 + y + 220 * Math.sin(p2));

		p3 += 0.03 + p5;

		x4 = (int) (x1 + x + 370 * Math.cos(p3));
		y4 = (int) (y1 + y + 370 * Math.sin(p3));

		p4 += 0.02 + p5;

		x5 = (int) (x1 + x + 500 * Math.cos(p4));
		y5 = (int) (y1 + y + 500 * Math.sin(p4));

		p6 += 0.01 + p5;

		x6 = (int) (x2 + 15 + 50 * Math.cos(p6));
		y6 = (int) (y2 + 15 + 50 * Math.sin(p6));
	}

	public void run() {

		long beforeTime, timeDiff, sleep;

		beforeTime = System.currentTimeMillis();

		while (true) {

			if (isPaused) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					System.out.println("interrupted");
				}
			}
			movement();
			repaint();

			timeDiff = System.currentTimeMillis() - beforeTime;
			sleep = refreshRate - timeDiff;

			if (sleep < 0)
				sleep = 2;
			try {
				Thread.sleep(sleep);
			} catch (InterruptedException e) {
				System.out.println("interrupted");
			}

			beforeTime = System.currentTimeMillis();
		}
	}

	public void switchAnimationState() {

		isPaused = !isPaused;
	}

	public void speed() {
		p5 += 0.01;
	}

	public void slower() {
		p5 -= 0.01;
	}

	public void orbit() {
		orbits = !orbits;
	}

	public void userSpeed()  {
	  try {
		 String getValue = AppFrame.speedCircle.getText();
	    	p5 = Double.parseDouble(getValue) + p5;
	  } catch (NumberFormatException e) {
		JOptionPane.showMessageDialog(null, "Wrong number");	}
	}

}