package View.PageAcc;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panneau extends JPanel{
	
	private String str;
	private int ajustH;		//Ajustement text en Hauteur
	private int ajustL; 	//Ajustement text en Longueur
	private int tailleFont;	//Taille police
	private int val1;		//Longueur preferred (Redimmensionnement)
	private int val2;		//Hauteur preferred (Red.)
	
/*
	 public void paintComponent(Graphics g){                
		    Font font = new Font("Courier", Font.BOLD, 20);
		    g.setFont(font);
		    g.setColor(Color.WHITE);          
		    g.drawString(str, 10, 20);                
		  }      		
}*/
		//.. SANS REDIMMENSIONNEMENT
		public Panneau(String str, int ajustH, int ajustL, int tailleFont){
			this.setStr(str);
			this.ajustH = ajustH;
			this.ajustL = ajustL;
			this.tailleFont = tailleFont;
		}
		//.. AVEC REDIMMENSIONNEMENT
		public Panneau(String str, int ajustH, int ajustL, int tailleFont,int val1,int val2){
			this.setStr(str);
			this.ajustH = ajustH;
			this.ajustL = ajustL;
			this.tailleFont = tailleFont;
			this.setPreferredSize(new Dimension(val1,val2));
		}

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(200, 200);
        }

        //.. La partie GRAPHIC(Text)
        protected void paintComponent(Graphics g) {
   	   	 Font font = new Font("Tahoma", Font.PLAIN, tailleFont);
   		     g.setFont(font);
   	   	
   		   super.paintComponent(g);
   	       int height = getHeight();
   	       String text = this.getStr();
   	       /*La ligne*/
   	       g.setColor(Color.RED);
   	       g.drawLine(0, height / 2, getWidth(), height / 2);

   	       FontMetrics fm = g.getFontMetrics();
   	       int totalWidth = (fm.stringWidth(text) * 2) + 4;
   	      
   	       /*Au dessus de la ligne*/
   	       int x = (getWidth()+ajustL - totalWidth)/2 ;
   	      /*test pour centrer sur milieu du str:
   	       *int x = (getWidth()/2) - str.length();
   	       */
   	       int y = (getHeight() - fm.getHeight()+ajustH) / 2;
   	       g.setColor(Color.WHITE);

   	       g.drawString(text, x, y + ((fm.getDescent() + fm.getAscent()) / 2));

   	       /*Sur la ligne
   	       x += fm.stringWidth(text) + 2;
   	       y = ((getHeight() - fm.getHeight()) / 2) + fm.getAscent();
   	       g.drawString(text, x, y);
   			*/
   	   }

		public String getStr() {
			return str;
		}

		public void setStr(String str) {
			this.str = str;
		}
    }
