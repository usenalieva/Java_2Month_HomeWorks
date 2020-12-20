package com.makhabatusen;

import com.makhabatusen.classwork.animals.Dog;
import com.makhabatusen.classwork.figures.*;
import com.makhabatusen.classwork.pen.Pen;
import com.makhabatusen.classwork.pen.Pencil;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
/* MAIN TASK:
a) Complete the practical assignment from the presentation.
b) Create a 2-level hierarchy of 4 classes (1st - parent -> 2nd, 3rd, 4th - children, with different fields).
c) Create a Printable Interface with a void print() method;
d) Implement the Printable interface with 2nd, 3rd and 4th classes, override the interface method so that it prints
whole information about the object.
e)  In the Main class create the return method createObject (String className), which can create objects of the 2nd,
3rd and 4th  class and after creating and setting properties for the object, the method returns a reference to the object (console).
Switch can be used in order to determine what type you need to create an object instance.
f) In the main class Main create 3 different objects of  2nd, 3rd and 4th classes using the createObject method,
and print information on them using the print() method */


        Pen pen = new Pen("pen");
        Pencil pencil = new Pencil("pencil", 5);
        System.out.println(pen.getName());
        System.out.println(pencil.getName() + " " + pencil.getId());
        Pen pen1 = pencil;
        System.out.println(pen1.getName());


        Circle c = new Circle("Circle", 2.0);
        Square square = new Square("Square", 5);

        Figure[] figures = new Figure[]{c, square, new Triangle("Triangle", 3, 5, 6),
                new Rectangle("Rectangle", 3, 4),
                new Circle("Circle", 6.0),
                new Square("Square", 7)};

        for (Figure figure : figures) {
            System.out.println(figure.getName() + " " + figure.draw());
            figure.calculatePerimeter();
        }


        Dog dog = new Dog("Dog");
        System.out.println(dog.getName() + " " + dog.draw());
        System.out.println(dog.callSound());

        // Short way
        createObject("Sofa").print();
        createObject("Bed").print();
        createObject("Wardrobe").print();
        createObject1("");


        // The second way with Array and For loop
        // Here Furniture can also be replaced with Printable
        Furniture sofa = createObject("Sofa");
        Furniture bed = createObject("Bed");
        Furniture wardrobe = createObject("Wardrobe");

        Furniture[] furniture = {sofa, bed, wardrobe};
        for (Furniture furn : furniture) {
            furn.print();
        }
    }


    // createObject(String classname) method using Enhanced Switch Statement
    // Here Furniture can also be replaced with Printable

    public static Furniture createObject(String className) {

        return switch (className) {
            case "Sofa" -> new Sofa(500, "Art-Deco", "Wood");
            case "Bed" -> new Bed(400, "Hi-Tech", 2, "Latex");
            case "Wardrobe" -> new Wardrobe(450, "Modern", 6, "Walnut");
            default -> null;
        };

    }

    public static void createObject1(String className) throws Exception{


         switch (className) {

            case "Sofa" -> new Sofa(500, "Art-Deco", "Wood");
            case "Bed" -> new Bed(400, "Hi-Tech", 2, "Latex");
            case "Wardrobe" -> new Wardrobe(450, "Modern", 6, "Walnut");
            default -> throw new RuntimeException("Wrong Class", new RuntimeException());
        };
    }
}






