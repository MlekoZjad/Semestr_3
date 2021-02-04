package main;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Sort extends JFrame implements ActionListener {

	private JTextField tLiczba1, tLiczba2, tLiczba3;
	private JLabel lLiczba1, lLiczba2, lLiczba3;
	private JButton bSortuj;
	private int temp1, temp2, temp3;

	public Sort() {

		setSize(300, 300);
		setTitle("Sortowanie");
		setLayout(null);

		
		
		lLiczba1 = new JLabel("Liczba 1:");
		lLiczba1.setBounds(50, 150, 100, 20);

		lLiczba1.setPreferredSize(new Dimension(80, 24));
		add(lLiczba1);

		
		tLiczba1 = new JTextField("");
		tLiczba1.setBounds(150, 50, 100, 20);
		add(tLiczba1);

		
		tLiczba2 = new JTextField("");
		tLiczba2.setBounds(150, 100, 100, 20);
		add(tLiczba2);

		lLiczba2 = new JLabel("Liczba 2:");
		lLiczba2.setBounds(50, 100, 100, 20);
		add(lLiczba2);

		tLiczba3 = new JTextField("");
		tLiczba3.setBounds(150, 150, 100, 20);
		add(tLiczba3);

		lLiczba3 = new JLabel("Liczba 3:");
		lLiczba3.setBounds(50, 150, 100, 20);
		add(lLiczba3);

		bSortuj = new JButton("Sortuj");
		bSortuj.setBounds(100, 200, 100, 20);
		bSortuj.addActionListener(this);
		add(bSortuj);

	}

	public static void main(String[] args) {
		Sort aplikacja = new Sort();
		aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplikacja.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object Ÿród³o = e.getSource();
		try {

			temp1 = Integer.parseInt(tLiczba1.getText());
			temp2 = Integer.parseInt(tLiczba2.getText());
			temp3 = Integer.parseInt(tLiczba3.getText());

			if (Ÿród³o == bSortuj) {
				if (temp1 < temp2 && temp1 < temp3 && temp2 < temp3) {

					tLiczba1.setText(String.valueOf(temp1));
					tLiczba2.setText(String.valueOf(temp2));
					tLiczba3.setText(String.valueOf(temp3));
				} else if (temp2 < temp1 && temp2 < temp3 && temp1 < temp3) {

					tLiczba1.setText(String.valueOf(temp2));
					tLiczba2.setText(String.valueOf(temp1));
					tLiczba3.setText(String.valueOf(temp3));
				} else if (temp3 < temp1 && temp3 < temp2 && temp1 < temp2) {

					tLiczba1.setText(String.valueOf(temp3));
					tLiczba2.setText(String.valueOf(temp1));
					tLiczba3.setText(String.valueOf(temp2));
				} else if (temp2 < temp1 && temp2 < temp3 && temp3 < temp1) {

					tLiczba1.setText(String.valueOf(temp2));
					tLiczba2.setText(String.valueOf(temp3));
					tLiczba3.setText(String.valueOf(temp1));
				} else if (temp1 < temp2 && temp1 < temp3 && temp3 < temp2) {

					tLiczba1.setText(String.valueOf(temp1));
					tLiczba2.setText(String.valueOf(temp3));
					tLiczba3.setText(String.valueOf(temp2));
				} else if (temp3 < temp1 && temp3 < temp2 && temp2 < temp1) {

					tLiczba1.setText(String.valueOf(temp3));
					tLiczba2.setText(String.valueOf(temp2));
					tLiczba3.setText(String.valueOf(temp1));
				}
			}

		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Tylko liczby ca³kowite!");
		}

	}
}
