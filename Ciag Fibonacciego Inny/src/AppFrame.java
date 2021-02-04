import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AppFrame extends JFrame implements ActionListener{

	public JTextField numer = new JTextField();
	public JButton oblicz = new JButton("oblicz");
	public JTextField wynik = new JTextField();
	
	public JPanel panel = new JPanel();
	
	
	
	
	AppFrame(){
		setTitle("Wyrazy?");
		setSize(500, 500);
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		initGUI();
		
		
		
	}
	
	
	public void initGUI() {
		
		this.setLayout(new BorderLayout());
		

		
		numer.setPreferredSize(new Dimension(400,100));
		oblicz.setPreferredSize(new Dimension(400,100));
		wynik.setPreferredSize(new Dimension(400,100));
		
		oblicz.addActionListener(this);
		
		panel.add(numer);
		panel.add(oblicz);
		panel.add(wynik);
		this.add(panel);
		
	}
	
	
	
	int x;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			this.x =Integer.parseInt(numer.getText());
			if (x<=0) {
				numer.setText("Podaj dodatni numer wyrazu");
				
			}else {
				 int x1 = 1;
				  int x2 = 1;
				  for (int i = 3; i <= x; i++) {
				    int temp = x1 + x2;
				    x1 = x2;
				    x2 = temp;
				  }
				wynik.setText(String.valueOf(x2-1));			
			}
		}
		catch(NumberFormatException q)
		{
			numer.setText("Brak numeru wyrazu");
		}
		
		
		 
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
