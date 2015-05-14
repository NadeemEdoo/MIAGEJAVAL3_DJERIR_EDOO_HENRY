/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele.Calendrier;

import java.util.ArrayList;

import Modele.ForMod.ModuleFormation;

/**
 *
 * @author NadeemShia
 */



public class TabSeance {
	
	
	private ArrayList<Seance> seance;

	//Tableau des seances pour stocker les seance lors d'un ajout 
	
	public TabSeance(ArrayList<Seance> seance){
		this.seance=seance;
	}

}

