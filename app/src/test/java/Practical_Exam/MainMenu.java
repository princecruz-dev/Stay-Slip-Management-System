package Practical_Exam;

import java.util.Scanner;

public class MainMenu {

    // Main system
    public void start(Scanner scanner) {

        boolean isRunning = true;

        while (isRunning) {

            System.out.println();
            System.out.println("========================================");
            System.out.println("       STAY SLIP REQUEST SYSTEM");
            System.out.println("========================================");
            System.out.println("1. Stay Slip Request");
            System.out.println("2. Reason for Staying");
            System.out.println("3. SBMO Approval");
            System.out.println("4. Teacher Approval");
            System.out.println("5. Exit");
            System.out.println("========================================");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();


            System.out.println(choice);


            if (choice == 1) {

                staySlipRequestFeature.runFeature(scanner);

            } else if (choice == 2) {

                reasonForStayingFeature.runFeature(scanner);

            } else if (choice == 3) {

                sbmoApprovalFeature.runFeature(scanner);

            } else if (choice == 4) {

                teacherApprovalFeature.runFeature(scanner);

            } else if (choice == 5) {

                System.out.println("Exiting Stay Slip Request System...");
                isRunning = false;

            } else {

                System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("System closed.");
    }
}