package lab01;
import javax.swing.JOptionPane;

public class Bai6_1 {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null, "MaiNhatMinh20215090_Do you want to change to the first class ticket?");
        JOptionPane.showMessageDialog(null, "MaiNhatMinh20215090_You've chosen: " + (option == JOptionPane.YES_OPTION?"YES":"NO"));
        System.exit(0);
    }
}
