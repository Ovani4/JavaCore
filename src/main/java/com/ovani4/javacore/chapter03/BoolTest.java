package main.java.com.ovani4.javacore.chapter03;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b равно " + b);
        b = true;
        System.out.println("b равно " + b);

        if (b) System.out.println("этот код выполнится");
        b = false;
        if (b) System.out.println("этот код не выполнится");

        System.out.println("10 > 9 равно " + (10 > 9));
    }
}
