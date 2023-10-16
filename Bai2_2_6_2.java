package lab01;

import javax.swing.JOptionPane;

public class Bai2_2_6_2 {

    public static void main(String[] args) {
        // Input coefficients for equation 1
        double a1 = Double.parseDouble(JOptionPane.showInputDialog("MaiNhatMinh20215090_Enter coefficient 'a' for equation 1"));
        double b1 = Double.parseDouble(JOptionPane.showInputDialog("MaiNhatMinh20215090_Enter coefficient 'b' for equation 1"));
        double c1 = Double.parseDouble(JOptionPane.showInputDialog("MaiNhatMinh20215090_Enter coefficient 'c' for equation 1"));

        // Input coefficients for equation 2
        double a2 = Double.parseDouble(JOptionPane.showInputDialog("MaiNhatMinh20215090_Enter coefficient 'a' for equation 2"));
        double b2 = Double.parseDouble(JOptionPane.showInputDialog("MaiNhatMinh20215090_Enter coefficient 'b' for equation 2"));
        double c2 = Double.parseDouble(JOptionPane.showInputDialog("MaiNhatMinh20215090_Enter coefficient 'c' for equation 2"));

        // Calculate determinant
        double det = a1 * b2 - a2 * b1;

        // Check if the system has a unique solution
        if (det != 0) {
            // Calculate solutions
            double x = (c1 * b2 - c2 * b1) / det;
            double y = (a1 * c2 - a2 * c1) / det;

            JOptionPane.showMessageDialog(null, "MaiNhatMinh20215090_Solution for x: " + x + "\nSolution for y: " + y);
        } else {
            // Check if the system has infinitely many solutions
            if (a1 / a2 == b1 / b2 && b1 / b2 == c1 / c2) {
                JOptionPane.showMessageDialog(null, "MaiNhatMinh20215090_The system has infinitely many solutions");
            } else {
                // The system has no solution
                JOptionPane.showMessageDialog(null, "MaiNhatMinh20215090_The system has no solution");
            }
        }
    }
}
