package com.jmartinez.Keel;

import com.jmartinez.Keel.Fuzzy_Rule_Learning.Algorithms.ClassifierFuzzyWangMendel;
import com.jmartinez.Keel.Shared.Parsing.ProcessConfig;
import core.*;

public class Main {


    //The Randomize object used in this class
    static Randomize rand;

    /**
     * <p>
     * This public static method runs the algorithm that this class concerns with.
     * </p>
     * @param args  Array of strings to sent parameters to the main program. The
     *              path of the algorithm's parameters file must be given.
     */
    public static void main(String[] args) {
        System.out.println("Me estoy ejecutando: Algoritmo Wang&Mendel");
        boolean tty=false;
        ProcessConfig pc=new ProcessConfig();
        System.out.println("Reading configuration file: ");
        String file = "/Users/Javi/development/WangMendelAlgorithm/resources/config0s0.txt";
        int aux = pc.fileProcess(file);
        if (aux<0) return;
        int algo=pc.parAlgorithmType;
        rand=new Randomize();
        rand.setSeed(pc.parSeed);
        ClassifierFuzzyWangMendel wm=new ClassifierFuzzyWangMendel();
        wm.wangMendelFuzzyClassifier(tty,pc);
    }
}
