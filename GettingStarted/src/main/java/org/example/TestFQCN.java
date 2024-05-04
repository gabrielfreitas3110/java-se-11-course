package org.example;

public class TestFQCN {
    public static void main(String[] args) {
        //Fully-Qualified Class Name Example
        java.lang.String s = "We are testing ways to import classes";
        System.out.println(s);

        //String class in the java.lang package, simples class name
        String s2 = "We are testing ways to import classes";
        System.out.println(s);

        //Any class in any other package, must be qualified or imported
        org.example.garden.vegetable.VineVegetable.main(args);
    }
}
