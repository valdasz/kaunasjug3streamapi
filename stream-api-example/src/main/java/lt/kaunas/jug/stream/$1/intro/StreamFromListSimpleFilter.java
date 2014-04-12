package lt.kaunas.jug.stream.$1.intro;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * Example with stream creation from list. Filter
 * 
 * @author Valdas Zigas
 */
public class StreamFromListSimpleFilter {

	public static void main(String... args) {
		List<String> pronouns = Arrays.asList("i", "you", "he", "she", "it",
				"we", "you", "they");

		pronouns.stream().distinct().filter(p -> p.length() == 3)
				.forEach(p -> System.out.println(p));

	}
}
