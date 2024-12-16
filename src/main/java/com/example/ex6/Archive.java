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
    public String calculateMediumCosts(){
        double d=0;
        for(int i=0;i<conta;i++){
            d+=v[i].getCosto();
        }
        return d/conta+"";
    }public Viaggi minCost(){
        double d=v[0].getCosto();
        int b=0;
        for(int i=1;i<conta;i++){
            if(d>v[i].getCosto()) {
                d = v[i].getCosto();
                b=i;
            }
        }
        return v[b];
    }
    public Viaggi maxCost(){
        double d=0;
        int b=0;
        for(int i=1;i<conta;i++){
            if(d>v[i].getCosto()) {
                d = v[i].getCosto();
                b=i;
            }
        }
        return v[b];
    }
}
