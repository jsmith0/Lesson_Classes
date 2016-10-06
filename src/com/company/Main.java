package com.company;



public class Main {

    public static void main(String[] args) {
	//you can only ever have 1 main method, like 1 driver in a car. the rest are passengers
        //this is entansiating an object
        Circle cir1 = new Circle(14.3);

        double area1 = cir1.area();
        System.out.println(area1);

        double c1 = cir1.circum();
        System.out.println(c1);
    }
}
