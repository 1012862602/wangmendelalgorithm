package com.jmartinez;

public class Main {

    /**
     * <p>
     * This public static method runs the algorithm that this class concerns with.
     * </p>
     * @param args  Array of strings to sent parameters to the main program. The
     *              path of the algorithm's parameters file must be given.
     */
    public static void main(String[] args) {
        boolean tty=false;
        ProcessConfig pc=new ProcessConfig();
        System.out.println("Reading configuration file: "+args[0]);
        if (pc.fileProcess(args[0])<0) return;
        int algo=pc.parAlgorithmType;
        rand=new Randomize();
        rand.setSeed(pc.parSeed);
        ClassifierFuzzyWangMendel wm=new ClassifierFuzzyWangMendel();
        wm.wangMendelFuzzyClassifier(tty,pc);
    }
}
