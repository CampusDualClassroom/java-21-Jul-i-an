package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {
    private static Set<String> colHashSet;
    private static Set<String> colTreeSet;

    public static Set<String> createHashSet() {
        Set<String> colSet = new HashSet<>(0);
        addElementToSet(colSet, "ELEMENT KPRBC");
        addElementToSet(colSet, "ELEMENT YPBTM");
        addElementToSet(colSet, "ELEMENT AADXU");
        addElementToSet(colSet, "ELEMENT RXCGJ");
        addElementToSet(colSet, "ELEMENT WYMVD");
        addElementToSet(colSet, "ELEMENT WFGEJ");
        addElementToSet(colSet, "ELEMENT TYGBS");
        addElementToSet(colSet, "ELEMENT MAPTK");
        addElementToSet(colSet, "ELEMENT GJXVE");
        addElementToSet(colSet, "ELEMENT BAFGL");
        return colSet;
    }

    public static Set<String> createTreeSet() {
        Set<String> treeSet = new TreeSet();

        treeSet = createHashSet();

        return  treeSet;
    }

    private static void printSet(Set<String> customSet) {
        for(String elemento: customSet){
            System.out.println(elemento);
        }

    }


    public static boolean addElementToSet(Set<String> set, String elementToAdd) {
        return set.add(elementToAdd);
    }

    public static void main(String[] args) {
        Set<String> colHashSet = createHashSet();
        Set<String> colTreeSet = createTreeSet();

        addElementToSet(colHashSet, "ELEMENT AAA");


        if (!addElementToSet(colHashSet, "ELEMENT AAA")) {
            System.out.println("No se ha podido agregar el elemento: ELEMENT AAA");
        }

        printSet(colHashSet);
        System.out.println("===================================");
        printSet(colTreeSet);

    }

}
