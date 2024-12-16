package com.example.ex6;

public class Archive {
    Viaggi[] v = new Viaggi[100];
    private int conta=0;
    public void addViaggi(Viaggi viaggio){
        v[conta] = viaggio;
        conta++;
    }
    public int getConta(){
        return conta;
    }
    public void setConta(int c){
        conta=c;
    }
    public void calcolaTuttiCosti(){
        for(int i=0;i<conta;i++){
            v[conta].calcolaCosto();
        }
    }
    public Viaggi getViaggio(int i){
        return v[i];
    }
}
