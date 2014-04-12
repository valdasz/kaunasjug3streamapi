package lt.kaunas.jug.stream.$2.creation;

import java.util.Arrays;

/**
 * Example streams creation with Arrays.stream
 * 
 * @author Valdas Zigas
 *
 */
public class StreamFromArraysStream {

	public static void main(String... args) {
		Arrays.stream(new String[] { "This", "is", "Java8", "Stream" })
				.forEach(System.out::println);

		// returns Stream
		Arrays.stream(new Integer[] { 1, 2, 3 }).forEach(System.out::println);

		// returns IntStream
		Arrays.stream(new int[] { 1, 2, 3 }).forEach(System.out::println);
	}
}
