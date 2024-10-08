package triangulosapp;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Triangles {
    static double a, b, c, h, angleA, areaTriangle;
    static String typeOfTriangle;

    public static void main(String[] args) {
        inputData();
        checkTriangleType();
        calculateAnglesOfTheTriangle();
        areaOfTheTriangle();
        showResults();
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
        angleA = Math.round(angleA * 100) / 100.0;
    }

    private static void areaOfTheTriangle() {
        areaTriangle = (b * h) / 2;
    }

    private static void showResults() {
        String result = "\t\tTRIANGLES\n\nSide a: " + a + "\t\tSide b: " + b + "\t\tSide c: " + c + "\n\n\t\tHeight (h): " + h + "\n\n\nThe triangle is: " + typeOfTriangle + "\nThe degree of angle A is: " + angleA + " degrees" + "\nThe area of the triangle is: " + areaTriangle;
        //JTextArea Configuration
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setSize(520, 400);
        textArea.setBorder(new EmptyBorder(5, 45, 5, 5));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setText(result);
        JOptionPane.showMessageDialog(null, textArea, "Triangles", JOptionPane.INFORMATION_MESSAGE);
    }
}
