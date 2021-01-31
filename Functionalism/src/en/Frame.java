package en;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Frame extends JFrame implements ActionListener {

	private double a, b, x, y;
	public static JTextField aField, bField, xField, yField;
	private JLabel functionLabel, aLabel, bLabel, xLabel, yLabel;
	private JButton countButton, drawButton;
	// Lineal function y = ax + b

	/*
	 * 
	 */
	public Frame() {

		setSize(400, 400);
		setTitle("Fuction");
		setLayout(null);

		functionLabel = new JLabel("Lineal function: f = ax + b");
		functionLabel.setBounds(120, 20, 150, 20);
		add(functionLabel);

		aField = new JTextField("");
		aField.setBounds(150, 50, 100, 20);
		add(aField);

		aLabel = new JLabel(" a:");
		aLabel.setBounds(50, 50, 100, 20);
		add(aLabel);

		bField = new JTextField("");
		bField.setBounds(150, 100, 100, 20);
		add(bField);

		bLabel = new JLabel(" b:");
		bLabel.setBounds(50, 100, 100, 20);
		add(bLabel);

		xField = new JTextField("");
		xField.setBounds(150, 150, 100, 20);
		add(xField);

		xLabel = new JLabel(" x :");
		xLabel.setBounds(50, 150, 100, 20);
		add(xLabel);

		yField = new JTextField("");
		yField.setBounds(150, 200, 100, 20);
		yField.setEditable(false);
		add(yField);

		yLabel = new JLabel(" y :");
		yLabel.setBounds(50, 200, 100, 20);
		add(yLabel);

		countButton = new JButton("Count");
		countButton.setBounds(70, 250, 100, 20);
		countButton.addActionListener(this);
		add(countButton);

		drawButton = new JButton("Draw");
		drawButton.setBounds(200, 250, 100, 20);
		drawButton.addActionListener(this);
		add(drawButton);

	}


	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == countButton) {
			try {
				int x = Integer.parseInt(xField.getText());
				int a = Integer.parseInt(aField.getText());
				int b = Integer.parseInt(bField.getText());

				int y = x * a + b;

				yField.setText(String.valueOf(y));
			} catch (NumberFormatException err) {
				if (xField.getText().isEmpty() || aField.getText().isEmpty() || bField.getText().isEmpty()) {

					JOptionPane.showMessageDialog(null, "Wprowadz dane");
				} else {
					JOptionPane.showMessageDialog(null, "Wprowadz liczby");
				}

			}

		}else if (e.getSource() == drawButton) {
			Animation.run();
		}
	}
}
