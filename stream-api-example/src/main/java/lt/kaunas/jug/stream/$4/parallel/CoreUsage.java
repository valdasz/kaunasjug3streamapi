package lt.kaunas.jug.stream.$4.parallel;

import java.util.stream.IntStream;

/**
 * 
 * Example to check CPU and cores usage. with parallel commented and uncommented
 * 
 * @author Valdas Zigas
 *
 */
public class CoreUsage {
	public static void main(String... args) {
		IntStream stream = IntStream.iterate(0, p -> p + 2);
		//		stream = stream.parallel();

		stream.reduce((x, y) -> (x * y) % 2);

	}
}
