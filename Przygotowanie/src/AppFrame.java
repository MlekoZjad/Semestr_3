import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AppFrame extends JFrame implements ActionListener {
	
	public static final int HEIGHT = 50;
	public static final int WIDTH = 100;
	public Animation animacja;
	public JTextField size = new JTextField();
	public JTextField liczba = new JTextField();
	public JLabel rozmiar = new JLabel("Wprowadz promieñ: ");
	public JLabel ilosc = new JLabel("Wprowadz iloœæ kó³: ");
	public JPanel panel = new JPanel();	
	public int r,l;
	
	public JButton narysuj = new JButton("narysuj");
	
	
	AppFrame(){
		setTitle("Rysowanie kó³");
		setSize(1000,1000);
		setResizable(false);
		setLocationRelativeTo(null);
		
		initGUI();
		
		
		
	}
	
	
	public void initGUI() {
		animacja = new Animation();
		this.add(animacja,BorderLayout.CENTER);
		add(panel,BorderLayout.NORTH);
		panel.add(rozmiar);
		panel.add(size);
		size.setPreferredSize(new Dimension(100,50));
		panel.add(ilosc);
		panel.add(liczba);
		liczba.setPreferredSize(new Dimension(100,50));
		panel.add(narysuj);
		narysuj.addActionListener(this);
	}
	
	public void promien() {

		try {
			r = Integer.parseInt(size.getText());
			l = Integer.parseInt(liczba.getText());
			
		}catch(NumberFormatException x) {
			size.setText("Wprowadz promieñ");
			
		}
	}
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}
