package edu.lernia.labb3;

import java.lang.String;


public class Patient {
	
   protected boolean isSick = true;
   private String name;
   private String getSickness;
    
    
    // Constructor 1 for disease and name
   protected Patient(String name, String getSickness) {
        this.name = name;
        this.getSickness = getSickness;
        
    }

    // Constructor 2 only for name
    protected Patient(String name) {
        this.name = name;
        isSick = false;
    }

    protected boolean isSick() {
        if(getSickness == null) {
            isSick = false;
        }
       return isSick;
   }

   protected String getName() {
        return name;
    }

    protected String getSickness() {
        return getSickness;
    }

    protected void takeMedication (Medicine medicine){
    if(getSickness != null && getSickness.equals(medicine.getTreatmentName())) {
        isSick = false;

          }
      }
    }

