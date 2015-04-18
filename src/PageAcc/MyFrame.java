package PageAcc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyFrame extends JFrame {
	
	
		private int longueur = 900;
		private int hauteur = 600;
		
	public MyFrame() {
		
			
		this.setTitle("Fenêtre Page d'Accueil");
		this.setResizable(false);
		
		this.setSize(longueur,hauteur);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		//.. En-TËTE POSITION n°1
			/*	JPanel enTete = new JPanel();
				enTete.setLayout(new FlowLayout());
				
				JLabel titre = new JLabel("PRO CALENDAR 2015");
				enTete.add(titre);
				enTete.setBackground(Color.black);
				enTete.setPreferredSize(new Dimension(100, 700-500));*/
		
				Panneau enTete = new Panneau("PRO CALENDAR 2015",0,330,35);
				enTete.setBackground(Color.black);
				enTete.setPreferredSize(new Dimension(100,hauteur-600));
								
		
		//.. MENU POSTION n°2 GRIDBAGLAYOUT
				JPanel menu = new JPanel();
				menu.setLayout(new GridBagLayout());
				
				//menu.setBackground(Color.GRAY);	
				menu.setBorder(BorderFactory.createLineBorder(Color.RED,3));
				menu.setPreferredSize(new Dimension(longueur,hauteur-350));
				/*
				 *  new GridBagConstraints:
				 *  -coordonées (x,y)
				 * 	-nb de cellules que le bouton occupe (val1,val2)	
				 * 	-poids affecté (si extension)
				 * 	-FIRST_LINE_START position du composant au sein de sa ou ses cellules
				 * 	-NONE comportement si espace dispo > taille minimale nécessaire
				 * 	-Insets definit les espaces de séparation autour du composant
				 *	-augmenter taille minimale de la cellule
				 */
				JButton bout1 = new JButton("bout1");
				menu.add(bout1,
							new GridBagConstraints(0,0, 1,1, 0.0,0.0,
							GridBagConstraints.FIRST_LINE_START,
							GridBagConstraints.NONE,new Insets
							(5,5,5,5), 0,0));
				menu.add(bout1);
				
				JButton bout2 = new JButton("bout2");
				menu.add(bout2,
							new GridBagConstraints(0,1, 1,1, 0.0,0.0,
							GridBagConstraints.FIRST_LINE_START,
							GridBagConstraints.NONE,new Insets
							(5,5,5,5), 0,0));
				menu.add(bout2);
				
				JButton bout3 = new JButton("bout3");
				menu.add(bout3,
							new GridBagConstraints(2,2, 1,1, 0.0,0.0,
							GridBagConstraints.FIRST_LINE_START,
							GridBagConstraints.NONE,new Insets
							(5,5,5,5), 0,0));
				menu.add(bout3);
		
		//.. BAS de PAGE POSITION n°3
				/*
				 * NE FONCTIONNE PAS 
				 * Panneau bas = new Panneau("Copyright © 2015 DJERIR-EDOO-HENRY "
						+ "and/or its affiliates. All rights reserved.",250,370,10,longueur,hauteur-450);
				*/
				Panneau bas = new Panneau("Copyright © 2015 DJERIR-EDOO-HENRY "
						+ "and/or its affiliates. All rights reserved.",150,370,10);
				bas.setLayout(new BorderLayout());
				
				bas.setBackground(Color.black);
				//bas.setPreferredSize(new Dimension(longueur,hauteur-500));
			   /*
			    *  JTextArea display text in any font
			    *   all of the text is in the same font
			    *
				*JTextArea textArea = new JTextArea(
				*	   "PRO CALENDAR 2015"+
				*	   "All rights reserved"+
				*		"May 2015"
				*	);
				*	textArea.setFont(new Font("Serif", Font.ITALIC, 16));
				*	textArea.setLineWrap(true);
				*	bas.add(textArea);	
				*	textArea.setWrapStyleWord(true);
				*/
						
				
		//.. BACKGROUND
				JPanel background = new JPanel();
				background.setLayout(new BoxLayout(background,BoxLayout.Y_AXIS));
				
				background.add(enTete);
				background.add(menu);
				background.add(bas);
				
		//.. suite CONFIG
				this.getContentPane().add(background);
				
	}
	
	
	

}
