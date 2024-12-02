package com.example.ex6;

public class Pasti extends Viaggi{
    private boolean pensioneCompleata;
    public Pasti(double c, boolean pC, int d){
        pensioneCompleata=pC;
        if(pC)
            costo=c+(35*durata);
        else
            costo=c+(25*durata);
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
