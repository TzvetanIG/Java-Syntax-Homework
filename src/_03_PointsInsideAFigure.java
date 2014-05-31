import java.util.Scanner;

public class _03_PointsInsideAFigure {

	public static void main(String[] args) {

		double[] point = readPoint();

		String result = "Inside";

		if (isRangeInclud(point[0], 12.5, 22.5)
				&& isRangeInclud(point[1], 6, 13.5)) {

			if (isRange(point[0], 17.5, 20) && isRange(point[1], 8.5, 13.5)) {

				result = "Outside";

			}

		} else {

			result = "Outside";

		}

		System.out.println(result);

	}

	// check whether the number is in a range min max including.
	public static boolean isRangeInclud(double number, double min, double max) {

		return number >= min && number <= max;

	}

	// check whether the number is in a range min max.
	public static boolean isRange(double number, double min, double max) {

		return number > min && number < max;

	}

	// Read a point. Return a array with a two member. The first member is X
	// (index 0). The second is Y (index 1)
	public static double[] readPoint() {

		Scanner input = new Scanner(System.in);

		String[] inputArr = input.nextLine().split(" ");

		double[] point = new double[2];

		point[0] = Double.parseDouble(inputArr[0]);

		point[1] = Double.parseDouble(inputArr[1]);

		return point;

	}

}
