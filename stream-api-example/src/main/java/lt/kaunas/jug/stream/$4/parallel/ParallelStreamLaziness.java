package lt.kaunas.jug.stream.$4.parallel;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamLaziness {
	public static void main(String... args) {
		List<String> pronouns = Arrays.asList("i", "you", "he", "she", "it",
				"we", "you", "they");

		// create stream range from 0 till pronouns.size() - 1
		IntStream intStream = IntStream.range(0, pronouns.size());
		// this line causes parallel processing
		intStream = intStream.parallel();

		// causes unordered processing
		intStream = intStream.unordered();

		Stream<String> stream = intStream.mapToObj(p -> {
			println("mapToObj: " + p);
			return pronouns.get(p);
		}).distinct().filter(p -> {
			println("filter: " + p);
			return p.length() == 3;
		});

		// sort descending will force mapping of all record
		// stream = stream.sorted((a, b) -> b.compareTo(a));

		println("Nothing called yet on stream till this point");
		Optional<String> result = stream.findFirst();
		// Optional<String> result = stream.findAny();

		println("result=" + result.orElse(null));

	}

	/**
	 * Println with thread name
	 * 
	 * @param p
	 *            value to print
	 */
	private static void println(String p) {
		System.out.println("(" + Thread.currentThread().getName() + ") " + p
				+ " ");
	}
}
