void main() {
    // create Scanner in for console input
    Scanner in = new Scanner(System.in);
    double itemPrice = 0.0;
    double shippingCost = 0.0;
    double totalPrice = 0.0;
    String trash = "";

    // prompt user for item price
    System.out.print("Enter the price of the item: $");

    // check if input is double
    if (in.hasNextDouble()) {
        // read item price and clear buffer
        itemPrice = in.nextDouble();
        in.nextLine();

        // if itemPrice >= 100 then shipping is 0, else shipping is 2% of itemPrice
        if (itemPrice >= 100.0) {
            shippingCost = 0.0;
        } else {
            shippingCost = itemPrice * 0.02;
        }

        // calculate total price
        totalPrice = itemPrice + shippingCost;

        // display shipping cost and total price
        System.out.println("Shipping Cost: $" + shippingCost);
        System.out.println("Total Price: $" + totalPrice);
    } else {
        // bad input handling
        trash = in.nextLine();
        System.out.println("\nYou entered: " + trash);
        System.out.println("Run the program again and enter a valid numeric price!");
    }

    in.close();
}