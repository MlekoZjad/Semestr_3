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
/*Funkcjonalno�� aplikacji
Zaimplementuj aplikacj� wyliczaj�c� z twierdzenia Pitagorasa d�ugo�� boku tr�jk�ta prostok�tnego
1. Aplikacja powinna zawiera� GUI, na kt�ry sk�adaj� si� kontrolki widoczne w nast�puj�cej kolejno�ci:
a. pole tekstowe �a� (JTextField) - wy�wietlaj�ce d�ugo�� przyprostok�tnej a
b. pole tekstowe �b� (JTextField) - wy�wietlaj�ce d�ugo�� przyprostok�tnej b
c. pole tekstowe �c� (JTextField) - wy�wietlaj�ce d�ugo�� przeciwprostok�tnej c
d. przycisk (JButton) �Wylicz�
2. U�ytkownik wprowadza dok�adnie dwie d�ugo�ci (np. a i b lub a i c lub b i c) a nast�pnie klika �Wylicz�. Naci�ni�cie przycisku �Wylicz� powinno:
a. We wszystkich polach wy�wietli� komunikat �Podaj dwie d�ugo�ci�, je�eli u�ytkownik nie poda� �adnej d�ugo�ci, poda� jedn� d�ugo�� lub poda� trzy d�ugo�ci.
b. W jednym pustym polu (a, b lub c) wy�wietli� brakuj�c� d�ugo�� (przyprostok�tnej lub przeciwprostok�tnej) wyliczon� z twierdzenia Pitagorasa, je�eli u�ytkownik poda� dwie pozosta�e d�ugo�ci.*/

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
		setTitle("Tr�jk�t");
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
				
				a.setText("Podaj dwie dlugo�ci");
				b.setText("Podaj dwie dlugo�ci");
				c.setText("Podaj dwie dlugo�ci");
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
