package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Frame extends JFrame implements ActionListener {

	JPanel panel = new JPanel();
	JLabel aLabel = new JLabel("a");
	JLabel bLabel = new JLabel("b");
	JLabel cLabel = new JLabel("c");
	JTextField aField, bField, cField;
	JButton countButton = new JButton("Oblicz brakujaca wartosc");

	double value;

	Frame() {
		setSize(300, 300);
		setTitle("Fuction");
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		aField = new JTextField("");
		aField.setBounds(100, 50, 100, 20);
		add(aField);

		aLabel = new JLabel(" a:");
		aLabel.setBounds(50, 50, 100, 20);
		add(aLabel);

		bField = new JTextField("");
		bField.setBounds(100, 100, 100, 20);
		add(bField);

		bLabel = new JLabel(" b:");
		bLabel.setBounds(50, 100, 100, 20);
		add(bLabel);

		cField = new JTextField("");
		cField.setBounds(100, 150, 100, 20);
		add(cField);

		cLabel = new JLabel(" c:");
		cLabel.setBounds(50, 150, 100, 20);
		add(cLabel);

		countButton = new JButton("Oblicz brakujaca wartosc");
		countButton.setBounds(50, 200, 200, 50);
		countButton.addActionListener(this);
		add(countButton);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == countButton) {

			if (cField.getText().isEmpty() || aField.getText().isEmpty() || bField.getText().isEmpty()) {

				if (aField.getText().equals("") && bField.getText().equals("")
						|| aField.getText().equals("") && cField.getText().equals("")
						|| bField.getText().equals("") && cField.getText().equals("")
						|| aField.getText().equals("") && bField.getText().equals("") && cField.getText().equals("")) {

					JOptionPane.showMessageDialog(null, "Wprowadz dwie liczby");

				} else {
					double y, z;

					if (aField.getText().equals("")) {
						try {
							y = Double.parseDouble(bField.getText());
							z = Double.parseDouble(cField.getText());
							this.value = Math.sqrt(Math.pow(z, 2) - Math.pow(y, 2));
							aField.setText(String.valueOf(value));

						} catch (NumberFormatException err) {

							JOptionPane.showMessageDialog(null, "Wprowadz liczby");
						}

					}

					if (bField.getText().equals("")) {
						try {

							y = Double.parseDouble(aField.getText());
							z = Double.parseDouble(cField.getText());
							this.value = Math.sqrt(Math.pow(z, 2) - Math.pow(y, 2));
							bField.setText(String.valueOf(value));
						} catch (NumberFormatException err) {

							JOptionPane.showMessageDialog(null, "Wprowadz liczby");
						}

					}
					if (cField.getText().equals("")) {
						try {

							y = Double.parseDouble(bField.getText());
							z = Double.parseDouble(aField.getText());
							this.value = Math.sqrt(Math.pow(z, 2) + Math.pow(y, 2));
							cField.setText(String.valueOf(value));
						} catch (NumberFormatException err) {

							JOptionPane.showMessageDialog(null, "Wprowadz liczby");
						}
					}
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Zostaw jedno puste pole");
				
			}
		}

	}

	}


