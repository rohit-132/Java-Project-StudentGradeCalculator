import java.util.Scanner;

public class GradeCalculator  {

    public static String calculateGrade(double averagePercentage) 
    {
        if (averagePercentage >= 90) 
        {
            return "O";
        }
         else if (averagePercentage >= 80) 
        {
            return "A+";
        } 
        else if (averagePercentage >= 70) 
        {
            return "A";
        } 
        else if (averagePercentage >= 60) {
            return "B+";

        } 
        else if (averagePercentage >= 50)
         {
            return "B";
        } 
        else if (averagePercentage >= 40) 
        {
            return "C";
        } else 
        {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;
        double averagePercentage;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Please enter marks between 0 and 100.");
                i--;  
                continue;
            }

            totalMarks += marks; 
        }

        averagePercentage = (double) totalMarks / numSubjects;

        String grade = calculateGrade(averagePercentage);

        System.out.println("\nTotal Marks: " + totalMarks + " out of " + (numSubjects * 100));
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
