import java.util.Scanner;

public class PositiveNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = sc.nextInt();
		
		if(number>=0)
			System.out.println("Positive");
		else
			System.out.println("Negative");

		System.out.println("Changed by Aishik!");
	}
}