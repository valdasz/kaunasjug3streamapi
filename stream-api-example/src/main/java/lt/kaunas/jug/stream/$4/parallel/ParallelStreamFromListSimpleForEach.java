package lt.kaunas.jug.stream.$4.parallel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * Example with parallel stream creation from list
 *
 * @author Valdas Zigas
 */
public class ParallelStreamFromListSimpleForEach {

	public static void main(String... args) {
		List<String> pronouns = new ArrayList<>(Arrays.asList("i", "you", "he",
				"she", "it", "we", "you", "they"));

		pronouns.parallelStream().forEach(
				p -> System.out.println("(" + Thread.currentThread().getName()
						+ ") " + p + " "));

	}
}
