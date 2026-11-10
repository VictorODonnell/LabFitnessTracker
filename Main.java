import java.util.Scanner;

class Workout {
    String type;
    int duration; // in minutes

    public void showWorkout() {
        System.out.println("Workout: " + type);
        System.out.println("Duration: " + duration + " minutes");
    }
}

class RunningWorkout extends Workout {
    double distance; // in km

    public void showDetails() {
        System.out.println("--- Workout Summary ---");
        showWorkout();
        System.out.println("Distance: " + distance + " km");
        double calories = distance * 60;
        System.out.println("Calories burned: " + calories);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter workout type: ");
        String type = scanner.nextLine();

        System.out.print("Enter duration (minutes): ");
        int duration = scanner.nextInt();

        System.out.print("Enter distance (km): ");
        double distance = scanner.nextDouble();

        RunningWorkout run = new RunningWorkout();
        run.type = type;
        run.duration = duration;
        run.distance = distance;

        run.showDetails();

        scanner.close();
    }
}
