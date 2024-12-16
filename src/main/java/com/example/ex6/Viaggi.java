package com.example.ex6;

public abstract class Viaggi {
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
    public void setCosto(double c){
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
    public abstract boolean equals(Object o);
    public abstract String toString();
    public abstract double calcolaCosto ();
}
