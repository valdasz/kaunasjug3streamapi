package lt.kaunas.jug.stream.$4.parallel;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * Example with stream.reduce with non-associative function.
 * 
 * @author Valdas Zigas
 *
 */
public class ReduceAssociativity {

	public static void main(String... args) {
		int end = 4;

		// sequential
		IntStream stream = IntStream.rangeClosed(1, end);
		callReduce(stream);

		// parallel produces different result with non asociative (x-y). (x + y)
		// would produce same results
		stream = IntStream.rangeClosed(1, end).parallel();
		callReduce(stream);
	}

	private static void callReduce(IntStream stream) {
		System.out.println("parallel=" + stream.isParallel());

		// compact form without extra logging
		// OptionalInt rez = stream.reduce((x, y) -> x - y);

		OptionalInt rez = stream.reduce((x, y) -> {
			int result = x - y;
			System.out.println((Thread.currentThread().getName()) + " x=" + x
					+ " y=" + y + " r=" + result);
			return result;

		});
		System.out.println("result=" + rez.getAsInt() + "\n");
	}
}
