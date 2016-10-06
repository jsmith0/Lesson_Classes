package com.company;

/**
 * Created by js456 on 10/6/16.
 */
public class Circle {
    //now we are going to make a constructor
    public double radius;
    public Circle (double r)
    {
        radius = r;
    }

    public double area()
    {
        double a = Math.PI * radius * radius;
        return a;
    }
    public double circum()
    {
        double c = 2 * Math.PI * radius;
        return c;
    }
}
