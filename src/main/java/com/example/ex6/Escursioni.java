package com.example.ex6;

public class Escursioni extends Pasti{
    private int escursioni;
    public Escursioni(){
    }
    public Escursioni(String des, int dur, double c,boolean pC, int e){
        destinazione=des;
        durata=dur;
        costo=c;
        setPensioneCompleta(pC);
        escursioni=e;
        costo=calcolaCosto();
    }
    public double calcolaCosto (){
        double c;
            c = costo +(costo*(escursioni*15));
            c = costo + (25*durata);
        return c;
    }
    public void setEscursioni(int e){
        escursioni=e;
    }
    public int getEscursioni(){
        return escursioni;
    }
    public boolean equals(Object o){
        if(o instanceof Escursioni){
            if(super.equals(o)&&escursioni==((Escursioni) o).escursioni){
                return true;
            }
        }
        return false;
    }
    public String toString(){
        return super.toString()+", numero di escursioni: "+escursioni;
    }
}
