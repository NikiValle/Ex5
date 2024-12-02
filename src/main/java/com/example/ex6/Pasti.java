package com.example.ex6;

public class Pasti extends Viaggi{
    private boolean pensioneCompleata;
    public Pasti(){
    }
    public double calcolaCosto ( boolean a){
        double c;
        if (a)
            c = costo + (durata*35);
        else
            c = costo + (25*durata);
        return c;
    }
    public void setPensioneCompleata(boolean pC){
        pensioneCompleata=pC;
    }
    public boolean getPensioneCompleta(){
        return pensioneCompleata;
    }
    public boolean equals(Object o){
        if(o instanceof Pasti){
            if(destinazione.equalsIgnoreCase(((Viaggi) o).destinazione)&&durata==((Viaggi) o).durata&&costo==((Viaggi) o).costo&&pensioneCompleata==((Pasti) o).pensioneCompleata){
                return true;
            }
        }
        return false;
    }
    public String toString(){
        String a;
        if(pensioneCompleata)
            a=", pensione completa";
        else
            a=", mezza pensione";
        return "Destinzazione: "+destinazione+", durata: "+durata+" giorni, costo: "+costo+a;
    }
}
