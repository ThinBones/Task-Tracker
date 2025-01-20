import java.util.*;

public class Main {
	private static ArrayList<Task> taskList;
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		taskList = new ArrayList<>();
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
		switch (resp) {
			case 1:
				makeTask();
				break;
			case 2:
				clearTask();
				break;
			case 3:
				viewTasks();
				break;
			case 4:
				editTask();
				break;
			case 5:
				scanner.close();
				System.exit(0);
		}
	}
	
	public static void makeTask() {
		String taskTime = "";
		int hour = 0;
		int minute = 0;
		String taskName;
		String taskDescription;
		boolean validTime = false;

		while (!validTime) {
			System.out.println("What hour do you want this task to be done by?");
			try {
				hour = scanner.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("Input an integer.");
				scanner.nextLine();
			}

			System.out.println("What minute do you want this task to be done by?");
			try {
				minute = scanner.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("Input an integer.");
				scanner.nextLine();
			}

			validTime = validTimeChecker(hour, minute);

			if (!validTime) {
				System.out.println("Time entered is not valid, "
						+ "please try again.");
			}
		}

		taskTime = hour + ":" + minute;

		System.out.println("What should this task be named?");
		taskName = scanner.next();	

		System.out.println("Write a description for this task.");
		taskDescription = scanner.next();
		

		taskList.add(new Task(taskTime, taskName, taskDescription));
	}

	public static boolean validTimeChecker(int hr, int min) {
		if (hr < 24 && hr >= 0 && min < 60 && min >= 0) {
			return true;
		}

		return false;
	}

	public static void clearTask() {
		
	}

	public static void viewTasks() {

	}

	public static void editTask() {

	}
}
