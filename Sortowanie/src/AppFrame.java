import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.spi.NumberFormatProvider;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AppFrame extends JFrame implements ActionListener {

	public JTextField pierwsza = new JTextField();
	public JTextField druga = new JTextField();
	public JTextField trzecia = new JTextField();
	public JLabel jeden = new JLabel("Pierwsza liczba");
	public JLabel dwa = new JLabel("Druga liczba");
	public JLabel trzy = new JLabel("Trzecia liczba");

	public JButton sortuj = new JButton("sortuj");
	JPanel panel = new JPanel();
	JLabel label = new JLabel();

	int x;
	int y;
	int z;


	AppFrame() {


		setTitle("Liczby");
		setSize(400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.add(jeden);
		this.add(dwa);
		this.add(trzy);
		this.add(pierwsza);
		this.add(druga);
		this.add(trzecia);
		this.add(sortuj);
		this.sortuj.addActionListener(this);


		GridLayout gl = new GridLayout(3, 3);
		setLayout(gl);

	
		
		add(panel);

	}

	public void sortowanie() {
		
		try {
			x = Integer.parseInt(pierwsza.getText());
			y = Integer.parseInt(druga.getText());
			z = Integer.parseInt(trzecia.getText());

		} catch (NumberFormatException x) {

			label.setText("Wprowadz liczby");

		}
		if (x < y && x < z &&y  <  z) {

			pierwsza.setText(String.valueOf(x));
			druga.setText(String.valueOf(y));
			trzecia.setText(String.valueOf(z));
		} else if (y < x && y < z && x < z) {

			pierwsza.setText(String.valueOf(y));
			druga.setText(String.valueOf(x));
			trzecia.setText(String.valueOf(z));
		} else if (z < x && z < y && x < y) {

			pierwsza.setText(String.valueOf(z));
			druga.setText(String.valueOf(x));
			trzecia.setText(String.valueOf(y));
		} else if (y < x && y < z && z < x) {

			pierwsza.setText(String.valueOf(y));
			druga.setText(String.valueOf(z));
			trzecia.setText(String.valueOf(x));
		} else if (x < y && x < z && z < y) {

			pierwsza.setText(String.valueOf(x));
			druga.setText(String.valueOf(z));
			trzecia.setText(String.valueOf(y));
		} else if (z < x && z < y && y < x) {

			pierwsza.setText(String.valueOf(z));
			druga.setText(String.valueOf(y));
			trzecia.setText(String.valueOf(x));
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();

		if (source == sortuj) {

			this.sortowanie();
		}

	}

}
