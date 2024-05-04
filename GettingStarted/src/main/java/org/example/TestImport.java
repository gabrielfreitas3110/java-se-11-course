package org.example;

//A single-type-import declaration
//import org.example.garden.vegetable.VineVegetable;

//type-import-on-demand-declaration
import org.example.garden.vegetable.*;

//Ambiguos import
import org.example.nursey.vegetable.*;

import org.example.garden.vegetable.*;

//A single-type-import declaration (is already defined in a single-type import)
//import org.example.nursey.vegetable.VineVegetable;



public class TestImport {
    public static void main(String[] args) {

        //Fully-Qualified Class Name Example
        java.lang.String s = "We are testing ways to import classes";
        System.out.println(s);

        //String class in the java.lang package, simples class name
        String s2 = "We are testing ways to import classes";
        System.out.println(s);

        //We use simple name because we specified location in the import
        //statment
        VineVegetable.main(args);
        org.example.garden.vegetable.VineVegetable.main(args);
        org.example.nursey.vegetable.VineVegetable.main(args);
    }
}

 //is already defined in this compilation unit
class VineVegetable {
    public static void main(String[] args) {
        System.out.println("I am a local VineVegetable");
    }
}