import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.xml.transform.Source;

// Stwórz GUI z 4 przyciskami - góra, dó³, prawo, lewo.
//Narysuj kwadrat (Graphics g), niech przy uruchomieniu programu nie porusza siê. 
//Po naciœniêciu danego przycisku niech porusza siê w dan¹ stronê. 
//Kiedy dojedzie do krawêdzi ramki zatrzymuje siê. 

public class AppFrame extends JFrame implements ActionListener {
	
	public JButton gora = new JButton("Góra");
	public JButton dol = new JButton("Dó³");
	public JButton prawa = new JButton("Prawa");
	public JButton lewa = new JButton("Lewa");
	
	public Animation animacja;
	
	
	
	
	
	public AppFrame() {
		setTitle("Kwadrat");
		setSize(500, 500);
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		initGUI();
		
		
	}
	
	
	public void initGUI() {
		
		this.setLayout(new BorderLayout());
		
		animacja = new Animation();
		this.add(animacja,BorderLayout.CENTER);
		
		
		this.add(gora,BorderLayout.NORTH);
		gora.addActionListener(this);
		this.add(dol,BorderLayout.SOUTH);
		dol.addActionListener(this);
		this.add(prawa,BorderLayout.EAST);
		prawa.addActionListener(this);
		this.add(lewa,BorderLayout.WEST);
		lewa.addActionListener(this);
		
		
		
		
		
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if (this.gora==source) {
		 animacja.ruchGora();
		}
		if (this.dol==source) {
			 animacja.ruchDol();
		}
		if (this.prawa==source) {
			 animacja.ruchPrawo();
		}
		if (this.lewa==source) {
			 animacja.ruchLewo();
			 
		}
		
	}

}
