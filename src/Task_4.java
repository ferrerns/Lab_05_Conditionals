public class Task_4 {
}

void main() {
    // create Scanner in for console input
    java.util.Scanner in = new java.util.Scanner(System.in);
    int age = 0;
    String trash = "";

    // prompt user for age
    System.out.print("Enter your age: ");

    // check if input is integer
    if (in.hasNextInt()) {
        // read age and clear buffer
        age = in.nextInt();
        in.nextLine();

        // if age >= 21 then display wrist band message
        if (age >= 21) {
            System.out.println("You get a paper wrist band.");
        }
    } else {
        // bad input handling
        trash = in.nextLine();
        System.out.println("\nYou entered: " + trash);
        System.out.println("Run the program again and enter a valid numeric age!");
    }

    in.close();
}
