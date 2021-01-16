package lab5GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.EventObject;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.AncestorListener;

public class Frame extends JFrame implements ActionListener{

	private ArrayList<Document> documents;

	ArrayList<JTextField> tekxtFieldTitle;
	ArrayList<JTextField> textFieldContent;
	// this panel contain all text field and buttons
	JPanel panel;
	JTextField field;
	ArrayList<JButton> buttons;
	JButton save, addNewDocument, open, delete, change;
	

	Frame(ArrayList<Document> list) {
		this.documents = list;
		panel = new JPanel();
		add(panel);
		fillPanel();
	}

	public void fillPanel() {
		
		panel.removeAll();
		GridLayout grid = new GridLayout((documents.size() + 1), 8);
		panel.setLayout(grid);
		tekxtFieldTitle = new ArrayList<JTextField>();
		textFieldContent = new ArrayList<JTextField>();
		buttons = new ArrayList<JButton>();
		

		for (int i = 0; i < documents.size(); i++) {
			field = new JTextField(documents.get(i).getTytul());
			panel.add(field);
			field = new JTextField(documents.get(i).getTresc());
			panel.add(field);
			
			delete = new JButton("Remove");
			panel.add(delete);
			buttons.add(delete);
			delete.addActionListener(this);
			
			change = new JButton("Change");
			panel.add(change);
			buttons.add(change);
			change.addActionListener(this);
			pack();
		}
		
		save = new JButton("Save");
		save.addActionListener(this);
		panel.add(save);
		addNewDocument = new JButton("Add new");
		panel.add(addNewDocument);
		addNewDocument.addActionListener(this);
		open = new JButton("Open list");
		panel.add(open);
		open.addActionListener(this);
		
	}


	public void actionPerformed(ActionEvent e) {
		
		Object sourceEvent = e.getSource();
		
		for (int i = 0; i < buttons.size(); i++ ) {
			if (sourceEvent == buttons.get(i)) {
				documents.remove(i);
				fillPanel();
				break;
			}
		}
			 if (sourceEvent == addNewDocument) {
				String tytul = JOptionPane.showInputDialog(null, "Nazwa dokumentu", "Nowy dokument",
						JOptionPane.OK_CANCEL_OPTION);
				String tresc = JOptionPane.showInputDialog(null, "Tresc dokumentu", "Nowy dokument",
						JOptionPane.OK_CANCEL_OPTION);
				Document nowyD = new Document(tytul, tresc);
				documents.add(nowyD);
				fillPanel(); 
			}
			else if (sourceEvent == save) {
				
				System.out.println("Documents have been saved to the file");
			}else if (sourceEvent == change) {
				System.out.println("CHANGE have been saved to the file");
			}
			 
			
		
	}
		
	}
	

		
