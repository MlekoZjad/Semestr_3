import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class Kolokwium extends JFrame implements ActionListener{
	JTextField t1, t2, t3;
	JButton p1,p2;
	JLabel l1,l2,l3;
	int liczba,a;
	int count = 0;
	
	
	
	
	
	public Kolokwium() {
		setSize(500,500);
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		l1 = new JLabel("Liczba zgadnij");
		l2 = new JLabel("Wpisz liczbe");
		l3 = new JLabel("Wynik");
		p1 = new JButton("Start");
		p1.addActionListener(this);
		p2 = new JButton("Losuj");
		p2.addActionListener(this);
		GridLayout gl = new GridLayout(3,3);
		setLayout(gl);
		add(l1);
		add(l2);
		add(l3);
		add(t1);
		add(t2);
		add(t3);
		add(p1);
		add(p2);
		
	}

	public static void main(String[] args) {
	Kolokwium k = new Kolokwium();
	k.setVisible(true);
k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	

	}
@Override
public void actionPerformed(ActionEvent e) {
	
	Object zrodlo = e.getSource();
	
	
	
	if (zrodlo == p1) {
		Random r = new Random();
		liczba = 1+ r.nextInt((100)+1);
		
	}
		if (zrodlo == p2) {
			a = Integer.parseInt(t2.getText());
			if (liczba<a) {
				t3.setText("Za duza");
				count++;
				
				
			}
			else if (liczba>a) {
				t3.setText("Za mala");
				count++;
				
			}
			
			else if (liczba == a) {
				count++;
				t3.setText("Brawo! zgad³es w " + String.valueOf(count) + " probach");
				
				
			}
			
			
			
			
			
		
		
		
		
	}
	
}
}
