package triangulosapp;

import javax.swing.*;

public class Triangles {
    static float a, b, c, h;

    public static void main(String[] args) {
        inputData();
    }

    private static void inputData() {
        a = Float.parseFloat(JOptionPane.showInputDialog(null, "Enter the length of side (a) of the triangle", "Triangle data", JOptionPane.INFORMATION_MESSAGE));
        b = Float.parseFloat(JOptionPane.showInputDialog(null, "Enter the length of side (b) of the triangle", "Triangle data", JOptionPane.INFORMATION_MESSAGE));
        c = Float.parseFloat(JOptionPane.showInputDialog(null, "Enter the length of side (c) of the triangle", "Triangle data", JOptionPane.INFORMATION_MESSAGE));
        h = Float.parseFloat(JOptionPane.showInputDialog(null, "Enter the height of the triangle", "Triangle data", JOptionPane.INFORMATION_MESSAGE));
    }
}
