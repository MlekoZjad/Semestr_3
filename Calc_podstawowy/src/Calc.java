import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Calc extends JFrame implements ActionListener {
	
	JButton addButton,subButton,mulButton,divButton;
	JLabel label_num1, label_num2, label_results;
	double num1=0,num2=0,result=0;
	char operator;
	JTextField textfield_num1, textfield_num2, textfield_results;
	
	Calc(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setLayout(null);
		
		addButton = new JButton("Dodaj");
		addButton.setBounds(50,150,150,50);
		addButton.addActionListener(this);
		addButton.setFocusable(false);
		addButton.setBackground(Color.white);
		

		
		subButton = new JButton("Odejmin");
		subButton.setBounds(220,150,150,50);
		subButton.addActionListener(this);
		subButton.setFocusable(false);
		subButton.setBackground(Color.white);
		
		mulButton = new JButton("Pomnó¿");
		mulButton.setBounds(50,220,150,50);
		mulButton.addActionListener(this);
		mulButton.setFocusable(false);
		mulButton.setBackground(Color.white);


		divButton = new JButton("Podziel");
		divButton.setBounds(220,220,150,50);
		divButton.addActionListener(this);
		divButton.setFocusable(false);
		divButton.setBackground(Color.white);
		
		
		label_num1 = new JLabel();
		label_num1.setText("Liczba 1");
		label_num1.setBounds(150, 25, 150, 25);
		
		label_num2 = new JLabel();
		label_num2.setText("Liczba 2");
		label_num2.setBounds(150, 75, 150, 25);
		
		textfield_num1 = new JTextField();
		textfield_num1.setBounds(250, 25, 150, 25);
		textfield_num1.setEditable(true);
		
		textfield_num2 = new JTextField();
		textfield_num2.setBounds(250, 75, 150, 25);
		textfield_num2.setEditable(true);
		
		label_results = new JLabel();
		label_results.setText("Wynik");
		label_results.setBounds(50, 300, 150,25);
		
		textfield_results = new JTextField();
		textfield_results.setBounds(150, 300, 150, 25);
		textfield_results.setEditable(false);
		textfield_results.setBackground(Color.white);
		
		this.add(textfield_results);
		this.add(label_results);
		this.add(label_num2);
		this.add(textfield_num2);
		this.add(textfield_num1);
		this.add(label_num1);
		this.add(divButton);
		this.add(mulButton);
		this.add(subButton);
		this.add(addButton);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		

		double num1 = Double.parseDouble(textfield_num1.getText());
		double num2 = Double.parseDouble(textfield_num2.getText());	
		
			if(e.getSource()== addButton) {
				int result = (int) (num1+num2);
				textfield_results.setText(String.valueOf(result));
	

				}
			if(e.getSource()== subButton) {
				int result = (int) (num1-num2);
				textfield_results.setText(String.valueOf(result));

				}
			if(e.getSource()== mulButton) {
				int result = (int) (num1*num2);
				textfield_results.setText(String.valueOf(result));

				}
			if(e.getSource()== divButton) {
			

				int result = (int) (num1/num2);
				textfield_results.setText(String.valueOf(result));
	
				}
	}
}
