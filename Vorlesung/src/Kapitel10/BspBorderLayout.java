package Kapitel10;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BspBorderLayout {

	private BspBorderLayout(String title){
		
		JFrame fenster = new JFrame(title);
		fenster.setLayout(new BorderLayout());
		
		fenster.setSize(500, 500);
		
		JButton northLbl = new JButton("Norden");
		JLabel northTxt = new JLabel("hier ist der Norden");
		JButton southLbl = new JButton("Süden");
		JButton westLbl = new JButton("Westen");
		JButton eastLbl = new JButton("Osten");
		JButton centerLbl = new JButton("Mitte");
		
		JPanel northPanel = new JPanel(new FlowLayout());
		northPanel.add(northTxt);
		northPanel.add(northLbl);
		
		fenster.add(northPanel, BorderLayout.NORTH);
		fenster.add(southLbl, BorderLayout.SOUTH);
		fenster.add(westLbl, BorderLayout.WEST);
		fenster.add(eastLbl, BorderLayout.EAST);
		fenster.add(centerLbl, BorderLayout.CENTER);
		
		
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenster.setVisible(true);
	}
	
	public static void main(String[] args) {
		new BspBorderLayout("BorderLayout Beispiel");
	}

}
