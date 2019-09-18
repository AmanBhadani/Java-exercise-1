import java.util.Scanner;

class Menu {
public static void main (String[] args)
{

char choice;

Scanner input = new Scanner(System.in);
while(true)
{	
	System.out.println("Enter 1 for Palindrome.");
	System.out.println("Enter 2 for Pattern.");
	System.out.println("Enter 3 for Repeatstring.");
	System.out.println("Enter 4 for Reverse.");
	System.out.println("Enter @ for Exit");
	System.out.println("Enter 5 for Sorting");
	System.out.println("Enter 6 for Sum.");
	System.out.println("Enter 7 for VowelConsonent");
	System.out.println("Enter 8 for Datatype");
	System.out.println("Enter 9 for EvenOdd");
	System.out.println("Enter 0 for Guess.");

	String s = input.next();
	choice = s.charAt(0);


	switch(choice)
	{
		case '@':
		System.exit(0);
		case '0':
		Guess.main(null);
		break;
		case '1':
		Pal.main(null);
		break;
		case '2':
		Pattern.main(null);
		break;
		case '3':
		Repstr.main(null);
		break;
		case '4':
		Reverse.main(null);
		break;
		case '5':
		Sort.main(null);
		break;
		case '6':
		Sum.main(null);
		break;
		case '7':
		Vc.main(null);
		break;
		case '8':
		Datatype.main(null);
		break;
		case '9':
		CheckEvenOdd.main(null);
		break;

		default:
		System.out.println("Error");
	}
}


}
}