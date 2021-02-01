package main.java.com.ovani4.javacore.chapter06;

class Box {
    double width;
    double height;
    double depth;

    double volume(){

        return width * height * depth;
    }

    void setDim (double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}
class BoxDemo{
    public static void main(String[] args) {
        Box myBox = new Box();
        Box myBox2 = new Box();
        double vol;

        myBox.setDim(10,5,15);
        myBox2.setDim(15,6,4);

//        myBox.width = 10;
//        myBox.height = 20;
//        myBox.depth = 15;
//
//        myBox2.width = 2;
//        myBox2.height = 4;
//        myBox2.depth = 6;

//        vol = myBox.depth * myBox.height * myBox.width;
//        System.out.println("Объем равен " + vol);
//
//        vol = myBox2.depth * myBox2.height * myBox2.width;
//        System.out.println("Объем равен " + vol);

        System.out.println("Объем равен " + myBox.volume());
        System.out.println("Объем равен " + myBox2.volume());

    }
}
