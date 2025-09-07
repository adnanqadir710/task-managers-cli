import java.util.ArrayList;

public class ListTask {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("Finish GitHub Assignment");
        tasks.add("Submit Report");
        tasks.add("Prepare Presentation");

        System.out.println("Your Tasks:");
        for (String task : tasks) {
            System.out.println("- " + task);
        }
    }
}
