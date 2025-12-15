import java.util.Scanner;

class Mall {
    private String[] storage = new String[50];
    private double[] price = new double[50];
    private int[] quantity = new int[50];
    private int count = 0;
    private double sum = 0;
    private String maker;
    private String date;

    Mall() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of bill maker: ");
        maker = input.nextLine();

        System.out.print("Enter the date (DD-MM-YYYY): ");
        date = input.nextLine();

        System.out.print("\nEnter how many products you want to enter: ");
        int product = input.nextInt();
        input.nextLine(); // clear newline

        System.out.println("\nPRODUCT ENTRY\n");

        if (product < 1) {
            System.out.println("Please enter at least 1 product.");
            return;
        }

        for (int i = 0; i < product; i++) {
            System.out.print("Product #" + (i + 1) + " Name: ");
            storage[i] = input.nextLine();

            System.out.print("Price of " + storage[i] + ": Rs ");
            price[i] = input.nextDouble();

            System.out.print("Quantity of " + storage[i] + ": ");
            quantity[i] = input.nextInt();

            input.nextLine(); // clear newline
            System.out.println("---------------------------------------------");

            sum += price[i] * quantity[i];
            count++;
        }

        input.close();
    }

    void showDetails() {
        System.out.println("\n\nNoor Bakery Invoice");
        System.out.printf("Date: %-15s   Employee: %s\n", date, maker);
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-4s %-20s %-10s %-10s %-12s\n", "No.", "Product", "Price", "Qty", "Total");
        System.out.println("-------------------------------------------------------------");

        for (int k = 0; k < count; k++) {
            double total = price[k] * quantity[k];
            System.out.printf("%-4d %-20s Rs%-9.2f %-10d Rs%-10.2f\n", (k + 1), storage[k], price[k], quantity[k],
                    total);
        }

        System.out.println("-------------------------------------------------------------");
        System.out.printf("Total Items: %d\n", count);
        System.out.printf("Grand Total: Rs %.2f\n", sum);
        System.out.println("Branch Code : 2222-2234343");
        System.out.println("-------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Mall obj = new Mall();
        obj.showDetails();
    }
}
