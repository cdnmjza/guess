import java.util.Scanner;

public class guess {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = (int)(Math.random()* 100 + 1);
		
		System.out.println("Guess what my number is? " +i);
		
		if(i < 88) {
			System.out.println("Guess Higher.");
		} else if (i > 88) {
			System.out.println("Guess Lower.");
		} else if (i == 88) {
			System.out.println("Congratulations! You guessed the right number.");
		}
		scanner.close();
	}
}


