package lt.kaunas.jug.stream.$2.creation;

import java.util.regex.Pattern;

public class StreamFromPatternSplitAsStream {
	public static void main(String[] args) {
		Pattern patern = Pattern.compile(",");
		patern.splitAsStream("This, is, Java8, Stream").forEach(
				System.out::println);

	}
}
