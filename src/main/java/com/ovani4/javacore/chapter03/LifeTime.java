package main.java.com.ovani4.javacore.chapter03;

public class LifeTime {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 3; x++) {
            int y = -1;
            System.out.println("у равно: " + y);

            y = 100;
            System.out.println("теперь у равно: " + y);
        }
    }
}
