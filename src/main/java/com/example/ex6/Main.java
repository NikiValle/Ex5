package com.example.ex6;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Viaggi[] v = new Viaggi[3];
        Scanner in = new Scanner(System.in);
        int scelta;
        String packType;
        int conta=0;
        do{
            System.out.println("Scegli un'opzione:" +
                    "\n 1_Nuovo pacchetto" +
                    "\n 2_Visualizza pacchetti" +
                    "\n 3_Calcola costo medio" +
                    "\n 4_Visualizza da costo minimo a massimo");
            scelta=in.nextInt();
            switch (scelta){
                case 1:
                    System.out.println("Inserisci il tipo di pacchetto: con volo, pasti o escursioni");
                    packType=in.next();
                    if(packType.equalsIgnoreCase("volo")){
                        v[conta]=new Volo();
                        System.out.println("Inserisci la destinazione");
                        v[conta].setDestinazione(in.next());
                        System.out.println("Inserisci la durata");
                        v[conta].setDurata(in.nextInt());
                        System.out.println("Andata e ritorno? Y/N");
                        if(in.next().equalsIgnoreCase("Y")){
                            v[conta].andataRitorno;
                        }
                        System.out.println("Inserisci il costo");
                        v[conta].setCosto(in.nextInt());
                    }
            }
        }while(scelta!=5);
    }
}
