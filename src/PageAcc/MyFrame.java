package PageAcc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class MyFrame extends JFrame {
	
	
		private int longueur = 900;
		private int hauteur = 600;
                
                //Titre des Bouttons
                private String create = "Menu creation de CALENDRIER";
                private String view = "Menu aperçu de CALENDRIER";
                private String gestion = "Menu gestion de FORMATION"; 
		
	public MyFrame() {
		
			
		this.setTitle("Fenetre Page d'Accueil");
		this.setResizable(false);
		
		this.setSize(longueur,hauteur);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		//.. En-T�TE POSITION n�1
			/*	JPanel enTete = new JPanel();
				enTete.setLayout(new FlowLayout());
				
				JLabel titre = new JLabel("PRO CALENDAR 2015");
				enTete.add(titre);
				enTete.setBackground(Color.black);
				enTete.setPreferredSize(new Dimension(100, 700-500));*/
		
				Panneau enTete = new Panneau("PRO CALENDAR 2015",0,330,35);
				enTete.setBackground(Color.black);
				enTete.setPreferredSize(new Dimension(100,hauteur-600));
								
		
		//.. MENU POSTION n�2 GRIDBAGLAYOUT
				JPanel menu = new JPanel();
				menu.setLayout(new GridBagLayout());
				
				//menu.setBackground(Color.GRAY);	
				menu.setBorder(BorderFactory.createLineBorder(Color.RED,3));
				menu.setPreferredSize(new Dimension(longueur,hauteur-350));
                               
                               /*TEST1 ICONBUTTON
                                Icon warnIcon = new ImageIcon("PicNewDossier.png");
                                 JButton b_create = new JButton(warnIcon);*/
                             //.. CREATION des BOUTONS   
                             JButton b_create = new JButton();
                                b_create.setToolTipText(create);
                             try {
                                     Image img = ImageIO.read(new File("PicNewDossier.png")); 
                                     Image newimg = img.getScaledInstance( 60, 50,  java.awt.Image.SCALE_SMOOTH );
                                     b_create.setIcon(new ImageIcon(newimg));
                                     b_create.setBorder(BorderFactory.createEmptyBorder());
                                   //  b_create.setContentAreaFilled(false);
                                     } catch (IOException ex) {
                                         ex.printStackTrace(); }
                             b_create.addMouseListener(new MouseAdapter() {
                             //...CLASS ANONYME INTERNE
				public void mouseClicked(MouseEvent event){ 
					System.out.println("Un clic sur le bouton " + create);
					};
					
                             });
                              
                             JButton b_view = new JButton();
                                b_view.setToolTipText(view);
                              try {
                                     Image img = ImageIO.read(new File("Calendrier.png")); 
                                     Image newimg = img.getScaledInstance( 60, 50,  java.awt.Image.SCALE_SMOOTH );
                                     b_view.setIcon(new ImageIcon(newimg));
                                     b_view.setBorder(BorderFactory.createEmptyBorder());
                                     } catch (IOException ex) {
                                         ex.printStackTrace(); }
                              b_view.addMouseListener(new MouseAdapter() {
                             //...CLASS ANONYME INTERNE
				public void mouseClicked(MouseEvent event){ 
					//System.out.println("Un clic sur le bouton " + view);

                                FileSystemView vueSysteme = FileSystemView.getFileSystemView(); 
                                //récupération des répertoires
                                File defaut = vueSysteme.getDefaultDirectory(); 
                                //création et affichage des JFileChooser
                                JFileChooser defautChooser = new JFileChooser(defaut);
                                defautChooser.showOpenDialog(null);
                              // VOIR REPERTOIRE "BUREAU"
                              /*File home = vueSysteme.getHomeDirectory();   
                                JFileChooser homeChooser = new JFileChooser(home);
                                homeChooser.showOpenDialog(null);*/
                                
                                //VOIR tous les DISQUES 
                                /*JFileChooser chooser = new JFileChooser();
                                chooser.setCurrentDirectory(new File("/"));
                                chooser.changeToParentDirectory();
                                chooser.showOpenDialog(null);*/
                             
                                };				
                             });
                                
                             JButton b_form = new JButton ();
                                b_form.setToolTipText(gestion);
                              try {
                                     Image img = ImageIO.read(new File("gestion.png")); 
                                     Image newimg = img.getScaledInstance( 60, 50,  java.awt.Image.SCALE_SMOOTH );
                                     b_form.setIcon(new ImageIcon(newimg));
                                     b_form.setBorder(BorderFactory.createEmptyBorder());
                                     } catch (IOException ex) {
                                         ex.printStackTrace(); }
                              b_form.addMouseListener(new MouseAdapter() {
                             //...CLASS ANONYME INTERNE
				public void mouseClicked(MouseEvent event){ 
					System.out.println("Un clic sur le bouton " + gestion);
					};			
                             });
                           
                            GridBagConstraints GBGC = new GridBagConstraints();
                           // GBGC.weightx = 1;
                            //GBGC.weighty = 1;
                            GBGC.insets = new Insets(10, 10, 10, 10);
                            //.. Position en x
                            GBGC.gridx = 0;
                            //.. Position en y
                            GBGC.gridy = 0;
                            //.. Nb de lignes
                            GBGC.gridheight = 1;
                            //.. Nb de colonnes 
                            GBGC.gridwidth = 1;
                            GBGC.fill = GridBagConstraints.HORIZONTAL;
                            menu.add( b_create, GBGC);

                            GBGC.gridx = 1;
                            GBGC.gridy = 0;
                            GBGC.gridwidth = 1;
                            GBGC.gridheight = 1;
                            GBGC.fill = GridBagConstraints.HORIZONTAL;
                            menu.add( b_view, GBGC);

                            GBGC.gridx = 3;
                            GBGC.gridy = 0;
                            GBGC.gridwidth = 1;
                            GBGC.gridheight = 1;
                            GBGC.fill = GridBagConstraints.HORIZONTAL;
                            menu.add(b_form, GBGC);

                                /*
				 *  new GridBagConstraints:
				 *  -coordon�es (x,y)
				 * 	-nb de cellules que le bouton occupe (val1,val2)	
				 * 	-poids affect� (si extension)
				 * 	-FIRST_LINE_START position du composant au sein de sa ou ses cellules
				 * 	-NONE comportement si espace dispo > taille minimale n�cessaire
				 * 	-Insets definit les espaces de s�paration autour du composant
				 *	-augmenter taille minimale de la cellule
				 */

		//.. BAS de PAGE POSITION n�3
				/*
				 * NE FONCTIONNE PAS 
				 * Panneau bas = new Panneau("Copyright � 2015 DJERIR-EDOO-HENRY "
						+ "and/or its affiliates. All rights reserved.",250,370,10,longueur,hauteur-450);
				*/
				Panneau bas = new Panneau("Copyright � 2015 DJERIR-EDOO-HENRY "
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
