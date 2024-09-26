
    import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        int totalMarks = calculateTotalMarks(scanner, numSubjects);
        double averagePercentage = calculateAverage(totalMarks, numSubjects);

        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Your Grade: " + determineGrade(averagePercentage));

        scanner.close();
    }

    private static int calculateTotalMarks(Scanner scanner, int numSubjects) {
        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for the subject " + i + " (out of 100): ");
            totalMarks += scanner.nextInt();
        }
        return totalMarks;
    }

    private static double calculateAverage(int totalMarks, int numSubjects) {
        return (double) totalMarks / numSubjects;
    }

    private static String determineGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "A+";
        } else if (averagePercentage >= 80) {
            return "A";
        } else if (averagePercentage >= 70) {
            return "B+";
        } else if (averagePercentage >= 60) {
            return "B";
        } else if (averagePercentage >= 50) {
            return "C";
        } else if (averagePercentage >= 40) {
            return "D";
        } else {
            return "F";
        }
    }
}

    

