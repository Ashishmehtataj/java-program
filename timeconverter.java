import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();
		int hours = 24;
		int totalhourswithdays = days*hours;

		long minute= totalhourswithdays*60;
		long sec = minute*60;
		System.out.println(sec);		
		//your code goes here
		
	}
}
