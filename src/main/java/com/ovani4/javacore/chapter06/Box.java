package main.java.com.ovani4.javacore.chapter06;

class Box {
    double width;
    double height;
    double depth;

    void volume(){
        System.out.print("Объем равен ");
        System.out.println(width * height * depth);
    }
}
class BoxDemo{
    public static void main(String[] args) {
        Box myBox = new Box();
        Box myBox2 = new Box();
        double vol;

        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        myBox2.width = 2;
        myBox2.height = 4;
        myBox2.depth = 6;

//        vol = myBox.depth * myBox.height * myBox.width;
//        System.out.println("Объем равен " + vol);
//
//        vol = myBox2.depth * myBox2.height * myBox2.width;
//        System.out.println("Объем равен " + vol);

        myBox.volume();
        myBox2.volume();

    }
}
