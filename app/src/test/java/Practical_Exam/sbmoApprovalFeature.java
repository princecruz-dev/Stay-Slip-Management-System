package Practical_Exam;

import java.util.Scanner;

public class sbmoApprovalFeature {
    public static void runFeature(Scanner scanner) {
        boolean validDecision = false;

        System.out.println("--- SBMO APPROVAL ---");

        while (validDecision) {
            System.out.println("Enter your ID: ");
            String yourID = scanner.nextLine().trim();
            System.out.println("Enter SBMO decision (Approve / Reject): ");
            String sbmoDecision = scanner.nextLine().trim().toLowerCase();

            System.out.println("\n--- Process SBMO Review ---");

            if (sbmoDecision.equals("approve") || sbmoDecision.equals("a")) {
                System.out.println("REASON APPROVED");
                System.out.println("Student ID: " + yourID);
                System.out.println("Stay slip approved by SBMO");
                validDecision = true;
            } else if (sbmoDecision.equals("reject") || sbmoDecision.equals("r")) {
                System.out.println("REASON REJECTED");
                System.out.println("Student ID " + yourID);
                System.out.println("Stay slip rejected by SBMO");
                validDecision = true;
            } else {
                System.out.println("INVALID! Enter 'Approve' or 'Reject'.");
                System.out.println("Try again.");
            }
        }
    }
}
