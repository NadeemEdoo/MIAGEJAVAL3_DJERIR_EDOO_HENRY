/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Modele.ForMod.*;
import Modele.Initialisation.*;
import View.JTableFenetres.*;
import View.PageAcc.*;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
/**
 *
 * @author wafadjerir
 */
public  class ConditionAjoutSeance extends DefaultTableCellRenderer{
    
    public static String abbSeance(Formation formation,String nom){
       String abb = "";
//        String nomModule;
//        for (int i = 0;i<formation.getTabModule().size();i++){
//            
//		nomModule =  formation.getTabModule().get(i).getModule().getNom();
//                if(nomModule.equals(nom)){
//                    abb = formation.getTabModule().get(i).getModule().getAbbrev();
//                    
//                }
//                        
//			
//		}
        return abb;
    }
    
    public  Component getTableCellRendererComponent( JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col,String nom){
 
  // on utilise le renderer super qui va tenir compte de
  // tout ce qu'on a besoin (sélection, focus)
   Component comp;
 
  comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
  //comp = super.etTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
 
  // si on est sur le dossier du jour on le met en couleur
 
  // a toi de voir si cette modification ne pose pas de problème
  // avec le renderer super
  if (table.getValueAt(row,col).equals(nom)){
    comp.setForeground(Color.BLUE);}
  else
    comp.setForeground(Color.black);
 return comp;

    }
}
