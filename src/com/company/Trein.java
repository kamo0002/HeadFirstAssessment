package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Trein {

    private TreinMachinist machinist;
    private HashMap<String, Nameable> stoelen = new LinkedHashMap<String, Nameable>();

    public Trein (TreinMachinist machinist) {

        this.machinist = machinist;
    }

    public void instappen1steklas(Nameable nameable1_1, Nameable nameable1_2, Nameable nameable1_3) {
        instappen(nameable1_1);
        instappen(nameable1_2);
        instappen(nameable1_3);
    }

    public void instappen2deklas(Nameable nameable2_1, Nameable nameable2_2, Nameable nameable2_3, Nameable nameable2_4) {
        instappen(nameable2_1);
        instappen(nameable2_2);
        instappen(nameable2_3);
        instappen(nameable2_4);
    }

    public void instappen1steklas(Nameable nameable) {
        String key = nameable.getName();
        Nameable value = nameable;
        this.stoelen.put(key, value);
        showInfo(nameable, " is ingestapt in de 1ste klas.");
    }

    public void instappen2deklas(Nameable nameable) {
        String key = nameable.getName();
        Nameable value = nameable;
        this.stoelen.put(key, value);
        showInfo(nameable, " is ingestapt in de 2de klas.");
    }

    private void showInfo(Nameable uitgestapte, String actie) {

        System.out.println(uitgestapte.getName()+ actie);
    }

    private int getCount() {
        return stoelen.size();
    }

    public Nameable uitstappen(String name) {

        if (!stoelen.containsKey(name)) {
            System.out.println(name + " zit niet in de bus.");
            return null;
        }
        Nameable uitgestapte = stoelen.get(name);
        stoelen.remove(name);
        showInfo(uitgestapte, " is uitgestapt.");
        return uitgestapte;
    }

    public String[] getNames() {
        String[] names = new String[getCount()];
        int i = 0;
        for (String key : stoelen.keySet()) {
            names[i] = key;
            i++;
        }
        return names;
    }
    public void info() {
        System.out.println(this);
    }

    public String toString() {
        return "Er zitten "+getCount()+" mensen in de trein.";
    }

    public void printNames() {
        System.out.println("Deze mensen zitten in de trein:");
        for(Map.Entry<String, Nameable> entry : stoelen.entrySet()) {
            String key = entry.getKey();
            System.out.println("- "+key);
        }
    }

}

