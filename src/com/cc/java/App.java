package com.cc.java;

public class App {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10.0, 10.0);
        Triangle triangle = new Triangle(10.0, 10.0);
        Circle circle = new Circle(5.0);

        ausgabe("------  Flächen ------");

        ausgabe("Fläche Rechteck: " + rectangle.area());
        ausgabe("Fläche Dreieck: " + triangle.area());
        ausgabe("Fläche Kreis: " + circle.area());

        ausgabe("------  Differenzen ------");
        ausgabe("Diff. r-t: " + areaDiff(rectangle, triangle));
        ausgabe("Diff. r-c: " + areaDiff(rectangle, circle));
    }

    // //1. Variante
    // private static double areaDiff(Rectangle r, Triangle t) {
    // return r.area() - t.area();
    // }

    // private static double areaDiff(Rectangle r, Circle c) {
    // return r.area() - c.area();
    // }

    private static void ausgabe(String outStr) {
        System.out.println(outStr);
    }

    // Besser Polymorphie
    private static double areaDiff(Shape s1, Shape s2) {
        return s1.area() - s2.area();
    }

}
