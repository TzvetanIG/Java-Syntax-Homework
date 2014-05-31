import java.util.Scanner;

public class _02_TriangleArea {

	public static void main(String[] args) {

		int[] point1 = readXY();
		int[] point2 = readXY();
		int[] point3 = readXY();

		int area = Math
				.abs((point3[0] * (point1[1] - point2[1]) + point1[0]
						* (point2[1] - point3[1]) + point2[0]
						* (point3[1] - point1[1])) / 2);

		System.out.println(area);
	}

	public static int[] readXY() {

		Scanner input = new Scanner(System.in);

		String[] inputArr = input.nextLine().split(" ");

		int[] point = new int[2];

		point[0] = Integer.parseInt(inputArr[0]);

		point[1] = Integer.parseInt(inputArr[1]);

		return point;

	}
}
