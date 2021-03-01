

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Frame extends JFrame implements ActionListener {

	double a, t, s;
	double valueS;
	public JTextField aField, tField, sField;
	private JLabel RoadLabel, aLabel, tLabel, sLabel;
	private JButton countButton;
	

	public Frame() throws IOException {

		setSize(400, 400);
		setTitle("Oblicz droge");
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		RoadLabel = new JLabel("Obliczanie drogi s=at^2/2");
		RoadLabel.setBounds(120, 20, 150, 20);
		add(RoadLabel);

		aField = new JTextField("");
		aField.setBounds(150, 50, 100, 20);
		add(aField);

		aLabel = new JLabel(" a:");
		aLabel.setBounds(50, 50, 100, 20);
		add(aLabel);

		tField = new JTextField("");
		tField.setBounds(150, 100, 100, 20);
		add(tField);

		tLabel = new JLabel(" t:");
		tLabel.setBounds(50, 100, 100, 20);
		add(tLabel);

		
		sField = new JTextField("");
		sField.setBounds(150, 150, 100, 20);
		sField.setEditable(false);
		add(sField);

		sLabel = new JLabel(" y :");
		sLabel.setBounds(50, 150, 100, 20);
		add(sLabel);
			

		countButton = new JButton("Count");
		countButton.setBounds(100, 250, 100, 20);
		countButton.addActionListener(this);
		add(countButton);


	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == countButton) {
			try {
				double a = Double.parseDouble(aField.getText());
				double t = Double.parseDouble(tField.getText());

				double s = (double) ((a*Math.pow(t,2))/2);
				double valueS= s;
				sField.setText(String.valueOf(s));

			} catch (NumberFormatException err) {
				if (aField.getText().isEmpty() || tField.getText().isEmpty()) {

					JOptionPane.showMessageDialog(null, "Wprowadz dane");
				} else  {
					JOptionPane.showMessageDialog(null, "Wprowadz wylacznie liczby");
				}

			}

		}
	}
}
