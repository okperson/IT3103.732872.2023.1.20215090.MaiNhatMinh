package lab01;
import java.util.Scanner;

public class Bai6_2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("MaiNhatMinh20215090_What's your name?");
		String strName = keyboard.nextLine();
		System.out.println("MaiNhatMinh20215090_How old are you?");
		int iAge = keyboard.nextInt();
		System.out.println("MaiNhatMinh20215090_How tall are you (m)?");
		double dHeight = keyboard.nextDouble();
		
		System.out.println("MaiNhatMinh20215090_Mrs/Ms. " + strName + ", " + iAge + "years old. "
				+ "MaiNhatMinh20215090_Your height is " + dHeight + ".");
		keyboard.close();
	}
}
