package lt.kaunas.jug.stream.$2.creation;

import java.util.stream.IntStream;

public class StreamFromStreamInfiniteIterate {

	public static void main(String... args) {
		// starts from 0, then (f(0)), then (f(f(0)) ..
		IntStream.iterate(0, p -> p + 2).limit(10).forEach(System.out::println);

	}
}
