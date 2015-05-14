/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele.Calendrier;
import java.util.ArrayList;



import java.util.Date;

import Modele.ForMod.*;
/**
 *
 * @author NadeemShia
 */
public class Seance {
	
	private ModuleFormation module;
	Date date;
	String journee;
	
	
	public void seance(ModuleFormation module,Date date,String journee){
		this.module=module;
		this.date = date;
		this.journee = journee;
		
	}


	public ModuleFormation getModule() {
		return module;
	}


	public void setModule(ModuleFormation module) {
		this.module = module;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getJournee() {
		return journee;
	}


	public void setJournee(String journee) {
		this.journee = journee;
	}
	
	
	
    
}