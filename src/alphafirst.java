public class alphafirst {
	public static void main(String[] args) {
		String input = "a1b2c3";
		StringBuilder alphabets = new StringBuilder();
		StringBuilder remaining = new StringBuilder();

		for (char character : input.toCharArray()) {
			if (Character.isLetter(character)) {
				alphabets.append(character);
			} else {
				remaining.append(character);
			}
		}

		System.out.println(alphabets.append(remaining));
	}
}
