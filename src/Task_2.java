void main() {
    // create Scanner in for console input
    java.util.Scanner in = new java.util.Scanner(System.in);
    int birthMonth = 0;
    String trash = "";

    // prompt user for birth month
    System.out.print("Enter your birth month (1 - 12): ");

    // check if input is integer
    if (in.hasNextInt()) {
        // read birth month and clear buffer
        birthMonth = in.nextInt();
        in.nextLine();

        // if birthMonth >= 1 AND birthMonth <= 12 output month else output error
        if (birthMonth >= 1 && birthMonth <= 12) {
            System.out.println("Your birth month is: " + birthMonth);
        } else {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
    } else {
        // bad input handling
        trash = in.nextLine();
        System.out.println("\nYou entered: " + trash);
        System.out.println("Run the program again and enter a valid whole number!");
    }

    in.close();
}
