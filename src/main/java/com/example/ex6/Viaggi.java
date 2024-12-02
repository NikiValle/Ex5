package com.example.ex6;

public class Viaggi {
    protected String destinazione;
    protected int durata;
    protected double costo;
    public Viaggi(String des, int dur, double c){
        destinazione=des;
        durata=dur;
        costo=c;
    }
    public Viaggi(){

    }
    public void setDestinazione(String d){
        destinazione=d;
    }
    public void setDurata(int d){
        durata=d;
    }
    public void setCosto(int c){
        costo=c;
    }
    public String getDestinazione(){
        return destinazione;
    }
    public int getDurata(){
        return durata;
    }
    public double getCosto(){
        return costo;
    }
    public boolean equals(Object o){
        if(o instanceof Viaggi){
            if(destinazione.equalsIgnoreCase(((Viaggi) o).destinazione)&&durata==((Viaggi) o).durata&&costo==((Viaggi) o).costo){
                return true;
            }
        }
        return false;
    }
    public String toString(){
        return "Destinzazione: "+destinazione+", durata: "+durata+" giorni, costo: "+costo;
    }
}
