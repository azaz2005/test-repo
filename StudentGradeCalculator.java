
import java.util.Arrays;

public class StudentGradeCalculator {

    public static double calculateAverage(int[] marks) {
        if (marks == null || marks.length == 0) {
            throw new IllegalArgumentException("Marks cannot be empty");
        }

        int total = 0;

        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                throw new IllegalArgumentException("Marks must be between 0 and 100");
            }
            total += mark;
        }

        return (double) total / marks.length;
    }

    public static String calculateGrade(double average) {
        if (average >= 90) return "A";
        if (average >= 75) return "B";
        if (average >= 60) return "C";
        if (average >= 40) return "D";
        return "F";
    }

    public static void printResult(String studentName, int[] marks) {
        double average = calculateAverage(marks);
        String grade = calculateGrade(average);

        System.out.println("Student: " + studentName);
        System.out.println("Marks: " + Arrays.toString(marks));
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + (grade.equals("F") ? "Fail" : "Pass"));
    }

    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 92, 88};
        printResult("Rahul", marks);
    }
}

