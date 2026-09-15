package quarter2;
import org.junit.Test;

public class MaingatProfileTest {
    @Test
    public void MyProfile() {
        String myName = "Neil";
        String favFood = "French Fries";
        String favPlace = "Binondo";
        int myAge = 16;

        System.out.println("--- MY PROFILEEEE ---");
        System.out.println("Hello! my Name is " + myName + ", and I am " + myAge + " years old.");
        System.out.println("My favorite food is " + favFood + " and my favorite place to go to is " + favPlace + "!");
    }
}
