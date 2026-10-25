void main() {
    // create Scanner in for console input
    java.util.Scanner in = new java.util.Scanner(System.in);
    String choice = "";

    // display menu prompt
    System.out.println("Party Affiliation Menu:");
    System.out.println("D - Democrat");
    System.out.println("R - Republican");
    System.out.println("I - Independent");
    System.out.print("Choose your party affiliation [D/R/I]: ");

    // read choice input
    choice = in.nextLine();

    // cascaded if chain for D, R, I, or Other
    if (choice.equalsIgnoreCase("D")) {
        System.out.println("You get a Democratic Donkey.");
    } else if (choice.equalsIgnoreCase("R")) {
        System.out.println("You get a Republican Elephant.");
    } else if (choice.equalsIgnoreCase("I")) {
        System.out.println("You get an Independent Person.");
    } else {
        System.out.println("You chose Other.");
    }

    in.close();
}
