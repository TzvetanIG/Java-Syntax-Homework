import java.util.Scanner;

public class _01_RectangleArea {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String[] inputArr = input.nextLine().split(" ");

		input.close();

		int a = Integer.parseInt(inputArr[0]);

		int b = Integer.parseInt(inputArr[1]);

		int area = a * b;

		System.out.println(area);

	}

}
