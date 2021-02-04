import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Kolos extends JFrame implements ActionListener {
	JTextField field, field1,field2;
	JButton przycisk;
	JLabel lb, lb1, plb, plb2, plb3;
	int n, k,  randomNum;
	public Kolos() {
		setSize(700,400);
		setTitle("Symulacja statystyczna");
		field = new JTextField("");
		field.setFont(new Font(Font.MONOSPACED, Font.ITALIC, 20));
		field1 = new JTextField("");
		field1.setFont(new Font(Font.MONOSPACED, Font.ITALIC, 20));
		field2 = new JTextField("");
		field2.setFont(new Font(Font.MONOSPACED, Font.ITALIC, 20));
		przycisk = new JButton("Start symulacji");
		przycisk.addActionListener(this);
		lb = new JLabel();
		lb1 = new JLabel("Odsetek wylosowanych jedynek:", SwingConstants.CENTER);
		plb = new JLabel("Wprowadz liczbê rzutów", SwingConstants.CENTER);
		plb2 = new JLabel("Wprowadz liczbê œcian kostki", SwingConstants.CENTER);
		plb3 = new JLabel();
		GridLayout gl = new GridLayout(3, 3);
		setLayout(gl);
		add(plb);
		add(plb2);
		add(plb3);
		add(field);
		add(field1);
		add(przycisk);
		add(lb);
		add(lb1);
		add(field2);
		
	}
	public static void main(String[] args) {
		Kolos kolo = new Kolos();
		kolo.setVisible(true);
		kolo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		kolo.setResizable(false);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object zrodlo = e.getSource();
		if (zrodlo == przycisk) {
			n = Integer.parseInt(field.getText());
			k = Integer.parseInt(field1.getText());
			Random ran = new Random();
			int count = 0;
			for (int i = 1; i <= n; i++) {
			randomNum = 1 + ran.nextInt((k-1)+1);
			if (randomNum == 1) {
				count++;
			}}
			float wynik = (float) count/n;
			field2.setText(String.valueOf(wynik));
		}
		
	}

}
