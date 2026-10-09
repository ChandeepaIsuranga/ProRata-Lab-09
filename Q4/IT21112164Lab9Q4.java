import java.util.Scanner;

public class IT21112164Lab9Q4 {

    public static double calcFinalMark(double assignmentMark, double examPaperMark) {
        return (assignmentMark * 0.30) + (examPaperMark * 0.70);
    }

    public static String findGrades(double finalMark) {
        if (finalMark >= 75) {
            return "A";
        } else if (finalMark >= 60) {
            return "B";
        } else if (finalMark >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    public static void printDetails(String name, double finalMark, String grade) {
        System.out.printf("%-18s%-15.2f%s%n", name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = new String[5];
        double[] assignmentMarks = new double[5];
        double[] examPaperMarks = new double[5];
        double[] finalMarks = new double[5];
        String[] grades = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = input.nextLine();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            assignmentMarks[i] = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            examPaperMarks[i] = input.nextDouble();
            input.nextLine();

            finalMarks[i] = calcFinalMark(assignmentMarks[i], examPaperMarks[i]);
            grades[i] = findGrades(finalMarks[i]);

            System.out.println();
        }

        System.out.printf("%-18s%-15s%s%n", "Name", "Final Mark", "Grade");

        printDetails(names[0], finalMarks[0], grades[0]);
	printDetails(names[1], finalMarks[1], grades[1]);
        printDetails(names[2], finalMarks[2], grades[2]);
        printDetails(names[3], finalMarks[3], grades[3]);
        printDetails(names[4], finalMarks[4], grades[4]);

        input.close();
    }
}