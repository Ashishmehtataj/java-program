import java.util.*;
class aa{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your full name : ");
		String text = input.nextLine();
		char[] arr = text.toCharArray();

		System.out.println();
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[arr.length-i-1]);
		}
	}

}
