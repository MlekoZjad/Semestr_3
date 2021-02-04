
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ramka extends JFrame implements ActionListener {
	public JButton przycisk;
	public JButton przycisk2;
	public JButton przycisk3;
	private JButton przycisk4;
	public GridLayout panel;
	public JTextField poleTekstowe;
	public JTextField poleTekstowe1;
	public JTextField poleTekstowe2;
	public JLabel etykieta1;
	public JLabel etykieta2;
	public JLabel etykieta3;
	private JPanel mojPanel = new JPanel();

	public Ramka() {

		setTitle("Liczby");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		wypelnijRamke();

	}

	public void wypelnijRamke() {

		GridLayout layout = new GridLayout(6, 2);
		setLayout(layout);

		etykieta1 = new JLabel("liczba 1");
		add(etykieta1);
		poleTekstowe = new JTextField("podaj 1 liczbe");
		add(poleTekstowe);
		etykieta2 = new JLabel("liczba 2");
		add(etykieta2);
		poleTekstowe1 = new JTextField("podaj 2 liczbe");
		add(poleTekstowe1);
		przycisk = new JButton("dodaj");
		add(przycisk);
		przycisk2 = new JButton("odejmij");
		add(przycisk2);
		przycisk3 = new JButton("pomnó¿");
		add(przycisk3);
		przycisk4 = new JButton("podziel");
		add(przycisk4);
		etykieta3 = new JLabel("Wynik:");
		add(etykieta3);

		poleTekstowe2 = new JTextField();
		add(poleTekstowe2);
		add(mojPanel);

		przycisk.addActionListener(this);
		przycisk2.addActionListener(this);
		przycisk3.addActionListener(this);
		przycisk4.addActionListener(this);

		// pack();
	}

	public void actionPerformed(ActionEvent e) {

		int a = Integer.valueOf(poleTekstowe.getText());
		int b = Integer.valueOf(poleTekstowe1.getText());

		Object zrodlo = e.getSource();
		if (zrodlo == przycisk) {
			int r = a + b;
			poleTekstowe2.setText(String.valueOf(r));

		}
		if (zrodlo == przycisk2) {
			int r = a - b;
			poleTekstowe2.setText(String.valueOf(r));
		}
		if (zrodlo == przycisk3) {
			int r = a * b;
			poleTekstowe2.setText(String.valueOf(r));
		}
		if (zrodlo == przycisk4) {
			double r = (double) a / b;
			poleTekstowe2.setText(String.valueOf(r));

		}
	}

}
