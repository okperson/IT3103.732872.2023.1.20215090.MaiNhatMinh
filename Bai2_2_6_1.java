package lab01;
import javax.swing.JOptionPane;

public class Bai2_2_6_1 {

    public static void main(String[] args) {
        // Prompt user for coefficients 'a' and 'b'
        String inputA = JOptionPane.showInputDialog("MaiNhatMinh20215090_Enter coefficient 'a':");
        String inputB = JOptionPane.showInputDialog("MaiNhatMinh20215090_Enter coefficient 'b':");

        // Convert from string to double
        double coefficientA = Double.parseDouble(inputA);
        double coefficientB = Double.parseDouble(inputB);

        // Check if 'a' is not equal to zero
        if (coefficientA != 0) {
            double solution = -coefficientB / coefficientA;

            JOptionPane.showMessageDialog(null, "MaiNhatMinh20215090_The solution is: " + solution);
        } else {
            // If 'a' is zero, it's not a first-degree equation
            JOptionPane.showMessageDialog(null, "MaiNhatMinh20215090_This is not a first-degree equation");
        }
    }
}

