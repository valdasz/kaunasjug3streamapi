package lt.kaunas.jug.stream.$4.parallel;

import java.util.stream.IntStream;

public class ReduceAssociativity {

	public static void main(String... args) {

		IntStream stream = IntStream.range(0, 100);
		int sum = stream
				.parallel()
				.unordered()
				.reduce(0,
						(x, y) -> {
							System.out.println(Thread.currentThread().getName()
									+ " x=" + x + " y=" + y);
							return y + (int) Math.pow(2, y % 10);
						});
		System.out.println("sum=" + sum);
	}
}
