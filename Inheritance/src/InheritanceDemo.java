import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();

        // 3 Hourly Workers
        workers.add(new Worker("Alice", "Smith", "001", "Ms.", 1990, 20.0));
        workers.add(new Worker("Bob", "Jones", "002", "Mr.", 1985, 25.0));
        workers.add(new Worker("Charlie", "Brown", "003", "Dr.", 1975, 22.5));

        // 3 Salary Workers
        workers.add(new SalaryWorker("Dana", "White", "004", "Prof.", 1980, 0, 52000));
        workers.add(new SalaryWorker("Evan", "Taylor", "005", "Hon.", 1970, 0, 65000));
        workers.add(new SalaryWorker("Fiona", "Green", "006", "Ms.", 1992, 0, 48000));

        double[] weeklyHours = {40.0, 50.0, 40.0};

        for (int week = 0; week < weeklyHours.length; week++) {
            System.out.printf("\n--- Week %d (%.0f hours) ---\n", week + 1, weeklyHours[week]);
            for (Worker w : workers) {
                System.out.println(w.getFirstName() + " " + w.getLastName());
                w.displayWeeklyPay(weeklyHours[week]);
                System.out.println();
            }
        }
    }
}
