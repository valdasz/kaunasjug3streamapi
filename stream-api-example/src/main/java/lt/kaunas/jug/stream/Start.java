package lt.kaunas.jug.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Start {

	public static void main(String[] args) {
		List<String> elements = new ArrayList<>(Arrays.asList("as", "tu",
				"jis", "ji", "mes", "jūs", "jie", "jos"));

		elements.parallelStream().forEach(
				p -> System.out.println("s1:("
						+ Thread.currentThread().getName() + ") " + p + " "));
		System.out.println();
		Stream<String> stream = elements.stream();
		// stream.filter(p -> p.startsWith("j")).forEach(
		// p -> System.out.println(p));

		stream.map(m -> m.length()).distinct()
				.sorted((v1, v2) -> v2.compareTo(v1))
				.forEach(p -> System.out.println("1:" + p));
		// stream.flatMap(m -> m.length()).forEach(
		// p -> System.out.println("1:" + p));
		// stream.forEach(p -> System.out.println("1:" + p));

	}
}
