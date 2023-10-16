package lab01;
import javax.swing.JOptionPane;

public class Bai2_2_4 {

    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "MaiNhatMinh20215090_You've just entered: ";

        strNum1 = JOptionPane.showInputDialog(
                null,
                "MaiNhatMinh20215090_Please input the first number:",
                "MaiNhatMinh20215090_Input the first number",
                JOptionPane.INFORMATION_MESSAGE
        );
        strNotification += strNum1 + " and ";

        strNum2 = JOptionPane.showInputDialog(
                null,
                "MaiNhatMinh20215090_Please input the second number:",
                "MaiNhatMinh20215090_Input the second number",
                JOptionPane.INFORMATION_MESSAGE
        );
        strNotification += strNum2;

        JOptionPane.showMessageDialog(
                null,
                strNotification,
                "MaiNhatMinh20215090_Show two numbers",
                JOptionPane.INFORMATION_MESSAGE
        );

        System.exit(0);
    }
}

