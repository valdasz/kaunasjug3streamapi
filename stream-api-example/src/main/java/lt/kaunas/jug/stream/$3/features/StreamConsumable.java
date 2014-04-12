package lt.kaunas.jug.stream.$3.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamConsumable {

	public static void main(String... args) {
		List<String> pronouns = Arrays.asList("i", "you", "he", "she", "it",
				"we", "you", "they");

		Stream<String> stream = pronouns.stream();
		stream.forEach(p -> System.out.println(p));

		// exception, because already consumed
		stream.forEach(p -> System.out.println(p));
	}
}
