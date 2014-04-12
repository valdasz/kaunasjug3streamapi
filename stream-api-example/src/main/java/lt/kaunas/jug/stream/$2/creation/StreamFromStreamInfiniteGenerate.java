package lt.kaunas.jug.stream.$2.creation;

import java.util.stream.IntStream;

public class StreamFromStreamInfiniteGenerate {

	public static void main(String... args) {
		IntStream.generate(() -> (int) (System.nanoTime() % 100)).limit(10)
				.forEach(System.out::println);

	}

}