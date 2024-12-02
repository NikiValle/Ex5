package com.example.ex6;

public class Archive {
    Viaggi[] v = new Viaggi[100];
    public void newViaggio(String de, int du, double co, int conta){
        v[conta] = new Viaggi();
        v[conta].setDestinazione(de);
        v[conta].setDurata(du);
        v[conta].setCosto(co);
    }
    public void newVolo(String de, int du, double co, int conta){
        v[conta] = new Viaggi();
        v[conta].setDestinazione(de);
        v[conta].setDurata(du);
        v[conta].setCosto(co);
    }
    public void newPasto(String de, int du, double co, int conta){
        v[conta] = new Viaggi();
        v[conta].setDestinazione(de);
        v[conta].setDurata(du);
        v[conta].setCosto(co);
    }
    public void newEscursione(String de, int du, double co, int conta){
        v[conta] = new Viaggi();
        v[conta].setDestinazione(de);
        v[conta].setDurata(du);
        v[conta].setCosto(co);
    }
}
