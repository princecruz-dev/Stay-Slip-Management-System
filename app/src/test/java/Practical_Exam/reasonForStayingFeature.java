package Practical_Exam;

import java.util.Scanner;

public class reasonForStayingFeature {

    public static void runFeature(Scanner scanner) {


        System.out.println();
        System.out.println("===== REASON FOR STAYING =====");
        System.out.print("Enter reason for staying: ");

        scanner.nextLine();

        String reason = scanner.nextLine();
        System.out.println(reason);

        System.out.println("Reason recorded: " + reason);
    }
}