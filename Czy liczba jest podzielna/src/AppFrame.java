import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
/*1. Przycisk Start po którym w Polu tekstowym 1 i Polu tekstowym 2 pojawia³a siê liczba od 1 do 100.
2. Pole tekstowe 1
3. Pole tekstowe 2
4. Przycisk S¹ podzielne bez reszty(sprawdza³ czy liczby w poprzednich polach tekstowych dziel¹ siê przez siebie bez reszty).
5. Przycisk Nie s¹ podzielne bez reszty(sprawdza³ czy liczby w poprzednich polach tekstowych NIE dziel¹ siê przez siebie bez reszty)
6. Pole tekstowe wynik, sprawdzaj¹ce czy u¿ytkownik nacisn¹³ odpowiedni przycisk. */


public class AppFrame extends JFrame implements ActionListener {

	
	public JTextField pierwsza = new JTextField();
	public JTextField druga = new JTextField();
	public JTextField wynik = new JTextField();
	public JButton podzielne = new JButton("S¹ podzielne");
	public JButton niePodzielne = new JButton("NIE s¹ podzielne");
	public JPanel panel = new JPanel();
	
	AppFrame(){
		setTitle("Czy liczby s¹ podzielne");
		setSize(500, 500);
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		initGUI();
	}
	int x,y;
	
	public void initGUI() {
		

		this.setLayout(new BorderLayout());
		

		
		this.pierwsza.setPreferredSize(new Dimension(200,100));
		this.druga.setPreferredSize(new Dimension(200,100));
		podzielne.setPreferredSize(new Dimension(200,100));
		niePodzielne.setPreferredSize(new Dimension(200,100));
		wynik.setPreferredSize(new Dimension(400,100));
		
		
		podzielne.addActionListener(this);
		niePodzielne.addActionListener(this);
		
		panel.add(pierwsza);
		panel.add(druga);
		panel.add(podzielne);
		panel.add(niePodzielne);
		panel.add(wynik);
		
		this.x = (int)(Math.random()*100);
		pierwsza.setText(String.valueOf(x));
				
		this.y = (int)(Math.random()*100);
		druga.setText(String.valueOf(y));
		
		this.add(panel);
	
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		
		if(source==podzielne) {
			if (x%y==0) {
				wynik.setText("Dobrze");
			}else {
				wynik.setText("ZLE");
			}
		}
		if(source ==niePodzielne) {
			if(x%y==0) {
				wynik.setText("ZLE");
				
			}else{
				wynik.setText("Dobrze");
			}
		}
		
	}

}
