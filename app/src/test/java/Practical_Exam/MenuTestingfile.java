package Practical_Exam;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class MainSystemTest {
    // paki-sabi po muna sa'kin kung gagalawin niyo'to

    @Test
    public void testCompleteSystemFlow() {


        StringBuilder simulatedUserInput = new StringBuilder();

        System.out.println(
                "--- GENERATING SIMULATED USER INPUTS ---"
        );


        int interactionCount = 1;

        while (interactionCount <= 5) {

            System.out.println(
                    "Generating interaction #"
                            + interactionCount
            );

            if (interactionCount == 1) {

                // Main Menu → Student ID
                simulatedUserInput.append("1\n");

                // Student ID
                simulatedUserInput.append("20250001\n");

            } else if (interactionCount == 2) {

                // Main Menu para sa Stay Slip Request
                simulatedUserInput.append("2\n");

                // Submit request
                simulatedUserInput.append("1\n");

            } else if (interactionCount == 3) {

                // Main Menu sa Reason for Staying
                simulatedUserInput.append("3\n");

                // Sa Reason'to
                simulatedUserInput.append(
                        "School activity requires me to stay.\n"
                );

            } else if (interactionCount == 4) {

                // Main Menu sa SBMO Approval
                simulatedUserInput.append("4\n");

                // Approve
                simulatedUserInput.append("1\n");

            } else {

                // Main Menu → Teacher Approval
                simulatedUserInput.append("5\n");

                // Approve
                simulatedUserInput.append("1\n");
            }

            interactionCount++;
        }


        System.out.println(
                "Generating input to Exit the system..."
        );

        simulatedUserInput.append("6\n");

        System.out.println(
                "--- INPUT GENERATION COMPLETE ---"
        );


        ByteArrayInputStream inputStream =
                new ByteArrayInputStream(
                        simulatedUserInput
                                .toString()
                                .getBytes()
                );


        Scanner masterScanner =
                new Scanner(inputStream);


        MainMenu mainMenu =
                new MainMenu();


        mainMenu.start(masterScanner);


        System.out.println(
                "--- AUTOMATED SYSTEM TEST COMPLETE ---"
        );
    }
}