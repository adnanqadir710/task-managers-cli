import java.util.ArrayList;
import java.util.Scanner;

public class AddTask {
    // Task list store karne ke liye
    static ArrayList<String> tasks = new ArrayList<>();

    // Add task function
    public static void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added successfully: " + task);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a task to add: ");
        String task = sc.nextLine();

        addTask(task);

        sc.close();
    }
}
