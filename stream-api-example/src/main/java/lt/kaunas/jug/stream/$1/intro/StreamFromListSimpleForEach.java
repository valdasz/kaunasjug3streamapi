package lt.kaunas.jug.stream.$1.intro;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * Example with stream creation from list
 * 
 * @author Valdas Zigas
 */
public class StreamFromListSimpleForEach {

	public static void main(String... args) {
		List<String> pronouns = Arrays.asList("i", "you", "he", "she", "it",
				"we", "you", "they");

		pronouns.stream().forEach(p -> System.out.println(p));
		// pronouns.stream().forEach(System.out::println);
	}
}
