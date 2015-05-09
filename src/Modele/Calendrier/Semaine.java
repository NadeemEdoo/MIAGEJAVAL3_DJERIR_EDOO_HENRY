/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele.Plannig;

import java.util.Date;

/**
 *
 * @author wafadjerir
 */
public class Semaine {
     Date debut;
     Date fin;
    
    public void Semain(Date debut,Date fin){
    this.debut = debut;
    this.fin = fin;
    }

    public Date getDebut() {
        return debut;
    }

    public Date getFin() {
        return fin;
    }

    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }
    
}
