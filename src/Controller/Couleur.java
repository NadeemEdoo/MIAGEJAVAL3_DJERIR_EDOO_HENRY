/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import Modele.Calendrier.*;
import Modele.Initialisation.*;
import Modele.ForMod.*;
/**
 *
 * @author wafadjerir
 */
 
public class Couleur extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent
                     (JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column){
          Component cell = super.getTableCellRendererComponent  
                      (table,value,isSelected,hasFocus,row,column); 
          
       
     Color color = (Color) value;
// 
        setText("");
      setBackground(color);
       cell.setBackground(color);
//        
//        if ((value != null) && (value.equals("Gris"))) { 
//         cell.setBackground(Color.gray);
//         }
      
//           else {
//             if ((value != null) && (value.equals("Rouge"))) { 
//                  cell.setBackground(Color.RED);
//             }
//             else {
//                 cell.setBackground(Color.white);
//             }      
//         } */
          return cell;
    }
                     

//public static Object setFormation(JTable table,Object value,int row,int column,String abb){
//    Component  cell;
//    cell=getTableCellRendererComponent(table,value,false,false,row,column);
//    value = abb;
//    return value;
//    
//
//}
        
                     
                     
                     
                     
                     
                     
                     
                     
                     
                     
    public Color testCouleur  (String stringCouleur){
        Color couleur = Color.WHITE;
        switch (stringCouleur){
            case "Gris" : couleur = Color.gray;break;
            case "Rouge" : couleur = Color.RED;break;
            case "Vert" : couleur = Color.GREEN;break;
            case "Jaune" : couleur = Color.YELLOW;break;
            case "Rose" : couleur = Color.PINK;break;
            case "Violet" : couleur = Color.magenta;break;
            case "Bleu" : couleur = Color.BLUE; break;  
            case "Orange" : couleur = Color.ORANGE;break;
                
        }
        
       
        return couleur;
    }             
                     
}

