package com.example.ex6;

public class Pasti extends Viaggi{
    private boolean pensioneCompleta;
    public Pasti(){
    }
    public Pasti(String des, int dur, double c, boolean pC){
        destinazione=des;
        durata=dur;
        costo=c;
        pensioneCompleta =pC;
        costo=calcolaCosto();
    }
    public double calcolaCosto (){
        double c;
        if (pensioneCompleta)
            c = costo + (durata*35);
        else
            c = costo + (25*durata);
        return c;
    }
    public void setPensioneCompleta(boolean pC){
        pensioneCompleta =pC;
    }
    public boolean getPensioneCompleta(){
        return pensioneCompleta;
    }
    public boolean equals(Object o){
        if(o instanceof Pasti){
            if(super.equals(o)&&pensioneCompleta==((Pasti) o).pensioneCompleta){
                return true;
            }
        }
        return false;
    }
    public String toString(){
        String a;
        if(pensioneCompleta)
            a=", pensione completa";
        else
            a=", mezza pensione";
        return super.toString()+a;
    }
}
