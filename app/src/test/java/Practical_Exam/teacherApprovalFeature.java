package Practical_Exam;

import java.util.Scanner;

public class teacherApprovalFeature {
    //ABELLAR logic coding

    public static void runFeature(Scanner scanner) {
        TeacherApprovalComponent();
    }

    public static void TeacherApprovalComponent() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter Teacher Name: ");
        String teacherName = scanner.nextLine();

        boolean teacherApproval = false;
        boolean validInput;

        do {
            System.out.print("Teacher Approval? (true/false): ");

            if (!scanner.hasNextBoolean()) {
                System.out.println("Invalid input. Please enter true or false.");
                scanner.next();
                validInput = false;
            } else {
                teacherApproval = scanner.nextBoolean();
                validInput = true;
            }

        } while (!validInput);

        scanner.nextLine();

        System.out.print("Enter Teacher Remarks: ");
        String teacherRemarks = scanner.nextLine();

        System.out.println("\n--- Teacher Approval Details ---");
        System.out.println("Student ID: " + studentId);
        System.out.println("Teacher Name: " + teacherName);
        System.out.println("Teacher Approval: " +
                (teacherApproval ? "Approved" : "Rejected"));
        System.out.println("Teacher Remarks: " + teacherRemarks);

        scanner.close();
    }
}