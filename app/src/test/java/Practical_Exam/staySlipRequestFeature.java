package Practical_Exam;

import java.util.Scanner;

public class staySlipRequestFeature {
    //MAINGAT logic coding
    public static void runFeature(Scanner scanner) {
        boolean isAccepted = false;

        System.out.println("=== Stay Slip Request System ===");

        while (!isAccepted) {
            System.out.println("Enter your Student ID: ");
            String studentID = scanner.nextLine().trim();

            System.out.println("Enter the time you will stay (e.g. 3:00 PM): ");
            String reasonStay = scanner.nextLine().trim();

            System.out.println("Enter the time you will go out (e.g. 7:00 PM): ");
            String timeDismiss = scanner.nextLine().trim();

            System.out.println("Enter the subject you're staying to (e.g. CLED): ");
            String subjectStay = scanner.nextLine().trim();

            System.out.println("\n--- Validating your request ---");

            if (reasonStay.isEmpty() || timeDismiss.isEmpty() || subjectStay.isEmpty()) {
                System.out.println("STATUS: REJECTED!");
                System.out.println("Reason: You must enter both times, and subject Please try again.\n");
            } else {
                System.out.println("STATUS: ACCEPTED!");
                System.out.println("Student ID: " + studentID);
                System.out.println("Time Stay: " + reasonStay);
                System.out.println("Time Out: " + timeDismiss);
                System.out.println("Subject " + subjectStay);

                isAccepted = true;
            }
        }
    }
}