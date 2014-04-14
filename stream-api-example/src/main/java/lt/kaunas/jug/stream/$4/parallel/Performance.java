package lt.kaunas.jug.stream.$4.parallel;

import java.util.stream.IntStream;

public class Performance {
	public static void main(String... args) {
		int end = 2_000_000_000;
		int iterations = 10;

		System.out.println("\nSynchronous");

		for (int i = 0; i < iterations; i++) {
			IntStream stream = IntStream.range(1, end);
			processStream(stream);
		}

		System.out.println("\nParallel");
		for (int i = 0; i < iterations; i++) {

			IntStream stream = IntStream.range(1, end).parallel();
			processStream(stream);
		}

	}

	private static void processStream(IntStream stream) {
		long start = System.currentTimeMillis();
		int result = stream.sum();
		long duration = (System.currentTimeMillis() - start);
		System.out.println("result=" + result + " duration: " + duration);
	}
}
