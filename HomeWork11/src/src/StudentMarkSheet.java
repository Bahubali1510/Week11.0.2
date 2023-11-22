import java.util.Scanner;

public class StudentMarkSheet {
    public static void main(String[] args) {
         double marks;
        Scanner sc = new Scanner(System.in);
        StudentMarkSheet S = new StudentMarkSheet();


        System.out.println("Enter student name");
        String name = S.toString();

        //System.out.println("Enter science marks");
       // int marks1 = S.nextInt();

        System.out.println("Enter english marks");
        int marks2 = sc.nextInt();

        System.out.println("Enter maths marks");
        int marks3 = sc.nextInt();

        System.out.println("Enter science marks");
        int marks4 = sc.nextInt();

        int totalMarks = marks2+marks3+marks4;
        double averageMarks= totalMarks/3.0;


        System.out.println("Math Marks: " + marks3);
        System.out.println("English Marks: " + marks2);
        System.out.println("Science Marks: " + marks4);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);

        // Grading
        System.out.print("Grade: ");
        if (averageMarks >= 90) {
            System.out.println("A");
        } else if (averageMarks >= 80) {
            System.out.println("B");
        } else if (averageMarks >= 70) {
            System.out.println("C");
        } else if (averageMarks >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }








    }


}
