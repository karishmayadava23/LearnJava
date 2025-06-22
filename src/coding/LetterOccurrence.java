package coding;

import java.util.HashMap;
import java.util.Map;

public class LetterOccurrence {

	public static void main(String[] args) {
		String input = "Test Automation";

		// convert to lowercase and remove spaces
		input = input.toLowerCase().replaceAll(" ", "");
		System.out.println(input);

		Map<Character, Integer> letterCount = new HashMap<>();
		for (char c : input.toCharArray()) {
			if (Character.isLetter(c)) {
				letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
			}
		}

		// Print the occurences
		for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());

		}
	}

}
