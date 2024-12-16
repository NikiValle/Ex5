package com.example.ex6;

public class Archive {
    Viaggi[] v = new Viaggi[100];
    public void newVolo(String de, int du, double co,boolean aR, int conta){
        v[conta] = new Volo(de, du, co, aR);

    }
    public void newPasto(String de, int du, double co, int conta){
        v[conta] = new Pasti();
        v[conta].setDestinazione(de);
        v[conta].setDurata(du);
        v[conta].setCosto(co);
    }
    public void newEscursione(String de, int du, double co, int conta){
        v[conta] = new Escursioni();
        v[conta].setDestinazione(de);
        v[conta].setDurata(du);
        v[conta].setCosto(co);
    }
}
