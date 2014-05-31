import java.util.Scanner;
import java.lang.*;

public class _06_FormatingNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a = input.nextInt();

		float b = input.nextFloat();

		float c = input.nextFloat();

		String hex = Integer.toHexString(a);

		String bin = Integer.toBinaryString(a);

		System.out.printf("|%-10S|%s|%10.2f|%-10.3f|", hex,
				String.format("%10s", bin).replace(" ", "0"), b, c);

	}

}
