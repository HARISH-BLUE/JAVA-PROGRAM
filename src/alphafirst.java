import java.util.Scanner;

public class alphafirst {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
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
		scanner.close();
	}
}
