package lab5GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.EventObject;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.AncestorListener;

public class Frame extends JFrame implements ActionListener {

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
			/*
			change = new JButton("Change");
			panel.add(change);
			buttons.add(change);
			change.addActionListener(this);
			*/
			pack();
		}
		addNewDocument = new JButton("Add new");
		panel.add(addNewDocument);
		addNewDocument.addActionListener(this);
		save = new JButton("Save");
		save.addActionListener(this);
		panel.add(save);
		open = new JButton("Open list");
		panel.add(open);
		open.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {

		Object sourceEvent = e.getSource();

		for (int i = 0; i < buttons.size(); i++) {
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
		} else if (sourceEvent == save) {
			File file = new File("dokumenty.txt");
			FileWriter fwriter;
			try {
				fwriter = new FileWriter(file);
				BufferedWriter bwriter = new BufferedWriter(fwriter);
				for (int i = 0; i < documents.size(); i++) {
					bwriter.write(i+1 + ". Dokument \n" );
					bwriter.write(documents.get(i).getTytul() + "\n");
					bwriter.write(documents.get(i).getTresc() + "\n");
				}
				bwriter.close();

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			JOptionPane.showMessageDialog(null, "Documents have been saved to the file"); 

		} else if (sourceEvent == open) {
			File file = new File("dokumenty.txt");
			FileReader freader;
			try {
				freader = new FileReader(file);
				BufferedReader breader = new BufferedReader(freader);
				documents.clear();
				String line;
				while ((line = breader.readLine()) != null) {
					if (line.equals("Dokument")) {
						String tytul = breader.readLine();
						String tresc = breader.readLine();
						Document mojDokumentTekstowy = new Document(tytul, tresc);
						documents.add(mojDokumentTekstowy);
					}
				}
				breader.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
			JOptionPane.showMessageDialog(null, "Documents have been loaded from the file"); 
		}

	}

}
