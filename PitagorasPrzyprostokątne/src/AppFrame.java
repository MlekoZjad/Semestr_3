import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/*Funkcjonalnoœæ aplikacji
Zaimplementuj aplikacjê wyliczaj¹c¹ z twierdzenia Pitagorasa d³ugoœæ boku trójk¹ta prostok¹tnego
1. Aplikacja powinna zawieraæ GUI, na który sk³adaj¹ siê kontrolki widoczne w nastêpuj¹cej kolejnoœci:
a. pole tekstowe „a” (JTextField) - wyœwietlaj¹ce d³ugoœæ przyprostok¹tnej a
b. pole tekstowe „b” (JTextField) - wyœwietlaj¹ce d³ugoœæ przyprostok¹tnej b
c. pole tekstowe „c” (JTextField) - wyœwietlaj¹ce d³ugoœæ przeciwprostok¹tnej c
d. przycisk (JButton) „Wylicz”
2. U¿ytkownik wprowadza dok³adnie dwie d³ugoœci (np. a i b lub a i c lub b i c) a nastêpnie klika „Wylicz”. Naciœniêcie przycisku „Wylicz” powinno:
a. We wszystkich polach wyœwietliæ komunikat „Podaj dwie d³ugoœci”, je¿eli u¿ytkownik nie poda³ ¿adnej d³ugoœci, poda³ jedn¹ d³ugoœæ lub poda³ trzy d³ugoœci.
b. W jednym pustym polu (a, b lub c) wyœwietliæ brakuj¹c¹ d³ugoœæ (przyprostok¹tnej lub przeciwprostok¹tnej) wyliczon¹ z twierdzenia Pitagorasa, je¿eli u¿ytkownik poda³ dwie pozosta³e d³ugoœci.*/

public class AppFrame extends JFrame implements ActionListener {
	
	//double x,y,z;
	double e;
	int r;
	
	


	
	JPanel panel = new JPanel(); 
	JLabel aa = new JLabel("a");
	JLabel bb = new JLabel("b");
	JLabel cc = new JLabel("c");
	JLabel xx = new JLabel("pusteee");
	

	public JTextField a = new JTextField();
	public JTextField b = new JTextField();
	public JTextField c = new JTextField();
	public JButton wylicz = new JButton("Wylicz");
	
	

	
	
	
	AppFrame(){
		setTitle("Trójk¹t");
		setSize(400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(aa);
		add(bb);
		add(cc);
		add(a);
		add(b);
		add(c);
		add(wylicz);
		this.wylicz.addActionListener(this);
		
		GridLayout gl = new GridLayout(3,3);
		setLayout(gl);
				
		add(panel);
	}

	@Override
	public void actionPerformed(ActionEvent x) {
		
		Object source = x.getSource();
		
		if (source == wylicz) {
			
			if (a.getText().equals("")&&b.getText().equals("")||a.getText().equals("")&&c.getText().equals("")||b.getText().equals("")&&c.getText().equals("")||a.getText().equals("")&&b.getText().equals("")&&c.getText().equals("")) {
				
				a.setText("Podaj dwie dlugoœci");
				b.setText("Podaj dwie dlugoœci");
				c.setText("Podaj dwie dlugoœci");
			}else {
				double y,z;
				
				
				if(a.getText().equals("")){
					y = Double.parseDouble(b.getText());
					z = Double.parseDouble(c.getText());
				
					
					this.e=Math.sqrt(Math.pow(z, 2)- Math.pow(y,2));
					a.setText(String.valueOf(e));
						
				}
				if(b.getText().equals("")){
					y = Double.parseDouble(a.getText());
					z = Double.parseDouble(c.getText());
				
					
					this.e=Math.sqrt(Math.pow(z, 2)- Math.pow(y,2));
					b.setText(String.valueOf(e));
				}
				
				if(c.getText().equals("")){
					y = Double.parseDouble(b.getText());
					z = Double.parseDouble(a.getText());
				
					
					this.e=Math.sqrt(Math.pow(z, 2)+ Math.pow(y,2));
					c.setText(String.valueOf(e));
					
				}
					
				

				/*x = Integer.parseInt(a.getText());
				y = Integer.parseInt(b.getText());
				z = Integer.parseInt(c.getText());
				
				*/
			}
			
			
			
		}
		
		
		
		
	}

}
