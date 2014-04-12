package lt.kaunas.jug.stream.$3.features;

import java.util.Arrays;
import java.util.List;

public class StreamFunctional {
	public static void main(String... args) {
		List<String> pronouns = Arrays.asList("i", "you", "he", "she", "it",
				"we", "you", "they");

		pronouns.stream().distinct().filter(p -> p.length() == 3)
				.forEach(p -> System.out.println(p));

		// source list not changed
		System.out.println(pronouns);
	}
}
