import java.util.Scanner;

public class _09_PointsInsideTheHouse {

	public static void main(String[] args) {

		double[] point = readPoint();

		String result = "Outside";

		if (isInsideLeftRectangle(point) || isInsideRightRectangle(point)
				|| isInsideTriangle(point)) {

			result = "Inside";

		}

		System.out.println(result);

	}

	public static boolean isInsideTriangle(double[] point) {

		double[] p1 = { 12.5, 8.5 };

		double[] p2 = { 17.5, 3.5 };

		double valueOfLineFunction1 = getValueOfLineFunction(p1, p2, point[0]);

		double[] p3 = { 22.5, 8.5 };

		double valueOfLineFunction2 = getValueOfLineFunction(p3, p2, point[0]);

		boolean result = false;

		if (valueOfLineFunction1 <= point[1]
				&& valueOfLineFunction2 <= point[1] && point[1] <= 8.5) {

			result = true;

		}

		return result;
	}

	public static boolean isInsideLeftRectangle(double[] point) {

		boolean result = false;

		if (isRange(point[0], 12.5, 17.5) && isRange(point[1], 8.5, 13.5)) {

			result = true;

		}

		return result;

	}

	public static boolean isInsideRightRectangle(double[] point) {

		boolean result = false;

		if (isRange(point[0], 20, 22.5) && isRange(point[1], 8.5, 13.5)) {

			result = true;

		}

		return result;
	}

	// check whether the number is in a range min max.
	public static boolean isRange(double number, double min, double max) {

		return number >= min && number <= max;

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

	public static double getValueOfLineFunction(double[] point1,
			double[] point2, double x) {

		double a = (point2[1] - point1[1]) / (point2[0] - point1[0]);

		double b = point1[1]
				- ((point2[1] - point1[1]) / (point2[0] - point1[0]))
				* point1[0];

		double y = a * x + b;

		return y;
	}

}
