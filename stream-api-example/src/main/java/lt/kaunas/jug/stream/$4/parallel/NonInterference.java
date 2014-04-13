package lt.kaunas.jug.stream.$4.parallel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NonInterference {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>(Arrays.asList("kaunas-jug",
				"meeting"));
		// Stream<String> sl = l.stream();
		Stream<String> sl = l.parallelStream();
		l.add("#3");
		String s = sl.collect(Collectors.joining(" "));
		System.out.println(s);
	}
}
