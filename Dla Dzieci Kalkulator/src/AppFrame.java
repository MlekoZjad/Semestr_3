import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*Kalkulator dla dzieci, 5 JTextfieldow, 2 JButtony "losuj" "sprawdz".
Trzeba bylo stworzyc GUI po kolei:
- przycisk losuj
- pole tekstowe w ktorym pojawiala sie wylosowana liczba a od 1 do 10.
- pole tekstowe w ktorym pojawiala sie wylosowane dzialanie "dodaj" lub "odejmij"
- pole tekstowe w ktorym pojawiala sie wylosowana liczba b od 1 do 10
- pole tekstowe w ktore dziecko wpisuje wynik, taki jak mu sie wydaje, na podstawie, tego co mu wylosowalo
- przycisk sprawdz
- pole tekstowe w ktorym pojawialo sie "Brawo!" jesli dobrze wpisal wynik lub "Sprobuj jeszcze raz" jak zle wpisal wynik.

ogolnie to trzeba bylo wylosowac te 2 liczby i to czy bedzie "dodaj" czy "odejmij" i mialy sie pojawiac w polach tekstowych, dziecko mialo wpisac odpowiedz jaki bedzie wynik dzialania, 
a w ostatnim polu trzeba bylo dac informacje zwrotna, czy wszystko zrobi³ ok.
*/
public class AppFrame extends JFrame implements ActionListener {
	
	String q;
	int x,y,w;
	
	public JButton losuj = new JButton("losuj");
	public JButton sprawdz = new JButton("sprawdz");
	public JTextField a = new JTextField();
	public JTextField b = new JTextField();
	public JTextField dzialanie = new JTextField();
	public JTextField wynik = new JTextField("Wynik");
	public JLabel tekst = new JLabel();
	public JLabel brawo = new JLabel("Brawo!");
	public JLabel jeszczeRaz = new JLabel("Spróbuj jeszcze raz");
	public JPanel panel = new JPanel();
	
	
	
	public AppFrame(){
		
		
		
		setTitle("Kalkulator dla dzieci");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(a);	
		this.add(dzialanie);
		this.add(b);
		this.add(wynik);
		this.add(tekst);
		this.add(losuj);
		this.add(sprawdz);	
		
		
		
		
		
		this.losuj.addActionListener(this);
		this.sprawdz.addActionListener(this);
		
		
		
		

		GridLayout gl = new GridLayout(3,3);
		setLayout(gl);
		
		add(panel);
	
		
		
	}	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		
		if (source==losuj) {
			double x = Math.random();
			if(x<=0.5) {
				this.q = "Dodaj";
						
			}else {
				this.q = "Odejmij";
			}
			
			this.a.setText(String.valueOf((int)(Math.random()*10)));
			this.b.setText(String.valueOf((int)(Math.random()*10)));
			this.dzialanie.setText(q);
		}
		
		if(source==sprawdz) {
			
			this.add(jeszczeRaz);
			
			if(this.q=="Dodaj") {
				try {
					
				x=Integer.parseInt(a.getText());
				y=Integer.parseInt(b.getText());
				w=Integer.parseInt(wynik.getText());
					
				}catch(NumberFormatException q){
					
					this.add(jeszczeRaz);
				}
					
				}
				
				if(this.w==x+y) {
					this.add(brawo);
				
				}else
				{
					this.add(jeszczeRaz);
				}
			}else {
				if(w==x-y) {
					this.add(brawo);
				}else {
					
					this.add(jeszczeRaz);
				
				
				
				}

				
				
			}
			
		
	}
		
}
	
