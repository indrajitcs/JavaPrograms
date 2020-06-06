package codes;

public class Remove_3_duplicates {

	public static void main(String[] args) {

		// input

		StringBuilder inputString = new StringBuilder("aabbbaccddddc");

		// processing

		removeTriplet(inputString);

		// output

		System.out.println(inputString);

	}

	private static void removeTriplet(StringBuilder input) {

		int start = 0;

		while (start < input.length() - 2) {

			if (input.charAt(start) == input.charAt(start + 1) && input.charAt(start) == input.charAt(start + 2)) {

				input.deleteCharAt(start);

				input.deleteCharAt(start);

				input.deleteCharAt(start);

				start = (start - 2) > 0 ? (start - 2) : 0;

			} else {

				start = start + 1;

			}

		}

	}

}
