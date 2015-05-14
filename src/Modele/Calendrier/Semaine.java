/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele.Calendrier;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author NadeemShia
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
    
        public static Date RecLundi(Date date){
        GregorianCalendar calendar = new GregorianCalendar();
        Date lundi = date ;
     //   lundi.setTime(86400000);
        long timeLundi;
        int jour;
        
        calendar.setTime(date);
        System.out.println(date.toLocaleString());
        jour = calendar.get(Calendar.DAY_OF_WEEK);
        
       
        while(jour != 2){
        timeLundi = (date.getTime() - 86400000);
        lundi.setTime(timeLundi);  
        calendar.setTime(lundi);
        jour=calendar.get(Calendar.DAY_OF_WEEK);    
        	
        }
        
    	return lundi;
    }
    
        
             public static Date RecMardi(Date date){
        GregorianCalendar calendar = new GregorianCalendar();
        long timeLundi;
        int jour;
        calendar.setTime(date);
        System.out.println(date.toLocaleString());
        jour = calendar.get(Calendar.DAY_OF_WEEK);

        timeLundi = (date.getTime() + 86400000);
        date.setTime(timeLundi);      
    	return date;
    }
        
                public static Date RecMercredi(Date date){
        GregorianCalendar calendar = new GregorianCalendar();
        long timeLundi;
        int jour;
        calendar.setTime(date);
        System.out.println(date.toLocaleString());
        jour = calendar.get(Calendar.DAY_OF_WEEK);

        timeLundi = (date.getTime() + (86400000*2));
        date.setTime(timeLundi);      
    	return date;
    }   
      
          public static Date RecJeudi(Date date){
        GregorianCalendar calendar = new GregorianCalendar();
        long timeLundi;
        int jour;
        calendar.setTime(date);
        System.out.println(date.toLocaleString());
        jour = calendar.get(Calendar.DAY_OF_WEEK);

        timeLundi = (date.getTime() + (86400000*3));
        date.setTime(timeLundi);      
    	return date;
    }   
      
                  public static Date RecVendredi(Date date){
        GregorianCalendar calendar = new GregorianCalendar();
        long timeLundi;
        int jour;
        calendar.setTime(date);
        System.out.println(date.toLocaleString());
        jour = calendar.get(Calendar.DAY_OF_WEEK);

        timeLundi = (date.getTime() + (86400000*4));
        date.setTime(timeLundi);      
    	return date;
    }  
      
                  
                      public static Date RecSamedi(Date date){
        GregorianCalendar calendar = new GregorianCalendar();
        long timeLundi;
        int jour;
        calendar.setTime(date);
        System.out.println(date.toLocaleString());
        jour = calendar.get(Calendar.DAY_OF_WEEK);

        timeLundi = (date.getTime() + (86400000*5));
        date.setTime(timeLundi);      
    	return date;
    } 
            
        public static Date RecLundiPreced(Date date){
        GregorianCalendar calendar = new GregorianCalendar();
        long timeLundi;
        Date lundi = date ;
        int jour;
        calendar.setTime(date);
        System.out.println(date.toLocaleString());
        jour = calendar.get(Calendar.DAY_OF_WEEK);

        timeLundi = (date.getTime() - (86400000*7));
        lundi.setTime(timeLundi);      
    	return lundi;
    }  
                   
                      
        public static Date RecLundiProchain(Date date){
        GregorianCalendar calendar = new GregorianCalendar();
        long timeLundi;
        Date lundi = date ;
        int jour;
        calendar.setTime(date);
        System.out.println(date.toLocaleString());
        jour = calendar.get(Calendar.DAY_OF_WEEK);

        timeLundi = (date.getTime() + (86400000*7));
        lundi.setTime(timeLundi);      
    	return lundi;
    }  
        
        public static Date RecDemain(Date date){
        GregorianCalendar calendar = new GregorianCalendar();
         Date lundi = date ;
        long timeLundi;
        int jour;
        calendar.setTime(date);
        //System.out.println("coucou"+date.toLocaleString());
        timeLundi = (date.getTime() + 86400000);
        lundi.setTime(timeLundi); 
        System.out.println("coucou"+date.toLocaleString());
    	return lundi;
    }    
        
         public static Date RecHier(Date date){
        GregorianCalendar calendar = new GregorianCalendar();
        long timeLundi;
        int jour;
        calendar.setTime(date);
        System.out.println(date.toLocaleString());
        jour = calendar.get(Calendar.DAY_OF_WEEK);

        timeLundi = (date.getTime() - 86400000);
        date.setTime(timeLundi);      
    	return date;
    }     
        
        
}
