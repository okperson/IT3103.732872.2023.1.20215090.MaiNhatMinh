package lab01;
import javax.swing.JOptionPane;

public class Bai2_2_5 {
    public static void main(String[] args) {

        String input1 = JOptionPane.showInputDialog("MaiNhatMinh20215090_Enter the first double number:");
        double num1 = Double.parseDouble(input1);

        String input2 = JOptionPane.showInputDialog("MaiNhatMinh20215090_Enter the second double number:");
        double num2 = Double.parseDouble(input2);

        double sum = num1 + num2;
        JOptionPane.showMessageDialog(null, "MaiNhatMinh20215090_Sum: " + sum);

        double difference = num1 - num2;
        JOptionPane.showMessageDialog(null, "MaiNhatMinh20215090_Difference: " + difference);

        double product = num1 * num2;
        JOptionPane.showMessageDialog(null, "MaiNhatMinh20215090_Product: " + product);

        if (num2 != 0) {
            double quotient = num1 / num2;
            JOptionPane.showMessageDialog(null, "MaiNhatMinh20215090_Quotient: " + quotient);
        } else {
            JOptionPane.showMessageDialog(null, "MaiNhatMinh20215090_Cannot divide by zero. Quotient is undefined.");
        }
    }
}
