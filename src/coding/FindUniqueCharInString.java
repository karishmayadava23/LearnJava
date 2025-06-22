package coding;

import java.util.HashMap;
import java.util.Map;

public class FindUniqueCharInString {
	public static void main(String[] args) {
		String input = "racecarkl";
		Map<Character, Integer> charCounts = new HashMap<>();
		for (char c : input.toCharArray()) {
			charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
		}
//		for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
//			if (entry.getValue() == 1) {
//				System.out.println(entry.getKey() + " ");
//			}
//		}
//		System.out.println();

		for (char c : input.toCharArray()) {
			if (charCounts.get(c) == 1) {
				System.out.println("Character that appears only once: " + c);
				// break;
			}
		}
	}
}
