package main.java.com.ovani4.javacore.chapter05;

public class StringSwitch {
    public static void main(String[] args) {
        String s = "two";
        switch (s){
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("two");
                break;
            case "three":
                System.out.println("three");
                break;
            default:
                System.out.println("no one of switch value");
        }
    }
}
