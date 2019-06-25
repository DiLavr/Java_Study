package chapter_05_Loops;

public class Lav_05_01 {
	public static void main(String[] args) {

		final double km = 1.609;

		System.out.println("Miles" + "\tKilometers");
		for (int i = 1; i < 20; ++i) {
			System.out.printf("%-13d%-10.3f\n", i, i * km);
		}

	}
}