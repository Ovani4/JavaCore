package main.java.com.ovani4.javacore.chapter05;

public class Search {
    public static void main(String[] args) {
        int [] nums = {5,4,7,8,9,52,3,2,1,5};
        int val = 51;
        boolean found = false;
        for (int x :
                nums) {
            if (x == val){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("Значение найдено");
        }else System.out.println("Значение не найдено");
    }
}
