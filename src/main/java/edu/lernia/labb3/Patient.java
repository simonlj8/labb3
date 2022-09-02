package edu.lernia.labb3;

import java.lang.String;


public class Patient {
    boolean isSick = true;
    String name;

    String getSickness;
    String sickness = null;
    // Constructor 1
    Patient(String name, String getSickness) {
        this.name = name;
        this.getSickness = getSickness;
    }

    // Constructor 2
    public Patient(String name) {
        this.name = name;
        isSick = false;
    }

    public boolean isSick() {
        if(getSickness == null) {
            isSick = false;
        }
       return isSick;
   }

    public String getName() {
        return name;
    }

    public String getSickness() {
        return getSickness;
    }

    public void takeMedication (Medicine medicine){
    if(getSickness != null && getSickness.equalsIgnoreCase(medicine.getTreatmentName())) {
        isSick = false;

          }
      }
    }

