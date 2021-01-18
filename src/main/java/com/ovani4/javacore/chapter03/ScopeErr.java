package main.java.com.ovani4.javacore.chapter03;

public class ScopeErr {
    public static void main(String[] args) {
        int bar = 1;
        {
            //int bar = 5;
        }
    }
}
