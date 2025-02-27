import java.util.Scanner;

public class MenuDrivenProgram {

	public static void displayMenu() {
	System.out.printIn("\nMenu: ");
	System.out.printIn("1. Greet User");
	System.out.printIn("2. Check Even or Odd");
	System.out.printIn("3. Exit");
	System.out.print("Enter your choice: ");
}
	public static int getUserInput() {
	Scanner scanner = new Scanner(System.in);
	return scanner.nextInt();

}
	public state void greetUser() {
	System.out.printIn("Hello! welcome to the program: ");
}
	public static void checkEvenOdd() {
	Scanner scanner = new Scanner(System.in);
	int number = scanner.nextIn();
	if (number % 2 == 0) {
	System.out.printIn("The number" + number + " is even");
}	else{
	System.out.printIn("The number" + number + " is Odd");
}
}
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int choice;
	do {
	displayMenu();
	choice = getUserInput();
	switch (choice) {
	case 1:
	greetUser();
	break;
	case 2:
	checkEvenOdd();
	break;
	case 3:
	System.out.printIn("Existing the program. Goodbye!");
	break;

	default:
	System.out.printIn("Invalid choice. Please try again.");
}
}	while (choice != 3);
	scanner.close();
}
}
	