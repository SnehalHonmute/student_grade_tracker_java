import java.util.*;

public class StudentGradeTracker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("Enter grades (0-100). Enter -1 to stop.");

        while (true) {
            System.out.print("Enter grade: ");
            int grade = sc.nextInt();

            if (grade == -1) {
                break;
            } else if (grade >= 0 && grade <= 100) {
                grades.add(grade);
            } else {
                System.out.println("Invalid grade. Please enter a number between 0 and 100.");
            }
        }

        if (grades.isEmpty()) {
            System.out.println("No grades entered.");
        } else {
            int total = 0, max = grades.get(0), min = grades.get(0);

            for (int g : grades) {
                total += g;
                if (g > max) max = g;
                if (g < min) min = g;
            }

            double avg = (double) total / grades.size();

            System.out.println("\nGrades: " + grades);
            System.out.printf("Average: %.2f\n", avg);
            System.out.println("Highest: " + max);
            System.out.println("Lowest: " + min);
        }

        sc.close();
    }
}
