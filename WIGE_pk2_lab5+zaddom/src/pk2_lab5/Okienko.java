package pk2_lab5;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Okienko extends JFrame {

	ArrayList<Dokument> lista;
	Ramka ramka;
	JTextField tytul, tresc;
	
	
	Okienko(ArrayList<Dokument> list,Ramka ramk ){
		
		lista= list;
		ramka= ramk;
		
		pokaz();
		setLayout(new GridLayout(0,2));
		 tytul = new JTextField("Podaj tytul nowego dokumentu");
		add(tytul);
		 tresc = new JTextField("Podaj tresc nowego dokumentu");
		add(tresc);
		
		JButton ok = new JButton("Ok");
		LOk lok = new LOk(lista,ramka, this);
		ok.addActionListener(lok);
		add(ok);
		
		JButton anuluj = new JButton("Anuluj");
		LAnuluj la= new LAnuluj(this);
		anuluj.addActionListener(la);
		
		add(anuluj);
		pack();
	}
	
	public void pokaz(){
		
		setVisible(true);
	}
	
	public void zamknij(){
		
		setVisible(false);
		
	}
	
	public String getNewTitle(){
		
		return tytul.getText();
		
	}
	public String geContent(){
		
		return tresc.getText();
		
	}
	
}
