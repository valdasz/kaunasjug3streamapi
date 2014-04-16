package lt.kaunas.jug.stream.$2.creation;

import java.util.stream.Stream;

/**
 * Example streams creation with Stream.of
 *
 */
public class StreamFromStreamOf {

	public static void main(String... args) {
		Stream.of("This", "is", "Java8", "Stream").forEach(System.out::println);

		Stream.of(new Integer[] { 1, 2, 3 }).forEach(System.out::println);

		// stream of one element of array type
		Stream.of(new int[] { 1, 2, 3 }).forEach(System.out::println);

		// Stream.of(new int[] { 1, 2, 3 }, new int[] { 4, 5, 6 }).forEach(
		// p -> Arrays.stream(p).forEach(System.out::println));

		// Stream.of(new int[] { 1, 2, 3 }, new int[] { 4, 5, 6 })
		// .flatMapToInt((p) -> Arrays.stream(p))
		// .forEach(System.out::println);

	}
}
