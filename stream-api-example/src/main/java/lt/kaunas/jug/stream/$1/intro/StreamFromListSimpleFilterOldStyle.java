package lt.kaunas.jug.stream.$1.intro;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * 
 * Example with stream creation from list. Filter. No lambdas
 * 
 * @author Valdas Zigas
 */
public class StreamFromListSimpleFilterOldStyle {
	public static void main(String... args) {
		List<String> pronouns = Arrays.asList("i", "you", "he", "she", "it",
				"we", "you", "they");

		pronouns.stream().distinct().filter(new Predicate<String>() {

			@Override
			public boolean test(String p) {
				return p.length() == 3;
			}
		}).forEach(new Consumer<String>() {

			@Override
			public void accept(String p) {
				System.out.println(p);

			}
		});

	}
}
