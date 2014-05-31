import java.util.Scanner;

public class _08_CountOfEqualBitPairs {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int number = input.nextInt();

		int count = 0;

		for (int i = 0; i < Integer.toBinaryString(number).length(); i++) {

			if (isFindPair(number, i, "11")) {
				count++;
			}

			if (isFindPair(number, i, "00")) {
				count++;
			}

		}

		System.out.println(count);
	}

	public static boolean isFindPair(int number, int position, String bits) {

		if (number == 0) {
			return false;
		}

		boolean isFindPair = false;

		int bitsAsInt = Integer.parseInt(bits, 2);

		int shift = position;

		int mask = Integer.parseInt(bits.replace("0", "1"), 2);

		int lastBits = (number >> shift) & mask;

		if (bitsAsInt == lastBits) {
			isFindPair = true;
		}

		return isFindPair;
	}

}
