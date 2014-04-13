package lt.kaunas.jug.stream.$4.parallel;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Example of streams with stateful beheviour. Don't do this !!!
 * 
 * @author Valdas Zigas
 *
 */
public class StatefulBehaviour {
	public static void main(String[] args) {
		Set<Integer> seen = Collections.synchronizedSet(new HashSet<>());
		List<Integer> numbers = Arrays.asList(1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3);

		List<Integer> result = numbers.parallelStream().map(e -> {
			return seen.add(e) ? 0 : e;
		}).collect(Collectors.toList());
		// non predicted results
		System.out.println("seen=" + seen);
		System.out.println("result=" + result);
	}
}
