package a;

import a.d.StaticImportTest1;

import static a.d.StaticImportTest1.*;

import a.e.StaticImportTest2;

//Reference to 'APP_NAME' is ambiguous, both 'StaticImportTest1.APP_NAME'
// and 'StaticImportTest2.APP_NAME' match

import static a.e.StaticImportTest2.APP_NAME;

public class TestStatic {

    public static void main(String[] args) {

        //APP_NAME in line below can be referenced without class name
        //becauses of import static statment.
        System.out.println("APP_NAME = " + APP_NAME);

        //log method in line below can be referenced without class name
        //because of import static statment.
        log("This is StaticImportTest");

        //We instantiate StaticImportTest1() and execute a method on it
        new StaticImportTest1().printUniqueStatment();

        //APP_NAME in line below qualified by class name
        System.out.println("APP_NAME = " + StaticImportTest2.APP_NAME);

        //log method in line below qualified by class name
        StaticImportTest2.log("This is StaticImportTest");

        //We instantiate StaticImportTest2() and execute a method on it
        new StaticImportTest2().printUniqueStatment();
    }
}
