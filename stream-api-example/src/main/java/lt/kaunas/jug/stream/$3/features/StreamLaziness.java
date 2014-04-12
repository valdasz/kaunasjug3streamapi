package lt.kaunas.jug.stream.$3.features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamLaziness {

	public static void main(String... args) {
		List<String> pronouns = Arrays.asList("i", "you", "he", "she", "it",
				"we", "you", "they");

		// create stream range from 0 till pronouns.size() - 1
		IntStream intStream = IntStream.range(0, pronouns.size());

		Stream<String> stream = intStream.mapToObj(p -> {
			System.out.println("mapToObj: " + p);
			return pronouns.get(p);
		}).distinct().filter(p -> {
			System.out.println("filter: " + p);
			return p.length() == 3;
		});

		System.out.println("Nothing called yet on stream till this point");
		Optional<String> result = stream.findFirst();

		System.out.println(result.orElse(null));
	}
}
