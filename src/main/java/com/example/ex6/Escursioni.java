package com.example.ex6;

public class Escursioni extends Viaggi{
    private int escursioni;
    public Escursioni(int e){
        escursioni=e;
        costo=costo+(costo+(e*15));
    }
    public void setEscursioni(int e){
        escursioni=e;
    }
    public int getEscursioni(){
        return escursioni;
    }
    public boolean equals(Object o){
        if(o instanceof Escursioni){
            if(destinazione.equalsIgnoreCase(((Viaggi) o).destinazione)&&durata==((Viaggi) o).durata&&costo==((Viaggi) o).costo&&escursioni==((Escursioni) o).escursioni){
                return true;
            }
        }
        return false;
    }
    public String toString(){
        return "Destinzazione: "+destinazione+", durata: "+durata+" giorni, costo: "+costo+", numero di escursioni: "+escursioni;
    }
}
