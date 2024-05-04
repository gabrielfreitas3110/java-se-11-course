package a.e;

public class StaticImportTest2 {

    public static final String APP_NAME = "Second";

    public static void log(String statment) {
        System.out.println("Second Logging statment: " + statment);
    }

    public void printUniqueStatment() {
        System.out.println("I am Second");
    }
}
