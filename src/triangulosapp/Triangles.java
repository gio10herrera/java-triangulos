package triangulosapp;

import javax.swing.*;

public class Triangles {
    static double a, b, c, h, angleA, areaTriangle;
    static String typeOfTriangle;

    public static void main(String[] args) {
        inputData();
        checkTriangleType();
        calculateAnglesOfTheTriangle();
        areaOfTheTriangle();
    }

    private static void inputData() {
        a = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the length of side (a) of the triangle", "Triangle data", JOptionPane.INFORMATION_MESSAGE));
        b = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the length of side (b) of the triangle", "Triangle data", JOptionPane.INFORMATION_MESSAGE));
        c = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the length of side (c) of the triangle", "Triangle data", JOptionPane.INFORMATION_MESSAGE));
        h = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the height of the triangle", "Triangle data", JOptionPane.INFORMATION_MESSAGE));
    }

    private static void checkTriangleType() {
        if (a!=b && a!=c && b!=c){
            typeOfTriangle = "scalene triangle";
        } else if (a==b && a==c) {
            typeOfTriangle = "equilateral triangle";
        } else {
            typeOfTriangle = "isosceles triangle";
        }
    }

    private static void calculateAnglesOfTheTriangle() {
        switch (typeOfTriangle) {
            case "equilateral triangle" -> angleA = 60;
            case "isosceles triangle", "scalene triangle" -> lawOfCosines();
            default -> JOptionPane.showMessageDialog(null, "Unknown triangle", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void lawOfCosines() {
        angleA = Math.toDegrees(Math.acos((Math.pow(a,2)-Math.pow(b,2)-Math.pow(c,2)) / (-2*b*c)));
    }

    private static void areaOfTheTriangle() {
        areaTriangle = (b * h) / 2;
    }
}
