package lt.kaunas.jug.stream.$2.creation;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * 
 * Example with stream creation from BufferedReader to read lines from text
 * file.
 * 
 * @author Valdas Zigas
 */
public class StreamFromBufferedReader {

	public static void main(String... args) {

		try (BufferedReader reader = Files.newBufferedReader(Paths
				.get(StreamFromBufferedReader.class.getResource("File.txt")
						.toURI()), StandardCharsets.UTF_8);
				Stream<String> linesStream = reader.lines();) {

			linesStream.forEach(System.out::println);

		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
	}
}
