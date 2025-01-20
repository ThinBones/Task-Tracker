import java.util.*;

public class Main {
	private ArrayList<Task> taskList;
	private Scanner scanner;

	public static void main(String[] args) {
		greet();
		while (true) {
			askOptions();
		}
	}

	public static void greet() {
		System.out.println("Hello there!");
	}

	public static void askOptions() {
		System.out.println("What would you like to do?");
		System.out.println("1. Make task.\n2. Clear task.\n" +
				"3. View tasks.\n4. Edit task.\n5. Exit.");
		int resp = scanner.nextInt();
	}


}
