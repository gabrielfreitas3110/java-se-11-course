import java.math.BigDecimal;

public class Casting {
    static double i;
    public static void main(String[] args) {
        System.out.println(i);
        double d1 = 10.99d;
        float f1 = 10.98f;
        int i1;

        System.out.println("d1 = " + d1);
        System.out.println("f1 = " + f1);
        i1 = (int) f1;
        System.out.println("Castingh from float: " + i1);
        i1 = (int) d1;
        System.out.println(i1);
        System.out.println("Castingh from double: " + i1);

        d1 = Math.pow(i1, 2);
        i1 = (int) d1;

        System.out.println("i1 ao quadrado: " + i1);
        BigDecimal bd1;
        bd1 = BigDecimal.valueOf(f1);
        bd1 = bd1.pow(2);
        System.out.println("BigDecimal: " + bd1);

        StringBuilder sb = new StringBuilder();

        boolean input1 = true, input2 = false;  // Line 1
        boolean result1 = input1 = !input1; // Line 2
        boolean result2 = input2 = input1;  // Line 3
        boolean result3 = input1 == (result1=!input2);  // Line 4
        System.out.println(result1 + " " + input2 + " =! ");
        //System.out.println(input1+" " +input2 + " " +  result2 + " " + result3);
    }
}
