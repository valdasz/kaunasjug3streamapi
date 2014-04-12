package lt.kaunas.jug.stream.$1.intro;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * 
 * Example with stream creation from list. No lambdas
 * 
 * @author Valdas Zigas
 */
public class StreamFromListSimpleForEachOldStyle {

	public static void main(String... args) {
		List<String> pronouns = Arrays.asList("i", "you", "he", "she", "it",
				"we", "you", "they");

		pronouns.stream().forEach(new Consumer<String>() {

			@Override
			public void accept(String p) {
				System.out.println(p);

			}
		});

	}
}
