package a.c;

//This is redundant but OK, always included
import java.lang.*;

//This is redudant but OK, code will compile
import a.c.ImportTests;

//This includes classes defined in a but not a.b
//import a.*;

//Wrong way
import a.b.PackageTests.*;

//Correct way
import a.b.PackageTests;

public class ImportTests {
    public static void main(String[] args) {
        System.out.println("Import Tests");
        PackageTests.main(args);
    }
}
