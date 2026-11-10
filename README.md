LabFitnessTracker

This Java program demonstrates inheritance. It reads a workout type, a duration, and a distance from the user, then displays a workout summary and calculates the calories burned.

How to Run
1. Open the project in your IDE
2. Run Main.java
3. Enter the workout type, duration (minutes), and distance (km)
4. View the workout summary and calculated calories
   
# Example Output
Enter workout type: Morning Run
Enter duration (minutes): 45
Enter distance (km): 6.5
--- Workout Summary ---
Workout: Morning Run
Duration: 45 minutes
Distance: 6.5 km
Calories burned: 390.0

# Code Structure
Workout (parent class) stores the type and duration and has a showWorkout() method.
RunningWorkout (child class) uses extends to inherit from Workout, adds a distance field, and has a showDetails() method that calls showWorkout().
Main uses a Scanner to collect input, creates a RunningWorkout object, and calls showDetails().

# Code Explanation
java
class RunningWorkout extends Workout {
    double distance;

    public void showDetails() {
        showWorkout();
        double calories = distance * 60;
        System.out.println("Calories burned: " + calories);
    }
}

RunningWorkout inherits type, duration, and showWorkout() from Workout. showDetails() calls the inherited method, then calculates calories burned as distance multiplied by 60 and prints the result.

# Author
Victor
