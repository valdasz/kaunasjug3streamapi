package lt.kaunas.jug.stream.$2.creation;

import java.util.stream.IntStream;

/**
 * Example streams creation with IntStream.of and ranges
 *
 * @author Valdas Zigas
 */
public class IntStreamFromIntStream {

	public static void main(String... args) {
		IntStream.of(new int[] { 1, 2, 3 }).forEach(System.out::println);

		System.out.println("<br>");
		// accepts only primitives!!
		// IntStream.of(new Integer[] { 1, 2, 3 }).forEach(System.out::println);

		// [inclusive, exclusive)
		IntStream.range(1, 3).forEach(System.out::println);

		System.out.println("<br>");
		// [inclusive, inclusive)
		IntStream.rangeClosed(1, 3).forEach(System.out::println);

	}

}
