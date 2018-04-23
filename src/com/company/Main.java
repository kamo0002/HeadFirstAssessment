package com.company;

public class Main {

    public static void main(String[] args) {
        TreinMachinist machinist = new TreinMachinist("Kees");

        Trein trein = new Trein(machinist);
        System.out.println(trein);

        //Treinstation Goes 1ste klas instappers

        EersteKlasReiziger pieter = new EersteKlasReiziger ("Pieter");

        trein.instappen1steklas(pieter);
        System.out.println(trein);

        //Treinstation Goes 2de klas instappers

        TweedeKlasReiziger karel = new TweedeKlasReiziger ("Karel");
        TweedeKlasReiziger jan = new TweedeKlasReiziger ("Jan");
        TweedeKlasReiziger fred = new TweedeKlasReiziger ("Fred");
        TweedeKlasReiziger mohammed = new TweedeKlasReiziger ("Mohammed");

        trein.instappen2deklas(karel, jan, fred, mohammed);
        System.out.println(trein);

        //Treinstation Arnemuiden 2de klas instappers

        TweedeKlasReiziger klaas = new TweedeKlasReiziger("Klaas");
        TweedeKlasReiziger maartje = new TweedeKlasReiziger ("Maartje");
        trein.instappen2deklas(klaas, maartje);
        System.out.println(trein);

        //Treinstation Middelburg 1ste klas instappers

        EersteKlasReiziger frederick = new EersteKlasReiziger("Frederick");
        trein.instappen1steklas(frederick);
        System.out.println(trein);

        //controle tussen Arnemuiden en Middelburg
        Reiziger uitgestapte = (Reiziger) trein.uitstappen("Mohammed");
        System.out.println(trein);

        //Treinstation Vlissingen-Souburg
        Reiziger uitgestapte = (Reiziger) trein.uitstappen("Klaas");
        Reiziger uitgestapte = (Reiziger) trein.uitstappen("Maartje");
        System.out.println(trein);

        //Treinstation Vlissingen eindstation

        Reiziger uitgestapte = (Reiziger) trein.uitstappen("Frederick");
        Reiziger uitgestapte = (Reiziger) trein.uitstappen("Karel");
        Reiziger uitgestapte = (Reiziger) trein.uitstappen("Jan");
        Reiziger uitgestapte = (Reiziger) trein.uitstappen("Fred");
        Reiziger uitgestapte = (Reiziger) trein.uitstappen("Pieter");


        //Wie zit er in de bus?
        trein.printNames();


        TreinStation Goes = new TreinStation();
        Goes.rijdtBinnen(trein);

        trein.info();
        trein.printNames();
    }
}
