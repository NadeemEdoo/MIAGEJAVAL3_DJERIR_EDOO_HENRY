package View.PageAcc;

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

import View.JTableFenetres.*;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame{
	
	
                private int longueur = 1100;
                private int hauteur = 700;
                //Titre des Bouttons
                private String create = "<html>Menu de mise à jour de <b>SEANCES</b></html>";
                private String view = "<html>Menu d'affichage de <b>PLANNING</b></html>";
                private String gestion = "<html>Menu gestion de <b>SEANCES</b> <br>(Ajout, Suppression, mise à jour)</br></html>"; 
                
	public MyFrame() {
	
		this.setTitle("Fenetre Page d'Accueil");
		this.setResizable(false);
		
		this.setSize(longueur,hauteur);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				
		//.. En-TeTE POSITION n1
		
				Panneau enTete = new Panneau("PRO CALENDAR 2015",0,330,35);
				enTete.setBackground(Color.black);
				enTete.setPreferredSize(new Dimension(100,hauteur-600));						
		
		//.. MENU POSTION n2 GRIDBAGLAYOUT
				JPanel menu = new JPanel();
				menu.setLayout(new GridBagLayout());
				
				//menu.setBackground(Color.GRAY);	
				menu.setBorder(BorderFactory.createLineBorder(Color.RED,3));
				menu.setPreferredSize(new Dimension(longueur,hauteur-350));
    
                             //.. CREATION des BOUTONS   
                             JButton b_create = new JButton();
                                b_create.setToolTipText(create);
                             try {
                                     Image img = ImageIO.read(new File("PicNewDossier.png")); 
                                     Image newimg = img.getScaledInstance( 120, 100,  java.awt.Image.SCALE_SMOOTH );
                                     b_create.setIcon(new ImageIcon(newimg));
                                     b_create.setBorder(BorderFactory.createEmptyBorder());
                                   //  b_create.setContentAreaFilled(false);
                                     } catch (IOException ex) {
                                         ex.printStackTrace(); }
                             b_create.addMouseListener(new MouseAdapter() {
                             //...CLASS ANONYME INTERNE
				public void mouseClicked(MouseEvent event){ 
					System.out.println("Un clic sur le bouton " + create);
                                        clickCrea();
					};
					
                             });
                              
                             JButton b_view = new JButton();
                                b_view.setToolTipText(view);
                              try {
                                     Image img = ImageIO.read(new File("Calendrier.png")); 
                                     Image newimg = img.getScaledInstance( 120, 100,  java.awt.Image.SCALE_SMOOTH );
                                     b_view.setIcon(new ImageIcon(newimg));
                                     b_view.setBorder(BorderFactory.createEmptyBorder());
                                     } catch (IOException ex) {
                                         ex.printStackTrace(); }
                              b_view.addMouseListener(new MouseAdapter() {
                                    public void mouseClicked(MouseEvent event){ 
					System.out.println("Un clic sur le bouton " + view);
                                        
                                        JTablePlanning test_lancementPlanning = new JTablePlanning();
                                        test_lancementPlanning.setVisible(true);
                                        test_lancementPlanning.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                    };
                              });
                              
                              /*VERSION NE FONCTIONNANT PAS (Action de placer FRAME principale invisible)
                              b_view.addMouseListener(new MouseAdapter() {
                                  //  public void mouseClicked(MouseEvent event){ 
					//System.out.println("Un clic sur le bouton " + view);
                                        
                                   //     JTablePlanning test_lancementPlanning = new JTablePlanning();
                                   //     test_lancementPlanning.setVisible(true);
                                   //     test_lancementPlanning.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                        
                                 //   };
                                  //Pour comptabiliser le nombre de fenetres ouvertes 
                                 private JTablePlanning  buttonFrame = null;  
                                 
                                 public void MouseClicked(MouseAdapter e){
                                     System.out.println("Un clic sur le bouton " + view);
                                     if(buttonFrame == null) {
                                         buttonFrame = new JTablePlanning();
                                       //  buttonFrame.setVisible(true);
                                         buttonFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                         buttonFrame.addWindowListener(new WindowAdapter() {
						public void windowClosed(java.awt.event.WindowEvent e) {        
                                                          //permet de ré-ouvrir la fenêtre
                                                          buttonFrame = null; };
                                         });
                                         buttonFrame.setVisible(true);
                                     }else {
                                        // Pour repositionner la fenêtre en état normal si elle a été réduite
					if( buttonFrame.getState()==JFrame.ICONIFIED ) {
						buttonFrame.setState(JFrame.NORMAL);}
					// Pour repositionner la fenêtre au premier plan
					buttonFrame.toFront(); }
                                };                            
                               });  

                              /*  VERSION QUI FONCTIONNE POUR LA RECHERCHE DE FICHIERS
                              
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
                            //  File home = vueSysteme.getHomeDirectory();   
                          //      JFileChooser homeChooser = new JFileChooser(home);
                         //       homeChooser.showOpenDialog(null);
                                
                                //VOIR tous les DISQUES 
                                //   chooser.setCurrentDirectory(new File("/"));
                                //   chooser.changeToParentDirectory();
                                //   chooser.showOpenDialog(null);
                             
                                };				
                             });*/
                                
                             JButton b_form = new JButton ();
                                b_form.setToolTipText(gestion);
                              try {
                                     Image img = ImageIO.read(new File("gestion.png")); 
                                     Image newimg = img.getScaledInstance( 120, 100,  java.awt.Image.SCALE_SMOOTH );
                                     b_form.setIcon(new ImageIcon(newimg));
                                     b_form.setBorder(BorderFactory.createEmptyBorder());
                                     } catch (IOException ex) {
                                         ex.printStackTrace(); }
                              b_form.addMouseListener(new MouseAdapter() {
                             //...CLASS ANONYME INTERNE
				public void mouseClicked(MouseEvent event){ 
					//System.out.println("Un clic sur le bouton " + gestion);
					JTableAjoutModule test_lancementAjout = new JTableAjoutModule();
                                        test_lancementAjout.setVisible(true);
                                        test_lancementAjout.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                    };			
                             });
                           
                            GridBagConstraints GBGC = new GridBagConstraints();
                            //Espaces entre les boutons
                            GBGC.insets = new Insets(20, 20, 20, 20);
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
				Panneau bas = new Panneau("Copyright � 2015 DJERIR-EDOO-HENRY "
						+ "and/or its affiliates. All rights reserved.",150,370,10);
				bas.setLayout(new BorderLayout());
				bas.setBackground(Color.black);

		//.. BACKGROUND
				JPanel background = new JPanel();
				background.setLayout(new BoxLayout(background,BoxLayout.Y_AXIS));
				background.add(enTete);
				background.add(menu);
				background.add(bas);
				
		//.. suite CONFIG
				this.getContentPane().add(background);	               
                                
                //.. GESTION fermeture fenêtre
                    this.addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				fermer();
			}
		});
         
        }//Fin construteur MyFrame
        
        //PROCEDURE de CONFIRMATION de FERMETURE
        public void fermer() {
                        int reponse = JOptionPane.showConfirmDialog(this,
                             "WARNING! Voulez-vous vraiment quitter l'application",
                              "Confirmation",
                              JOptionPane.YES_NO_OPTION,
                              JOptionPane.QUESTION_MESSAGE);
                               if(reponse == JOptionPane.YES_OPTION ){
                                	dispose();
                                        }
                    }
        //PROCEDURE de message lorsque CLICK on CREAMODULE
         public void clickCrea() {
                        int reponse = JOptionPane.showConfirmDialog(this,
                             "<html>SORRY this Menu is UNDER CONSTRUCTION"
                                     + "<br>____________85% completed____________</br></html>",
                              "Message ERROR",
                              JOptionPane.CLOSED_OPTION);
                             
                    }
}
