package com.example.ex6;

public class Volo extends Viaggi{
    public boolean andataRitorno;
    public Volo() {
    }
    public Volo(String des, int dur, double c, boolean aR){
        destinazione=des;
        durata=dur;
        costo=c;
        andataRitorno=aR;
        costo=calcolaCosto();
    }
    public double calcolaCosto (){
        double c;
            if (andataRitorno)
                c = costo + (costo * 85);
            else
                c = costo + (costo * 50);
            return c;
    }
    public void setAndataRitorno(boolean aR){
        andataRitorno=aR;
    }
    public boolean getAndataRitorno(){
        return andataRitorno;
    }public void setCosto(double c){
        if(andataRitorno)
            costo=c+(c*85);
        else
            costo=c+(c*50);
    }
    public boolean equals(Object o){
        if(o instanceof Volo){
            if(destinazione.equalsIgnoreCase(((Viaggi) o).destinazione)&&durata==((Viaggi) o).durata&&costo==((Viaggi) o).costo&&andataRitorno==((Volo) o).andataRitorno){
                return true;
            }
        }
        return false;
    }
    public String toString(){
        String a;
        if(andataRitorno)
            a=", andata e ritorno";
        else
            a=", solo andata";
        return "Destinzazione: "+destinazione+", durata: "+durata+" giorni, costo: "+costo+a;
    }
}
